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
 * AttachmentArchive
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "entries",
    "moreAvailable",
    "totalEntryCount",
    "totalNumberOfEntriesAvailable"
})
@JsonTypeName("AttachmentArchive")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttachmentArchive {

    /**
     * Constructs a validated implementation of {@link AttachmentArchive}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AttachmentArchive(Consumer<AttachmentArchive> spec) {
        spec.accept(this);
    }

    @JsonProperty("entries")
    protected List<AttachmentArchiveEntry> entries;

    @JsonProperty("moreAvailable")
    protected Boolean moreAvailable;

    @JsonProperty("totalEntryCount")
    protected Integer totalEntryCount;

    @JsonProperty("totalNumberOfEntriesAvailable")
    protected Integer totalNumberOfEntriesAvailable;


}
