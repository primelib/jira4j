package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RemoteIssueLink
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "application",
    "globalId",
    "id",
    "object",
    "relationship",
    "self"
})
@JsonTypeName("RemoteIssueLink")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoteIssueLink {

    /**
     * Constructs a validated implementation of {@link RemoteIssueLink}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoteIssueLink(Consumer<RemoteIssueLink> spec) {
        spec.accept(this);
    }

    @JsonProperty("application")
    protected RemoteIssueLinkApplication application;

    /**
     * The global ID of the link, such as the ID of the item on the remote system.
     */
    @JsonProperty("globalId")
    protected String globalId;

    /**
     * The ID of the link.
     */
    @JsonProperty("id")
    protected Long id;

    @JsonProperty("object")
    protected RemoteIssueLinkObject _object;

    /**
     * Description of the relationship between the issue and the linked item.
     */
    @JsonProperty("relationship")
    protected String relationship;

    /**
     * The URL of the link.
     */
    @JsonProperty("self")
    protected URI self;


}
