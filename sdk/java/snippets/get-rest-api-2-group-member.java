import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2GroupMemberV1OperationSpec;

public class Get2GroupMemberV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.groupsApi().get2GroupMemberV1(new Get2GroupMemberV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.groupname(/* String */); // groupname: optional - As a group's name can change, use of `groupId` is recommended to identify a group.   The name of the group. This parameter cannot be used with the `groupId` parameter.
                    // spec.groupId(/* String */); // groupId: optional - The ID of the group. This parameter cannot be used with the `groupName` parameter.
                    // spec.includeInactiveUsers(/* Boolean */); // includeInactiveUsers: optional - Include inactive users.
                    // spec.startAt(/* Long */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of items to return per page (number should be between 1 and 50).

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
                case Get2GroupMemberV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2GroupMemberV1Response.Unknown r -> {
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
