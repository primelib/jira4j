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
 * AttachmentArchiveEntry
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
    "abbreviatedName",
    "entryIndex",
    "mediaType",
    "name",
    "size"
})
@JsonTypeName("AttachmentArchiveEntry")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttachmentArchiveEntry {

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

    /**
     * Constructs a validated instance of {@link AttachmentArchiveEntry}.
     *
     * @param spec the specification to process
     */
    public AttachmentArchiveEntry(Consumer<AttachmentArchiveEntry> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AttachmentArchiveEntry}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AttachmentArchiveEntry(Consumer)} instead.
     * @param abbreviatedName abbreviatedName
     * @param entryIndex entryIndex
     * @param mediaType mediaType
     * @param name name
     * @param size size
     */
    @ApiStatus.Internal
    public AttachmentArchiveEntry(String abbreviatedName, Long entryIndex, String mediaType, String name, Long size) {
        this.abbreviatedName = abbreviatedName;
        this.entryIndex = entryIndex;
        this.mediaType = mediaType;
        this.name = name;
        this.size = size;
    }

}
