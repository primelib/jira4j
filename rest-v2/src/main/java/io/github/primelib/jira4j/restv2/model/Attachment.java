package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Attachment
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
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
public class Attachment extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link Attachment}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Attachment(Consumer<Attachment> spec) {
        spec.accept(this);
    }

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


}
