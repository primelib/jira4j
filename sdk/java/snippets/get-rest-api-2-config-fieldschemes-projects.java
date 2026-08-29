import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2ConfigFieldschemesProjectsV1OperationSpec;

public class Get2ConfigFieldschemesProjectsV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.fieldSchemesApi().get2ConfigFieldschemesProjectsV1(new Get2ConfigFieldschemesProjectsV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.startAt(/* Long */); // startAt: optional - The starting index of the returned projects. Base index: 0.
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of projects to return per page, maximum allowed value is 100.
                    // spec.projectId(/* List<Long> */); // projectId: required - List of project ids to filter the results by.

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
                case Get2ConfigFieldschemesProjectsV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2ConfigFieldschemesProjectsV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Get2ConfigFieldschemesProjectsV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Get2ConfigFieldschemesProjectsV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Get2ConfigFieldschemesProjectsV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Get2ConfigFieldschemesProjectsV1Response.Unknown r -> {
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
