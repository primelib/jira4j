package io.github.primelib.jira4j.restv3.model;

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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AttachmentArchiveItemReadable
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
    "index",
    "label",
    "mediaType",
    "path",
    "size"
})
@JsonTypeName("AttachmentArchiveItemReadable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttachmentArchiveItemReadable {

    /**
     * The position of the item within the archive.
     */
    @JsonProperty("index")
    protected Long index;

    /**
     * The label for the archive item.
     */
    @JsonProperty("label")
    protected String label;

    /**
     * The MIME type of the archive item.
     */
    @JsonProperty("mediaType")
    protected String mediaType;

    /**
     * The path of the archive item.
     */
    @JsonProperty("path")
    protected String path;

    /**
     * The size of the archive item.
     */
    @JsonProperty("size")
    protected String size;

    /**
     * Constructs a validated instance of {@link AttachmentArchiveItemReadable}.
     *
     * @param spec the specification to process
     */
    public AttachmentArchiveItemReadable(Consumer<AttachmentArchiveItemReadable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AttachmentArchiveItemReadable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AttachmentArchiveItemReadable(Consumer)} instead.
     * @param index The position of the item within the archive.
     * @param label The label for the archive item.
     * @param mediaType The MIME type of the archive item.
     * @param path The path of the archive item.
     * @param size The size of the archive item.
     */
    @ApiStatus.Internal
    public AttachmentArchiveItemReadable(Long index, String label, String mediaType, String path, String size) {
        this.index = index;
        this.label = label;
        this.mediaType = mediaType;
        this.path = path;
        this.size = size;
    }

}
