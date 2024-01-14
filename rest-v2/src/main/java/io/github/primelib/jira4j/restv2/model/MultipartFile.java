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
 * MultipartFile
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
    "bytes",
    "contentType",
    "empty",
    "inputStream",
    "name",
    "originalFilename",
    "resource",
    "size"
})
@JsonTypeName("MultipartFile")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MultipartFile {

    @JsonProperty("bytes")
    protected List<byte[]> bytes;

    @JsonProperty("contentType")
    protected String contentType;

    @JsonProperty("empty")
    protected Boolean empty;

    @JsonProperty("inputStream")
    protected Object inputStream;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("originalFilename")
    protected String originalFilename;

    @JsonProperty("resource")
    protected Resource resource;

    @JsonProperty("size")
    protected Long size;

    /**
     * Constructs a validated instance of {@link MultipartFile}.
     *
     * @param spec the specification to process
     */
    public MultipartFile(Consumer<MultipartFile> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MultipartFile}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MultipartFile(Consumer)} instead.
     * @param bytes bytes
     * @param contentType contentType
     * @param empty empty
     * @param inputStream inputStream
     * @param name name
     * @param originalFilename originalFilename
     * @param resource resource
     * @param size size
     */
    @ApiStatus.Internal
    public MultipartFile(List<byte[]> bytes, String contentType, Boolean empty, Object inputStream, String name, String originalFilename, Resource resource, Long size) {
        this.bytes = bytes;
        this.contentType = contentType;
        this.empty = empty;
        this.inputStream = inputStream;
        this.name = name;
        this.originalFilename = originalFilename;
        this.resource = resource;
        this.size = size;
    }

}
