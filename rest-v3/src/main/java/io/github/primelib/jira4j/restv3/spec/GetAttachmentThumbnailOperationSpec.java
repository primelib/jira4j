package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Attachment;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetAttachmentThumbnailSpec
 * <p>
 * Specification for the GetAttachmentThumbnail operation.
 * <p>
 * Get attachment thumbnail
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAttachmentThumbnailOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the attachment.
     */
    @NotNull 
    private String id;

    /**
     * Whether a redirect is provided for the attachment download. Clients that do not automatically follow redirects can set this to `false` to avoid making multiple requests to download the attachment.
     */
    @Nullable 
    private Boolean redirect = true;

    /**
     * Whether a default thumbnail is returned when the requested thumbnail is not found.
     */
    @Nullable 
    private Boolean fallbackToDefault = true;

    /**
     * The maximum width to scale the thumbnail to.
     */
    @Nullable 
    private Integer width;

    /**
     * The maximum height to scale the thumbnail to.
     */
    @Nullable 
    private Integer height;

    /**
     * Constructs a validated implementation of {@link GetAttachmentThumbnailOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAttachmentThumbnailOperationSpec(Consumer<GetAttachmentThumbnailOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
    }

}
