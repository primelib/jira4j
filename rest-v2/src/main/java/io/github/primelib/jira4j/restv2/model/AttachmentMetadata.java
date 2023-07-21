package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AttachmentMetadata
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    protected Map<String, Object> properties;

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

    /**
     * Constructs a validated instance of {@link AttachmentMetadata}.
     *
     * @param spec the specification to process
     */
    public AttachmentMetadata(Consumer<AttachmentMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AttachmentMetadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AttachmentMetadata(Consumer)} instead.
     * @param author var.name
     * @param content The URL of the attachment.
     * @param created The datetime the attachment was created.
     * @param filename The name of the attachment file.
     * @param id The ID of the attachment.
     * @param mimeType The MIME type of the attachment.
     * @param properties Additional properties of the attachment.
     * @param self The URL of the attachment metadata details.
     * @param size The size of the attachment.
     * @param thumbnail The URL of a thumbnail representing the attachment.
     */
    @ApiStatus.Internal
    public AttachmentMetadata(AttachmentMetadataAuthor author, String content, OffsetDateTime created, String filename, Long id, String mimeType, Map<String, Object> properties, URI self, Long size, String thumbnail) {
        this.author = author;
        this.content = content;
        this.created = created;
        this.filename = filename;
        this.id = id;
        this.mimeType = mimeType;
        this.properties = properties;
        this.self = self;
        this.size = size;
        this.thumbnail = thumbnail;
    }

}
