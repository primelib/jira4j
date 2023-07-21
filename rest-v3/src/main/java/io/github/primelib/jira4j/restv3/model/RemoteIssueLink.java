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

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RemoteIssueLink
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
    "id",
    "object",
    "relationship",
    "self"
})
@JsonTypeName("RemoteIssueLink")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoteIssueLink {

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
    protected RemoteIssueLinkObject object;

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

    /**
     * Constructs a validated instance of {@link RemoteIssueLink}.
     *
     * @param spec the specification to process
     */
    public RemoteIssueLink(Consumer<RemoteIssueLink> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RemoteIssueLink}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RemoteIssueLink(Consumer)} instead.
     * @param application var.name
     * @param globalId The global ID of the link, such as the ID of the item on the remote system.
     * @param id The ID of the link.
     * @param object var.name
     * @param relationship Description of the relationship between the issue and the linked item.
     * @param self The URL of the link.
     */
    @ApiStatus.Internal
    public RemoteIssueLink(RemoteIssueLinkApplication application, String globalId, Long id, RemoteIssueLinkObject object, String relationship, URI self) {
        this.application = application;
        this.globalId = globalId;
        this.id = id;
        this.object = object;
        this.relationship = relationship;
        this.self = self;
    }

}
