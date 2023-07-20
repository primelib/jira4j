package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectIssueTypesHierarchyLevel
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "entityId",
    "issueTypes",
    "level",
    "name"
})
@JsonTypeName("ProjectIssueTypesHierarchyLevel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectIssueTypesHierarchyLevel {

    /**
     * Constructs a validated implementation of {@link ProjectIssueTypesHierarchyLevel}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectIssueTypesHierarchyLevel(Consumer<ProjectIssueTypesHierarchyLevel> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the issue type hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
     */
    @JsonProperty("entityId")
    protected UUID entityId;

    /**
     * The list of issue types in the hierarchy level.
     */
    @JsonProperty("issueTypes")
    protected List<IssueTypeInfo> issueTypes;

    /**
     * The level of the issue type hierarchy level.
     */
    @JsonProperty("level")
    protected Integer level;

    /**
     * The name of the issue type hierarchy level.
     */
    @JsonProperty("name")
    protected String name;


}
