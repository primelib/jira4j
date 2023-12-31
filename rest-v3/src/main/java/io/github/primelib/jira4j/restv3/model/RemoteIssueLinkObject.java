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
 * RemoteIssueLinkObject
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
    "icon",
    "status",
    "summary",
    "title",
    "url"
})
@JsonTypeName("RemoteIssueLink_object")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoteIssueLinkObject {

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

    /**
     * Constructs a validated instance of {@link RemoteIssueLinkObject}.
     *
     * @param spec the specification to process
     */
    public RemoteIssueLinkObject(Consumer<RemoteIssueLinkObject> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RemoteIssueLinkObject}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RemoteIssueLinkObject(Consumer)} instead.
     * @param icon icon
     * @param status status
     * @param summary The summary details of the item.
     * @param title The title of the item.
     * @param url The URL of the item.
     */
    @ApiStatus.Internal
    public RemoteIssueLinkObject(RemoteObjectIcon icon, RemoteObjectStatus status, String summary, String title, String url) {
        this.icon = icon;
        this.status = status;
        this.summary = summary;
        this.title = title;
        this.url = url;
    }

}
