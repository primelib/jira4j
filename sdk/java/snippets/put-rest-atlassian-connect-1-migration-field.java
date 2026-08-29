import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.PutAtlassianConnect1MigrationFieldV1OperationSpec;

public class PutAtlassianConnect1MigrationFieldV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.appMigrationApi().putAtlassianConnect1MigrationFieldV1(new PutAtlassianConnect1MigrationFieldV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.atlassianTransferId(/* UUID */); // atlassianTransferId: required - The ID of the transfer.
                    // spec.payload(/* ConnectCustomFieldValues */); // payload: required

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
                case PutAtlassianConnect1MigrationFieldV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case PutAtlassianConnect1MigrationFieldV1Response.Unknown r -> {
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
