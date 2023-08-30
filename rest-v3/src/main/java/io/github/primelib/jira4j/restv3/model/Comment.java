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

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Comment
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
public class Comment {

    @JsonProperty("author")
    protected CommentAuthor author;

    /**
     * The comment text in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/).
     */
    @JsonProperty("body")
    protected Object body;

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
    protected Visibility visibility;

    /**
     * Constructs a validated instance of {@link Comment}.
     *
     * @param spec the specification to process
     */
    public Comment(Consumer<Comment> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Comment}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Comment(Consumer)} instead.
     * @param author author
     * @param body The comment text in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/).
     * @param created The date and time at which the comment was created.
     * @param id The ID of the comment.
     * @param jsdAuthorCanSeeRequest Whether the comment was added from an email sent by a person who is not part of the issue. See [Allow external emails to be added as comments on issues](https://support.atlassian.com/jira-service-management-cloud/docs/allow-external-emails-to-be-added-as-comments-on-issues/)for information on setting up this feature.
     * @param jsdPublic Whether the comment is visible in Jira Service Desk. Defaults to true when comments are created in the Jira Cloud Platform. This includes when the site doesn't use Jira Service Desk or the project isn't a Jira Service Desk project and, therefore, there is no Jira Service Desk for the issue to be visible on. To create a comment with its visibility in Jira Service Desk set to false, use the Jira Service Desk REST API [Create request comment](https://developer.atlassian.com/cloud/jira/service-desk/rest/#api-rest-servicedeskapi-request-issueIdOrKey-comment-post) operation.
     * @param properties A list of comment properties. Optional on create and update.
     * @param renderedBody The rendered version of the comment.
     * @param self The URL of the comment.
     * @param updateAuthor updateAuthor
     * @param updated The date and time at which the comment was updated last.
     * @param visibility visibility
     */
    @ApiStatus.Internal
    public Comment(CommentAuthor author, Object body, OffsetDateTime created, String id, Boolean jsdAuthorCanSeeRequest, Boolean jsdPublic, List<EntityProperty> properties, String renderedBody, String self, CommentUpdateAuthor updateAuthor, OffsetDateTime updated, Visibility visibility) {
        this.author = author;
        this.body = body;
        this.created = created;
        this.id = id;
        this.jsdAuthorCanSeeRequest = jsdAuthorCanSeeRequest;
        this.jsdPublic = jsdPublic;
        this.properties = properties;
        this.renderedBody = renderedBody;
        this.self = self;
        this.updateAuthor = updateAuthor;
        this.updated = updated;
        this.visibility = visibility;
    }

}
