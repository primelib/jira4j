import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2ProjectV1OperationSpec;

public class Get2ProjectV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.projectsApi().get2ProjectV1(new Get2ProjectV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.expand(/* String */); // expand: optional - Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:   *  `description` Returns the project description.  *  `issueTypes` Returns all issue types associated with the project.  *  `lead` Returns information about the project lead.  *  `projectKeys` Returns all project keys associated with the project.
                    // spec.recent(/* Integer */); // recent: optional - Returns the user's most recently accessed projects. You may specify the number of results to return up to a maximum of 20. If access is anonymous, then the recently accessed projects are based on the current HTTP session.
                    // spec.properties(/* List<String> */); // properties: optional - A list of project properties to return for the project. This parameter accepts a comma-separated list.

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
                case Get2ProjectV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2ProjectV1Response.Unknown r -> {
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
