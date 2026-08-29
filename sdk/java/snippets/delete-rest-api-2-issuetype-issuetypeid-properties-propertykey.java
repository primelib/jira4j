import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Delete2IssuetypeByIssueTypeIdPropertyByPropertyKeyV1OperationSpec;

public class Delete2IssuetypeByIssueTypeIdPropertyByPropertyKeyV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueTypePropertiesApi().delete2IssuetypeByIssueTypeIdPropertyByPropertyKeyV1(new Delete2IssuetypeByIssueTypeIdPropertyByPropertyKeyV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.issueTypeId(/* String */); // issueTypeId: required - The ID of the issue type.
                    // spec.propertyKey(/* String */); // propertyKey: required - The key of the property. Use [Get issue type property keys](#api-rest-api-2-issuetype-issueTypeId-properties-get) to get a list of all issue type property keys.

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
                case Delete2IssuetypeByIssueTypeIdPropertyByPropertyKeyV1Response.Unknown r -> {
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
