import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2AuditingRecordV1OperationSpec;

public class Get2AuditingRecordV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.auditRecordsApi().get2AuditingRecordV1(new Get2AuditingRecordV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.offset(/* Integer */); // offset: optional - The number of records to skip before returning the first result.
                    // spec.limit(/* Integer */); // limit: optional - The maximum number of results to return.
                    // spec.filter(/* String */); // filter: optional - The strings to match with audit field content, space separated.
                    // spec.from(/* String */); // from: optional - The date and time on or after which returned audit records must have been created. If `to` is provided `from` must be before `to` or no audit records are returned.
                    // spec.to(/* String */); // to: optional - The date and time on or before which returned audit results must have been created. If `from` is provided `to` must be after `from` or no audit records are returned.

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
                case Get2AuditingRecordV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2AuditingRecordV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Get2AuditingRecordV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Get2AuditingRecordV1Response.Unknown r -> {
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
