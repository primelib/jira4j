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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Attachment
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
    "self",
    "size",
    "thumbnail"
})
@JsonTypeName("Attachment")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Attachment {

    @JsonProperty("author")
    protected AttachmentAuthor author;

    /**
     * The content of the attachment.
     */
    @JsonProperty("content")
    protected String content;

    /**
     * The datetime the attachment was created.
     */
    @JsonProperty("created")
    protected OffsetDateTime created;

    /**
     * The file name of the attachment.
     */
    @JsonProperty("filename")
    protected String filename;

    /**
     * The ID of the attachment.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The MIME type of the attachment.
     */
    @JsonProperty("mimeType")
    protected String mimeType;

    /**
     * The URL of the attachment details response.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * The size of the attachment.
     */
    @JsonProperty("size")
    protected Long fileSize;

    /**
     * The URL of a thumbnail representing the attachment.
     */
    @JsonProperty("thumbnail")
    protected String thumbnail;

    /**
     * Constructs a validated instance of {@link Attachment}.
     *
     * @param spec the specification to process
     */
    public Attachment(Consumer<Attachment> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Attachment}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Attachment(Consumer)} instead.
     * @param author author
     * @param content The content of the attachment.
     * @param created The datetime the attachment was created.
     * @param filename The file name of the attachment.
     * @param id The ID of the attachment.
     * @param mimeType The MIME type of the attachment.
     * @param self The URL of the attachment details response.
     * @param fileSize The size of the attachment.
     * @param thumbnail The URL of a thumbnail representing the attachment.
     */
    @ApiStatus.Internal
    public Attachment(AttachmentAuthor author, String content, OffsetDateTime created, String filename, String id, String mimeType, String self, Long fileSize, String thumbnail) {
        this.author = author;
        this.content = content;
        this.created = created;
        this.filename = filename;
        this.id = id;
        this.mimeType = mimeType;
        this.self = self;
        this.fileSize = fileSize;
        this.thumbnail = thumbnail;
    }

}
