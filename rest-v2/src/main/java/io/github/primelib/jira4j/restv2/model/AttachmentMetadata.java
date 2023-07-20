package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AttachmentMetadata
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "author",
    "content",
    "created",
    "filename",
    "id",
    "mimeType",
    "properties",
    "self",
    "size",
    "thumbnail"
})
@JsonTypeName("AttachmentMetadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttachmentMetadata {

    /**
     * Constructs a validated implementation of {@link AttachmentMetadata}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AttachmentMetadata(Consumer<AttachmentMetadata> spec) {
        spec.accept(this);
    }

    @JsonProperty("author")
    protected AttachmentMetadataAuthor author;

    /**
     * The URL of the attachment.
     */
    @JsonProperty("content")
    protected String content;

    /**
     * The datetime the attachment was created.
     */
    @JsonProperty("created")
    protected OffsetDateTime created;

    /**
     * The name of the attachment file.
     */
    @JsonProperty("filename")
    protected String filename;

    /**
     * The ID of the attachment.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The MIME type of the attachment.
     */
    @JsonProperty("mimeType")
    protected String mimeType;

    /**
     * Additional properties of the attachment.
     */
    @JsonProperty("properties")
    protected Map<String, Object> properties = new HashMap<>();

    /**
     * The URL of the attachment metadata details.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * The size of the attachment.
     */
    @JsonProperty("size")
    protected Long size;

    /**
     * The URL of a thumbnail representing the attachment.
     */
    @JsonProperty("thumbnail")
    protected String thumbnail;


}
