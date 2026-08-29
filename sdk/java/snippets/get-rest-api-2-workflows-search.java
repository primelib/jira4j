import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2WorkflowsSearchV1OperationSpec;

public class Get2WorkflowsSearchV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.workflowsApi().get2WorkflowsSearchV1(new Get2WorkflowsSearchV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.startAt(/* Long */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of items to return per page.
                    // spec.expand(/* String */); // expand: optional - Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `values.transitions` Returns the transitions that each workflow is associated with.
                    // spec.queryString(/* String */); // queryString: optional - String used to perform a case-insensitive partial match with workflow name.
                    // spec.orderBy(/* String */); // orderBy: optional - [Order](#ordering) the results by a field:   *  `name` Sorts by workflow name.  *  `created` Sorts by create time.  *  `updated` Sorts by update time.
                    // spec.scope(/* String */); // scope: optional - The scope of the workflow. Global for company-managed projects and Project for team-managed projects.
                    // spec.isActive(/* Boolean */); // isActive: optional - Filters active and inactive workflows.
                    // spec.projectId(/* Long */); // projectId: optional - The ID of the project to filter the workflows by. Only workflows associated with the given project are returned.

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
                case Get2WorkflowsSearchV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2WorkflowsSearchV1Response.Unknown r -> {
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
