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
 * RemoteIssueLinkRequest
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
    "application",
    "globalId",
    "object",
    "relationship"
})
@JsonTypeName("RemoteIssueLinkRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoteIssueLinkRequest {

    @JsonProperty("application")
    protected Application application;

    /**
     * An identifier for the remote item in the remote system. For example, the global ID for a remote item in Confluence would consist of the app ID and page ID, like this: {@code appId=456&amp;pageId=123}.
     * Setting this field enables the remote issue link details to be updated or deleted using remote system and item details as the record identifier, rather than using the record's Jira ID.
     * The maximum length is 255 characters.
     */
    @JsonProperty("globalId")
    protected String globalId;

    @JsonProperty("object")
    protected RemoteObject object;

    /**
     * Description of the relationship between the issue and the linked item. If not set, the relationship description "links to" is used in Jira.
     */
    @JsonProperty("relationship")
    protected String relationship;

    /**
     * Constructs a validated instance of {@link RemoteIssueLinkRequest}.
     *
     * @param spec the specification to process
     */
    public RemoteIssueLinkRequest(Consumer<RemoteIssueLinkRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RemoteIssueLinkRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RemoteIssueLinkRequest(Consumer)} instead.
     * @param application application
     * @param globalId An identifier for the remote item in the remote system. For example, the global ID for a remote item in Confluence would consist of the app ID and page ID, like this: {@code appId=456&amp;pageId=123}.  Setting this field enables the remote issue link details to be updated or deleted using remote system and item details as the record identifier, rather than using the record's Jira ID.  The maximum length is 255 characters.
     * @param object object
     * @param relationship Description of the relationship between the issue and the linked item. If not set, the relationship description "links to" is used in Jira.
     */
    @ApiStatus.Internal
    public RemoteIssueLinkRequest(Application application, String globalId, RemoteObject object, String relationship) {
        this.application = application;
        this.globalId = globalId;
        this.object = object;
        this.relationship = relationship;
    }

}
