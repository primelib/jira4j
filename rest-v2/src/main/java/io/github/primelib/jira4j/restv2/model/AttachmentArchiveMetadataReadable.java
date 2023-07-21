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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AttachmentArchiveMetadataReadable
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

    /**
     * Constructs a validated instance of {@link AttachmentArchiveMetadataReadable}.
     *
     * @param spec the specification to process
     */
    public AttachmentArchiveMetadataReadable(Consumer<AttachmentArchiveMetadataReadable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AttachmentArchiveMetadataReadable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AttachmentArchiveMetadataReadable(Consumer)} instead.
     * @param entries The list of the items included in the archive.
     * @param id The ID of the attachment.
     * @param mediaType The MIME type of the attachment.
     * @param name The name of the archive file.
     * @param totalEntryCount The number of items included in the archive.
     */
    @ApiStatus.Internal
    public AttachmentArchiveMetadataReadable(List<AttachmentArchiveItemReadable> entries, Long id, String mediaType, String name, Long totalEntryCount) {
        this.entries = entries;
        this.id = id;
        this.mediaType = mediaType;
        this.name = name;
        this.totalEntryCount = totalEntryCount;
    }

}
