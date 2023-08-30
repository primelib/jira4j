package io.github.primelib.jira4j.restv2.model;

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

import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectIssueTypesHierarchyLevel
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
    "entityId",
    "issueTypes",
    "level",
    "name"
})
@JsonTypeName("ProjectIssueTypesHierarchyLevel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectIssueTypesHierarchyLevel {

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

    /**
     * Constructs a validated instance of {@link ProjectIssueTypesHierarchyLevel}.
     *
     * @param spec the specification to process
     */
    public ProjectIssueTypesHierarchyLevel(Consumer<ProjectIssueTypesHierarchyLevel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectIssueTypesHierarchyLevel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectIssueTypesHierarchyLevel(Consumer)} instead.
     * @param entityId The ID of the issue type hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
     * @param issueTypes The list of issue types in the hierarchy level.
     * @param level The level of the issue type hierarchy level.
     * @param name The name of the issue type hierarchy level.
     */
    @ApiStatus.Internal
    public ProjectIssueTypesHierarchyLevel(UUID entityId, List<IssueTypeInfo> issueTypes, Integer level, String name) {
        this.entityId = entityId;
        this.issueTypes = issueTypes;
        this.level = level;
        this.name = name;
    }

}
