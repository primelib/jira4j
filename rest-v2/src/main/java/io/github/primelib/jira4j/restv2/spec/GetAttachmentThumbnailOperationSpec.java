package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Attachment;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
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
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Whether a redirect is provided for the attachment download. Clients that do not automatically follow redirects can set this to {@code false} to avoid making multiple requests to download the attachment.
     */
    @Nullable 
    private Boolean redirect;

    /**
     * Whether a default thumbnail is returned when the requested thumbnail is not found.
     */
    @Nullable 
    private Boolean fallbackToDefault;

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
     * Constructs a validated instance of {@link GetAttachmentThumbnailOperationSpec}.
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
     * Constructs a validated instance of {@link GetAttachmentThumbnailOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the attachment.
     * @param redirect             Whether a redirect is provided for the attachment download. Clients that do not automatically follow redirects can set this to {@code false} to avoid making multiple requests to download the attachment.
     * @param fallbackToDefault    Whether a default thumbnail is returned when the requested thumbnail is not found.
     * @param width                The maximum width to scale the thumbnail to.
     * @param height               The maximum height to scale the thumbnail to.
     */
    @ApiStatus.Internal
    public GetAttachmentThumbnailOperationSpec(String id, Boolean redirect, Boolean fallbackToDefault, Integer width, Integer height) {
        this.id = id;
        this.redirect = redirect;
        this.fallbackToDefault = fallbackToDefault;
        this.width = width;
        this.height = height;

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
