import io.github.primelib.jira.datacenter.client.JiraDataCenterClientFactory;
import io.github.primelib.jira.datacenter.client.client.AbstractJiraDataCenterClientApiClient.ApiResponseException;
import io.github.primelib.jira.datacenter.client.operations.Get2AttachmentThumbnailByIdV1OperationSpec;

public class Get2AttachmentThumbnailByIdV1Example {
    public void execute() {
        // Maven coordinates: io.github.primelib:jira-datacenter-client:<version>
        var client = JiraDataCenterClientFactory.create();

        try {
            var response = client.issueAttachmentsApi().get2AttachmentThumbnailByIdV1(new Get2AttachmentThumbnailByIdV1OperationSpec(spec -> {
                    // operation parameters (all available mutable fields)
                    // spec.id(/* String */); // id: required - The ID of the attachment.
                    // spec.redirect(/* Boolean */); // redirect: optional - Whether a redirect is provided for the attachment download. Clients that do not automatically follow redirects can set this to `false` to avoid making multiple requests to download the attachment.
                    // spec.fallbackToDefault(/* Boolean */); // fallbackToDefault: optional - Whether a default thumbnail is returned when the requested thumbnail is not found.
                    // spec.width(/* Integer */); // width: optional - The maximum width to scale the thumbnail to.
                    // spec.height(/* Integer */); // height: optional - The maximum height to scale the thumbnail to.

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
                case Get2AttachmentThumbnailByIdV1Response.Unknown r -> {
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
