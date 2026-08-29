import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Delete2FieldByFieldKeyOptionByOptionIdIssueV1OperationSpec;

public class Delete2FieldByFieldKeyOptionByOptionIdIssueV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueCustomFieldOptionsAppsApi().delete2FieldByFieldKeyOptionByOptionIdIssueV1(new Delete2FieldByFieldKeyOptionByOptionIdIssueV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.replaceWith(/* Long */); // replaceWith: optional - The ID of the option that will replace the currently selected option.
                    // spec.jql(/* String */); // jql: optional - A JQL query that specifies the issues to be updated. For example, *project=10000*.
                    // spec.overrideScreenSecurity(/* Boolean */); // overrideScreenSecurity: optional - Whether screen security is overridden to enable hidden fields to be edited. Available to Connect and Forge app users with admin permission.
                    // spec.overrideEditableFlag(/* Boolean */); // overrideEditableFlag: optional - Whether screen security is overridden to enable uneditable fields to be edited. Available to Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
                    // spec.fieldKey(/* String */); // fieldKey: required - The field key is specified in the following format: **$(app-key)\_\_$(field-key)**. For example, *example-add-on\_\_example-issue-field*. To determine the `fieldKey` value, do one of the following:   *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the `jiraIssueFields` module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-2-field-get) and in the field details the value is returned in `key`. For example, `"key": "teams-add-on__team-issue-field"`
                    // spec.optionId(/* Long */); // optionId: required - The ID of the option to be deselected.

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
                case Delete2FieldByFieldKeyOptionByOptionIdIssueV1Response.Status303Response r -> {
                    // handle 303, r.data() contains typed payload
                }
                case Delete2FieldByFieldKeyOptionByOptionIdIssueV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Delete2FieldByFieldKeyOptionByOptionIdIssueV1Response.Unknown r -> {
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
