import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2FieldSearchTrashedV1OperationSpec;

public class Get2FieldSearchTrashedV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueFieldsApi().get2FieldSearchTrashedV1(new Get2FieldSearchTrashedV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.startAt(/* Long */); // startAt: optional - The index of the first item to return in a page of results (page offset).
                    // spec.maxResults(/* Integer */); // maxResults: optional - The maximum number of items to return per page.
                    // spec.id(/* List<String> */); // id: optional
                    // spec.query(/* String */); // query: optional - String used to perform a case-insensitive partial match with field names or descriptions.
                    // spec.expand(/* String */); // expand: optional
                    // spec.orderBy(/* String */); // orderBy: optional - [Order](#ordering) the results by a field:   *  `name` sorts by the field name  *  `trashDate` sorts by the date the field was moved to the trash  *  `plannedDeletionDate` sorts by the planned deletion date

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
                case Get2FieldSearchTrashedV1Response.OkResponse r -> {
                    // handle 200, r.data() contains typed payload
                }
                case Get2FieldSearchTrashedV1Response.BadRequestResponse r -> {
                    // handle 400, r.data() contains typed payload
                }
                case Get2FieldSearchTrashedV1Response.Status403Response r -> {
                    // handle 403, r.data() contains typed payload
                }
                case Get2FieldSearchTrashedV1Response.Unknown r -> {
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
