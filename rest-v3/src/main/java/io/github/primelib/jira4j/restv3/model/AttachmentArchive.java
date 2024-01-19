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
 * AttachmentArchive
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
    "moreAvailable",
    "totalEntryCount",
    "totalNumberOfEntriesAvailable"
})
@JsonTypeName("AttachmentArchive")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttachmentArchive {

    @JsonProperty("entries")
    protected List<AttachmentArchiveEntry> entries;

    @JsonProperty("moreAvailable")
    protected Boolean moreAvailable;

    @JsonProperty("totalEntryCount")
    protected Integer totalEntryCount;

    @JsonProperty("totalNumberOfEntriesAvailable")
    protected Integer totalNumberOfEntriesAvailable;

    /**
     * Constructs a validated instance of {@link AttachmentArchive}.
     *
     * @param spec the specification to process
     */
    public AttachmentArchive(Consumer<AttachmentArchive> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AttachmentArchive}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AttachmentArchive(Consumer)} instead.
     * @param entries entries
     * @param moreAvailable moreAvailable
     * @param totalEntryCount totalEntryCount
     * @param totalNumberOfEntriesAvailable totalNumberOfEntriesAvailable
     */
    @ApiStatus.Internal
    public AttachmentArchive(List<AttachmentArchiveEntry> entries, Boolean moreAvailable, Integer totalEntryCount, Integer totalNumberOfEntriesAvailable) {
        this.entries = entries;
        this.moreAvailable = moreAvailable;
        this.totalEntryCount = totalEntryCount;
        this.totalNumberOfEntriesAvailable = totalNumberOfEntriesAvailable;
    }

}
