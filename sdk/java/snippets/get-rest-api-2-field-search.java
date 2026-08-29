import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2FieldSearchV1OperationSpec;

public class Get2FieldSearchV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueFieldsApi().get2FieldSearchV1(new Get2FieldSearchV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.startAt(/* Long */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of items to return per page.
                    // spec.type(/* List<String> */); // type: optional - The type of fields to search.
                    // spec.id(/* List<String> */); // id: optional - The IDs of the custom fields to return or, where `query` is specified, filter.
                    // spec.query(/* String */); // query: optional - String used to perform a case-insensitive partial match with field names or descriptions.
                    // spec.orderBy(/* String */); // orderBy: optional - [Order](#ordering) the results by:   *  `contextsCount` sorts by the number of contexts related to a field  *  `lastUsed` sorts by the date when the value of the field last changed  *  `name` sorts by the field name  *  `screensCount` sorts by the number of screens related to a field
                    // spec.expand(/* String */); // expand: optional - Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `key` returns the key for each field  *  `stableId` returns the stableId for each field  *  `lastUsed` returns the date when the value of the field last changed  *  `screensCount` returns the number of screens related to a field  *  `contextsCount` returns the number of contexts related to a field  *  `isLocked` returns information about whether the field is locked  *  `searcherKey` returns the searcher key for each custom field
                    // spec.projectIds(/* List<Long> */); // projectIds: optional - The IDs of the projects to filter the fields by. Fields belonging to project Ids that the user does not have access to will not be returned

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
                case Get2FieldSearchV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2FieldSearchV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Get2FieldSearchV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Get2FieldSearchV1Response.Unknown r -> {
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
