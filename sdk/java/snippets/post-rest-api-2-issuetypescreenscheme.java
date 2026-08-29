import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Post2IssuetypescreenschemeV1OperationSpec;

public class Post2IssuetypescreenschemeV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueTypeScreenSchemesApi().post2IssuetypescreenschemeV1(new Post2IssuetypescreenschemeV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.payload(/* IssueTypeScreenSchemeDetails */); // payload: required - An issue type screen scheme bean.

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
                case Post2IssuetypescreenschemeV1Response.CreatedResponse r -> {
                    // handle 201, r.data() contains typed payload
                }
                case Post2IssuetypescreenschemeV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Post2IssuetypescreenschemeV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Post2IssuetypescreenschemeV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Post2IssuetypescreenschemeV1Response.Status409Response r -> {
                    // handle 409, r.data() contains typed payload
                }
                case Post2IssuetypescreenschemeV1Response.Unknown r -> {
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
