import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.PostAtlassianConnect1MigrationByConnectKeyByJiraIssueFieldsKeyTaskV1OperationSpec;

public class PostAtlassianConnect1MigrationByConnectKeyByJiraIssueFieldsKeyTaskV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.migrationOfConnectModulesToForgeApi().postAtlassianConnect1MigrationByConnectKeyByJiraIssueFieldsKeyTaskV1(new PostAtlassianConnect1MigrationByConnectKeyByJiraIssueFieldsKeyTaskV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.connectKey(/* String */); // connectKey: required - The key of the Connect app that contains the Jira issue field being migrated.
                    // spec.jiraIssueFieldsKey(/* String */); // jiraIssueFieldsKey: required - The module key of the Connect issue field being migrated.
                    // spec.retriggerCompletedMigration(/* Boolean */); // retriggerCompletedMigration: optional - Whether to retrigger the migration if it has already completed.

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
                case PostAtlassianConnect1MigrationByConnectKeyByJiraIssueFieldsKeyTaskV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case PostAtlassianConnect1MigrationByConnectKeyByJiraIssueFieldsKeyTaskV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case PostAtlassianConnect1MigrationByConnectKeyByJiraIssueFieldsKeyTaskV1Response.Status409Response r -> {
                    // handle 409, r.data() contains typed payload
                }
                case PostAtlassianConnect1MigrationByConnectKeyByJiraIssueFieldsKeyTaskV1Response.Unknown r -> {
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
