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

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Worklog
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
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
public class Worklog extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link Worklog}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Worklog(Consumer<Worklog> spec) {
        spec.accept(this);
    }

    @JsonProperty("author")
    protected WorklogAuthor author;

    /**
     * A comment about the worklog in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/). Optional when creating or updating a worklog.
     */
    @JsonProperty("comment")
    protected Object comment = null;

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
     * The time spent working on the issue as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). Required when creating a worklog if `timeSpentSeconds` isn't provided. Optional when updating a worklog. Cannot be provided if `timeSpentSecond` is provided.
     */
    @JsonProperty("timeSpent")
    protected String timeSpent;

    /**
     * The time in seconds spent working on the issue. Required when creating a worklog if `timeSpent` isn't provided. Optional when updating a worklog. Cannot be provided if `timeSpent` is provided.
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


}
