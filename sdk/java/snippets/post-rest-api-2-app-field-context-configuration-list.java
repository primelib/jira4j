import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Post2AppFieldContextConfigurationListV1OperationSpec;

public class Post2AppFieldContextConfigurationListV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueCustomFieldConfigurationAppsApi().post2AppFieldContextConfigurationListV1(new Post2AppFieldContextConfigurationListV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.id(/* List<Long> */); // id: optional - The list of configuration IDs. To include multiple configurations, separate IDs with an ampersand: `id=10000&id=10001`. Can't be provided with `fieldContextId`, `issueId`, `projectKeyOrId`, or `issueTypeId`.
                    // spec.fieldContextId(/* List<Long> */); // fieldContextId: optional - The list of field context IDs. To include multiple field contexts, separate IDs with an ampersand: `fieldContextId=10000&fieldContextId=10001`. Can't be provided with `id`, `issueId`, `projectKeyOrId`, or `issueTypeId`.
                    // spec.issueId(/* Long */); // issueId: optional - The ID of the issue to filter results by. If the issue doesn't exist, an empty list is returned. Can't be provided with `projectKeyOrId`, or `issueTypeId`.
                    // spec.projectKeyOrId(/* String */); // projectKeyOrId: optional - The ID or key of the project to filter results by. Must be provided with `issueTypeId`. Can't be provided with `issueId`.
                    // spec.issueTypeId(/* String */); // issueTypeId: optional - The ID of the issue type to filter results by. Must be provided with `projectKeyOrId`. Can't be provided with `issueId`.
                    // spec.startAt(/* Long */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of items to return per page.
                    // spec.payload(/* ConfigurationsListParameters */); // payload: required

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
                case Post2AppFieldContextConfigurationListV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Post2AppFieldContextConfigurationListV1Response.Unknown r -> {
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
