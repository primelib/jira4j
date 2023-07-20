package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RemoteObject
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "icon",
    "status",
    "summary",
    "title",
    "url"
})
@JsonTypeName("RemoteObject")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoteObject extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link RemoteObject}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoteObject(Consumer<RemoteObject> spec) {
        spec.accept(this);
    }

    @JsonProperty("icon")
    protected RemoteObjectIcon icon;

    @JsonProperty("status")
    protected RemoteObjectStatus status;

    /**
     * The summary details of the item.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The title of the item.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * The URL of the item.
     */
    @JsonProperty("url")
    protected String url;


}
