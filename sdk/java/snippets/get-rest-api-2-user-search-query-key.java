import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2UserSearchQueryKeyV1OperationSpec;

public class Get2UserSearchQueryKeyV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.userSearchApi().get2UserSearchQueryKeyV1(new Get2UserSearchQueryKeyV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.query(/* String */); // query: required - The search query.
                    // spec.startAt(/* Long */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResult(/* Integer */); // maxResult: optional - The maximum number of items to return per page.

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
                case Get2UserSearchQueryKeyV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2UserSearchQueryKeyV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Get2UserSearchQueryKeyV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Get2UserSearchQueryKeyV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Get2UserSearchQueryKeyV1Response.Status408Response r -> {
                    // handle 408, r.data() contains typed payload
                }
                case Get2UserSearchQueryKeyV1Response.Unknown r -> {
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
