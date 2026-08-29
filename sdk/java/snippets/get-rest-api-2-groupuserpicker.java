import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2GroupuserpickerV1OperationSpec;

public class Get2GroupuserpickerV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.groupAndUserPickerApi().get2GroupuserpickerV1(new Get2GroupuserpickerV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.query(/* String */); // query: required - The search string.
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of items to return in each list.
                    // spec.showAvatar(/* Boolean */); // showAvatar: optional - Whether the user avatar should be returned. If an invalid value is provided, the default value is used.
                    // spec.fieldId(/* String */); // fieldId: optional - The custom field ID of the field this request is for.
                    // spec.projectId(/* List<String> */); // projectId: optional - The ID of a project that returned users and groups must have permission to view. To include multiple projects, provide an ampersand-separated list. For example, `projectId=10000&projectId=10001`. This parameter is only used when `fieldId` is present.
                    // spec.issueTypeId(/* List<String> */); // issueTypeId: optional - The ID of an issue type that returned users and groups must have permission to view. To include multiple issue types, provide an ampersand-separated list. For example, `issueTypeId=10000&issueTypeId=10001`. Special values, such as `-1` (all standard issue types) and `-2` (all subtask issue types), are supported. This parameter is only used when `fieldId` is present.
                    // spec.avatarSize(/* String */); // avatarSize: optional - The size of the avatar to return. If an invalid value is provided, the default value is used.
                    // spec.caseInsensitive(/* Boolean */); // caseInsensitive: optional - Whether the search for groups should be case insensitive.
                    // spec.excludeConnectAddons(/* Boolean */); // excludeConnectAddons: optional - Whether Connect app users and groups should be excluded from the search results. If an invalid value is provided, the default value is used.
                    // spec.includeAiAgents(/* Boolean */); // includeAiAgents: optional - Whether AI Agents should be included in the search results. If an invalid value is provided, the default value is used.

                    // optional request behavior controls
                    // spec.failOnError(true); // default=true: true => throws ApiResponseException for error status codes (4xx/5xx)
                    // spec.extraHeader("X-Request-Id", "demo-request-id");
                    // spec.extraQueryParam("debug", "true");
                    // spec.overrideAuthMethod(...);
                }));

            // Direct data access (failOnError = true)
            var data = response.data();

            /*
            // Pattern matching (failOnError = false)
            switch (response) {
                case Get2GroupuserpickerV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2GroupuserpickerV1Response.Unknown r -> {
                    // handle unexpected codes
                }
            }
            */
        } catch (ApiResponseException ex) {
            // Triggered when failOnError=true and the API returns an error status.
            // ex.getStatusCode(), ex.getResponseBody()
        }
    }
}
