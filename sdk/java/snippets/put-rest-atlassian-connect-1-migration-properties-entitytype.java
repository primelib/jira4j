import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.PutAtlassianConnect1MigrationPropertyByEntityTypeV1OperationSpec;

public class PutAtlassianConnect1MigrationPropertyByEntityTypeV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.appMigrationApi().putAtlassianConnect1MigrationPropertyByEntityTypeV1(new PutAtlassianConnect1MigrationPropertyByEntityTypeV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.atlassianTransferId(/* UUID */); // atlassianTransferId: required - The app migration transfer ID.
                    // spec.entityType(/* String */); // entityType: required - The type indicating the object that contains the entity properties.
                    // spec.payload(/* List<EntityPropertyDetails> */); // payload: required

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
                case PutAtlassianConnect1MigrationPropertyByEntityTypeV1Response.Unknown r -> {
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
