package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AttachmentArchiveMetadataReadable
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "entries",
    "id",
    "mediaType",
    "name",
    "totalEntryCount"
})
@JsonTypeName("AttachmentArchiveMetadataReadable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttachmentArchiveMetadataReadable {

    /**
     * Constructs a validated implementation of {@link AttachmentArchiveMetadataReadable}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AttachmentArchiveMetadataReadable(Consumer<AttachmentArchiveMetadataReadable> spec) {
        spec.accept(this);
    }

    /**
     * The list of the items included in the archive.
     */
    @JsonProperty("entries")
    protected List<AttachmentArchiveItemReadable> entries;

    /**
     * The ID of the attachment.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The MIME type of the attachment.
     */
    @JsonProperty("mediaType")
    protected String mediaType;

    /**
     * The name of the archive file.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The number of items included in the archive.
     */
    @JsonProperty("totalEntryCount")
    protected Long totalEntryCount;


}
