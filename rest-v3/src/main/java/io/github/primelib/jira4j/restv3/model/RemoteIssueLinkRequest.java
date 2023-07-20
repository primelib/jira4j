package io.github.primelib.jira4j.restv3.model;

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
 * RemoteIssueLinkRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "application",
    "globalId",
    "object",
    "relationship"
})
@JsonTypeName("RemoteIssueLinkRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoteIssueLinkRequest extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link RemoteIssueLinkRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoteIssueLinkRequest(Consumer<RemoteIssueLinkRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("application")
    protected RemoteIssueLinkRequestApplication application;

    /**
     * An identifier for the remote item in the remote system. For example, the global ID for a remote item in Confluence would consist of the app ID and page ID, like this: `appId=456&amp;pageId=123`.
     * Setting this field enables the remote issue link details to be updated or deleted using remote system and item details as the record identifier, rather than using the record's Jira ID.
     * The maximum length is 255 characters.
     */
    @JsonProperty("globalId")
    protected String globalId;

    @JsonProperty("object")
    protected RemoteIssueLinkObject _object;

    /**
     * Description of the relationship between the issue and the linked item. If not set, the relationship description "links to" is used in Jira.
     */
    @JsonProperty("relationship")
    protected String relationship;


}
