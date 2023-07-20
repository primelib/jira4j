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
 * RemoteIssueLinkObject
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "icon",
    "status",
    "summary",
    "title",
    "url"
})
@JsonTypeName("RemoteIssueLink_object")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoteIssueLinkObject {

    /**
     * Constructs a validated implementation of {@link RemoteIssueLinkObject}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoteIssueLinkObject(Consumer<RemoteIssueLinkObject> spec) {
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
