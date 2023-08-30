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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AttachmentArchiveImpl
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
    "totalEntryCount"
})
@JsonTypeName("AttachmentArchiveImpl")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttachmentArchiveImpl {

    /**
     * The list of the items included in the archive.
     */
    @JsonProperty("entries")
    protected List<AttachmentArchiveEntry> entries;

    /**
     * The number of items in the archive.
     */
    @JsonProperty("totalEntryCount")
    protected Integer totalEntryCount;

    /**
     * Constructs a validated instance of {@link AttachmentArchiveImpl}.
     *
     * @param spec the specification to process
     */
    public AttachmentArchiveImpl(Consumer<AttachmentArchiveImpl> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AttachmentArchiveImpl}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AttachmentArchiveImpl(Consumer)} instead.
     * @param entries The list of the items included in the archive.
     * @param totalEntryCount The number of items in the archive.
     */
    @ApiStatus.Internal
    public AttachmentArchiveImpl(List<AttachmentArchiveEntry> entries, Integer totalEntryCount) {
        this.entries = entries;
        this.totalEntryCount = totalEntryCount;
    }

}
