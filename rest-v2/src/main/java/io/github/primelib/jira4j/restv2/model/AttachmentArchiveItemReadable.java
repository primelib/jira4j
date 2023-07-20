package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AttachmentArchiveItemReadable
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link AttachmentArchiveItemReadable}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AttachmentArchiveItemReadable(Consumer<AttachmentArchiveItemReadable> spec) {
        spec.accept(this);
    }

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


}
