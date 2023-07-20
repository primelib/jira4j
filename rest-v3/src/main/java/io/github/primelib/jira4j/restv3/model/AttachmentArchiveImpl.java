package io.github.primelib.jira4j.restv3.model;

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
 * AttachmentArchiveImpl
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "entries",
    "totalEntryCount"
})
@JsonTypeName("AttachmentArchiveImpl")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttachmentArchiveImpl {

    /**
     * Constructs a validated implementation of {@link AttachmentArchiveImpl}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AttachmentArchiveImpl(Consumer<AttachmentArchiveImpl> spec) {
        spec.accept(this);
    }

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


}
