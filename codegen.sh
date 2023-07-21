#!/bin/bash

# setup
PROJECT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"

# test
case $1 in
  "update")
    echo "> updating openapi spec"

    # source: https://developer.atlassian.com/cloud/jira/platform/rest/v2/intro/#version
    RESTV2_SPEC="$PROJECT_DIR/rest-v2/openapi.json"
    curl -o "$RESTV2_SPEC" https://dac-static.atlassian.com/cloud/jira/platform/swagger.v3.json?_v=1.6457.0-0.1278.0
    jq '.info.title="Jira REST V2"' "$RESTV2_SPEC" | sponge "$RESTV2_SPEC" # overwrite name
    jq '.components.schemas.Attachment.properties.size."x-alias"="fileSize"' "$RESTV2_SPEC" | sponge "$RESTV2_SPEC" # size is usually a reserved word on a Map
    jq '.paths."/rest/api/2/issuesecurityschemes/search".get.description="Returns a paginated list of issue security schemes."' "$RESTV2_SPEC" | sponge "$RESTV2_SPEC" # description is broken
    jq 'del(.components.schemas.Fields.properties.issuetype)' "$RESTV2_SPEC" | sponge "$RESTV2_SPEC" # remove duplicate property
    jq 'walk(if type == "object" and .additionalProperties and (.properties | length > 0) then del(.additionalProperties) else . end)' "$RESTV2_SPEC" | sponge "$RESTV2_SPEC" # remove additionalProperties from all schemas

    # source: https://developer.atlassian.com/cloud/jira/platform/rest/v3/intro/#version
    RESTV3_SPEC="$PROJECT_DIR/rest-v3/openapi.json"
    curl -o "$RESTV3_SPEC" https://dac-static.atlassian.com/cloud/jira/platform/swagger-v3.v3.json?_v=1.6457.0-0.1278.0
    jq '.info.title="Jira REST V3"' "$RESTV3_SPEC" | sponge "$RESTV3_SPEC" # overwrite name
    jq '.components.schemas.Attachment.properties.size."x-alias"="fileSize"' "$RESTV3_SPEC" | sponge "$RESTV3_SPEC" # size is usually a reserved word on a Map
    jq '.paths."/rest/api/3/issuesecurityschemes/search".get.description="Returns a paginated list of issue security schemes."' "$RESTV3_SPEC" | sponge "$RESTV3_SPEC" # description is broken
    jq 'del(.components.schemas.Fields.properties.issuetype)' "$RESTV3_SPEC" | sponge "$RESTV3_SPEC" # remove duplicate property
    jq 'walk(if type == "object" and .additionalProperties and (.properties | length > 0) then del(.additionalProperties) else . end)' "$RESTV3_SPEC" | sponge "$RESTV3_SPEC" # remove additionalProperties from all schemas
    ;;

  "generate")
    echo "> running code generation"
    docker run -it --rm -v $(pwd):/project ghcr.io/primelib/primecodegen:0.0.1 \
        primecodegen generate \
        -e auto \
        -i "/project/rest-v2/openapi.json" \
        -o "/project/rest-v2" \
        -c "/project/rest-v2/openapi-generator.json" \
        --openapi-normalizer SIMPLIFY_ONEOF_ANYOF=true \
        --openapi-normalizer SIMPLIFY_BOOLEAN_ENUM=true \
        --openapi-normalizer REMOVE_ANYOF_ONEOF_AND_KEEP_PROPERTIES_ONLY=true \
        --openapi-normalizer REFACTOR_ALLOF_WITH_PROPERTIES_ONLY=true \
        --skip-validate-spec

    docker run -it --rm -v $(pwd):/project ghcr.io/primelib/primecodegen:0.0.1 \
        primecodegen generate \
        -e auto \
        -i "/project/rest-v3/openapi.json" \
        -o "/project/rest-v3" \
        -c "/project/rest-v3/openapi-generator.json" \
        --openapi-normalizer SIMPLIFY_ONEOF_ANYOF=true \
        --openapi-normalizer SIMPLIFY_BOOLEAN_ENUM=true \
        --openapi-normalizer REMOVE_ANYOF_ONEOF_AND_KEEP_PROPERTIES_ONLY=true \
        --openapi-normalizer REFACTOR_ALLOF_WITH_PROPERTIES_ONLY=true \
        --skip-validate-spec
    ;;
esac
