import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2ApplicationPropertiesV1OperationSpec;

public class Get2ApplicationPropertiesV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.jiraSettingsApi().get2ApplicationPropertiesV1(new Get2ApplicationPropertiesV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.key(/* String */); // key: optional - The key of the application property.
                    // spec.permissionLevel(/* String */); // permissionLevel: optional - The permission level of all items being returned in the list.
                    // spec.keyFilter(/* String */); // keyFilter: optional - When a `key` isn't provided, this filters the list of results by the application property `key` using a regular expression. For example, using `jira.lf.*` will return all application properties with keys that start with *jira.lf.*.

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
                case Get2ApplicationPropertiesV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2ApplicationPropertiesV1Response.Status401Response r -> {
                    // handle 401, r.data() contains typed payload
                }
                case Get2ApplicationPropertiesV1Response.NotFoundResponse r -> {
                    // handle 404, r.data() contains typed payload
                }
                case Get2ApplicationPropertiesV1Response.Unknown r -> {
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
