package io.github.primelib.jira4j.restv3.model;

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
 * AttachmentArchiveEntry
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "abbreviatedName",
    "entryIndex",
    "mediaType",
    "name",
    "size"
})
@JsonTypeName("AttachmentArchiveEntry")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttachmentArchiveEntry {

    /**
     * Constructs a validated implementation of {@link AttachmentArchiveEntry}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AttachmentArchiveEntry(Consumer<AttachmentArchiveEntry> spec) {
        spec.accept(this);
    }

    @JsonProperty("abbreviatedName")
    protected String abbreviatedName;

    @JsonProperty("entryIndex")
    protected Long entryIndex;

    @JsonProperty("mediaType")
    protected String mediaType;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("size")
    protected Long size;


}
