import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2IssuesecurityschemesLevelMemberV1OperationSpec;

public class Get2IssuesecurityschemesLevelMemberV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueSecuritySchemesApi().get2IssuesecurityschemesLevelMemberV1(new Get2IssuesecurityschemesLevelMemberV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.startAt(/* String */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* String */); // maxResults: optional - The maximum number of items to return per page.
                    // spec.id(/* List<String> */); // id: optional - The list of issue security level member IDs. To include multiple issue security level members separate IDs with an ampersand: `id=10000&id=10001`.
                    // spec.schemeId(/* List<String> */); // schemeId: optional - The list of issue security scheme IDs. To include multiple issue security schemes separate IDs with an ampersand: `schemeId=10000&schemeId=10001`.
                    // spec.levelId(/* List<String> */); // levelId: optional - The list of issue security level IDs. To include multiple issue security levels separate IDs with an ampersand: `levelId=10000&levelId=10001`.
                    // spec.expand(/* String */); // expand: optional - Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `all` Returns all expandable information  *  `field` Returns information about the custom field granted the permission  *  `group` Returns information about the group that is granted the permission  *  `projectRole` Returns information about the project role granted the permission  *  `user` Returns information about the user who is granted the permission

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
                case Get2IssuesecurityschemesLevelMemberV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2IssuesecurityschemesLevelMemberV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Get2IssuesecurityschemesLevelMemberV1Response.Unknown r -> {
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
