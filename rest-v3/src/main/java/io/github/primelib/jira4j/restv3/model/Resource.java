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

import java.io.File;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource
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
    "description",
    "file",
    "filename",
    "inputStream",
    "open",
    "readable",
    "uri",
    "url"
})
@JsonTypeName("Resource")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Resource {

    @JsonProperty("description")
    protected String description;

    @JsonProperty("file")
    protected File _file;

    @JsonProperty("filename")
    protected String filename;

    @JsonProperty("inputStream")
    protected Object inputStream;

    @JsonProperty("open")
    protected Boolean open;

    @JsonProperty("readable")
    protected Boolean readable;

    @JsonProperty("uri")
    protected URI uri;

    @JsonProperty("url")
    protected String url;

    /**
     * Constructs a validated instance of {@link Resource}.
     *
     * @param spec the specification to process
     */
    public Resource(Consumer<Resource> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Resource}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Resource(Consumer)} instead.
     * @param description description
     * @param _file _file
     * @param filename filename
     * @param inputStream inputStream
     * @param open open
     * @param readable readable
     * @param uri uri
     * @param url url
     */
    @ApiStatus.Internal
    public Resource(String description, File _file, String filename, Object inputStream, Boolean open, Boolean readable, URI uri, String url) {
        this.description = description;
        this._file = _file;
        this.filename = filename;
        this.inputStream = inputStream;
        this.open = open;
        this.readable = readable;
        this.uri = uri;
        this.url = url;
    }

}
