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

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Comment
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "author",
    "body",
    "created",
    "id",
    "jsdAuthorCanSeeRequest",
    "jsdPublic",
    "properties",
    "renderedBody",
    "self",
    "updateAuthor",
    "updated",
    "visibility"
})
@JsonTypeName("Comment")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Comment extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link Comment}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Comment(Consumer<Comment> spec) {
        spec.accept(this);
    }

    @JsonProperty("author")
    protected CommentAuthor author;

    /**
     * The comment text.
     */
    @JsonProperty("body")
    protected String body;

    /**
     * The date and time at which the comment was created.
     */
    @JsonProperty("created")
    protected OffsetDateTime created;

    /**
     * The ID of the comment.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Whether the comment was added from an email sent by a person who is not part of the issue. See [Allow external emails to be added as comments on issues](https://support.atlassian.com/jira-service-management-cloud/docs/allow-external-emails-to-be-added-as-comments-on-issues/)for information on setting up this feature.
     */
    @JsonProperty("jsdAuthorCanSeeRequest")
    protected Boolean jsdAuthorCanSeeRequest;

    /**
     * Whether the comment is visible in Jira Service Desk. Defaults to true when comments are created in the Jira Cloud Platform. This includes when the site doesn't use Jira Service Desk or the project isn't a Jira Service Desk project and, therefore, there is no Jira Service Desk for the issue to be visible on. To create a comment with its visibility in Jira Service Desk set to false, use the Jira Service Desk REST API [Create request comment](https://developer.atlassian.com/cloud/jira/service-desk/rest/#api-rest-servicedeskapi-request-issueIdOrKey-comment-post) operation.
     */
    @JsonProperty("jsdPublic")
    protected Boolean jsdPublic;

    /**
     * A list of comment properties. Optional on create and update.
     */
    @JsonProperty("properties")
    protected List<EntityProperty> properties;

    /**
     * The rendered version of the comment.
     */
    @JsonProperty("renderedBody")
    protected String renderedBody;

    /**
     * The URL of the comment.
     */
    @JsonProperty("self")
    protected String self;

    @JsonProperty("updateAuthor")
    protected CommentUpdateAuthor updateAuthor;

    /**
     * The date and time at which the comment was updated last.
     */
    @JsonProperty("updated")
    protected OffsetDateTime updated;

    @JsonProperty("visibility")
    protected CommentVisibility visibility;


}
