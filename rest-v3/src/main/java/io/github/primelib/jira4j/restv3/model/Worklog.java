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
import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Worklog
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
    "comment",
    "created",
    "id",
    "issueId",
    "properties",
    "self",
    "started",
    "timeSpent",
    "timeSpentSeconds",
    "updateAuthor",
    "updated",
    "visibility"
})
@JsonTypeName("Worklog")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Worklog {

    @JsonProperty("author")
    protected WorklogAuthor author;

    /**
     * A comment about the worklog in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/). Optional when creating or updating a worklog.
     */
    @JsonProperty("comment")
    protected Object comment;

    /**
     * The datetime on which the worklog was created.
     */
    @JsonProperty("created")
    protected OffsetDateTime created;

    /**
     * The ID of the worklog record.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The ID of the issue this worklog is for.
     */
    @JsonProperty("issueId")
    protected String issueId;

    /**
     * Details of properties for the worklog. Optional when creating or updating a worklog.
     */
    @JsonProperty("properties")
    protected List<EntityProperty> properties;

    /**
     * The URL of the worklog item.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * The datetime on which the worklog effort was started. Required when creating a worklog. Optional when updating a worklog.
     */
    @JsonProperty("started")
    protected OffsetDateTime started;

    /**
     * The time spent working on the issue as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). Required when creating a worklog if {@code timeSpentSeconds} isn't provided. Optional when updating a worklog. Cannot be provided if {@code timeSpentSecond} is provided.
     */
    @JsonProperty("timeSpent")
    protected String timeSpent;

    /**
     * The time in seconds spent working on the issue. Required when creating a worklog if {@code timeSpent} isn't provided. Optional when updating a worklog. Cannot be provided if {@code timeSpent} is provided.
     */
    @JsonProperty("timeSpentSeconds")
    protected Long timeSpentSeconds;

    @JsonProperty("updateAuthor")
    protected WorklogUpdateAuthor updateAuthor;

    /**
     * The datetime on which the worklog was last updated.
     */
    @JsonProperty("updated")
    protected OffsetDateTime updated;

    @JsonProperty("visibility")
    protected WorklogVisibility visibility;

    /**
     * Constructs a validated instance of {@link Worklog}.
     *
     * @param spec the specification to process
     */
    public Worklog(Consumer<Worklog> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Worklog}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Worklog(Consumer)} instead.
     * @param author var.name
     * @param comment A comment about the worklog in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/). Optional when creating or updating a worklog.
     * @param created The datetime on which the worklog was created.
     * @param id The ID of the worklog record.
     * @param issueId The ID of the issue this worklog is for.
     * @param properties Details of properties for the worklog. Optional when creating or updating a worklog.
     * @param self The URL of the worklog item.
     * @param started The datetime on which the worklog effort was started. Required when creating a worklog. Optional when updating a worklog.
     * @param timeSpent The time spent working on the issue as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). Required when creating a worklog if {@code timeSpentSeconds} isn't provided. Optional when updating a worklog. Cannot be provided if {@code timeSpentSecond} is provided.
     * @param timeSpentSeconds The time in seconds spent working on the issue. Required when creating a worklog if {@code timeSpent} isn't provided. Optional when updating a worklog. Cannot be provided if {@code timeSpent} is provided.
     * @param updateAuthor var.name
     * @param updated The datetime on which the worklog was last updated.
     * @param visibility var.name
     */
    @ApiStatus.Internal
    public Worklog(WorklogAuthor author, Object comment, OffsetDateTime created, String id, String issueId, List<EntityProperty> properties, URI self, OffsetDateTime started, String timeSpent, Long timeSpentSeconds, WorklogUpdateAuthor updateAuthor, OffsetDateTime updated, WorklogVisibility visibility) {
        this.author = author;
        this.comment = comment;
        this.created = created;
        this.id = id;
        this.issueId = issueId;
        this.properties = properties;
        this.self = self;
        this.started = started;
        this.timeSpent = timeSpent;
        this.timeSpentSeconds = timeSpentSeconds;
        this.updateAuthor = updateAuthor;
        this.updated = updated;
        this.visibility = visibility;
    }

}
