import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2JqlAutocompletedataSuggestionsV1OperationSpec;

public class Get2JqlAutocompletedataSuggestionsV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.jqlApi().get2JqlAutocompletedataSuggestionsV1(new Get2JqlAutocompletedataSuggestionsV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.fieldName(/* String */); // fieldName: optional - The name of the field.
                    // spec.fieldValue(/* String */); // fieldValue: optional - The partial field item name entered by the user.
                    // spec.predicateName(/* String */); // predicateName: optional - The name of the [ CHANGED operator predicate](https://confluence.atlassian.com/x/hQORLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for which the suggestions are generated. The valid predicate operators are *by*, *from*, and *to*.
                    // spec.predicateValue(/* String */); // predicateValue: optional - The partial predicate item name entered by the user.

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
                case Get2JqlAutocompletedataSuggestionsV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2JqlAutocompletedataSuggestionsV1Response.Unknown r -> {
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
