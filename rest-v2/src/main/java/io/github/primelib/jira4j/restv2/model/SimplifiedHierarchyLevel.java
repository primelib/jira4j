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
 * SimplifiedHierarchyLevel
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
    "aboveLevelId",
    "belowLevelId",
    "externalUuid",
    "hierarchyLevelNumber",
    "id",
    "issueTypeIds",
    "level",
    "name",
    "projectConfigurationId"
})
@JsonTypeName("SimplifiedHierarchyLevel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SimplifiedHierarchyLevel {

    /**
     * The ID of the level above this one in the hierarchy. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
     */
    @JsonProperty("aboveLevelId")
    protected Long aboveLevelId;

    /**
     * The ID of the level below this one in the hierarchy. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
     */
    @JsonProperty("belowLevelId")
    protected Long belowLevelId;

    /**
     * The external UUID of the hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
     */
    @JsonProperty("externalUuid")
    protected UUID externalUuid;

    @JsonProperty("hierarchyLevelNumber")
    protected Integer hierarchyLevelNumber;

    /**
     * The ID of the hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The issue types available in this hierarchy level.
     */
    @JsonProperty("issueTypeIds")
    protected List<Long> issueTypeIds;

    /**
     * The level of this item in the hierarchy.
     */
    @JsonProperty("level")
    protected Integer level;

    /**
     * The name of this hierarchy level.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The ID of the project configuration. This property is deprecated, see [Change oticen: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
     */
    @JsonProperty("projectConfigurationId")
    protected Long projectConfigurationId;

    /**
     * Constructs a validated instance of {@link SimplifiedHierarchyLevel}.
     *
     * @param spec the specification to process
     */
    public SimplifiedHierarchyLevel(Consumer<SimplifiedHierarchyLevel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SimplifiedHierarchyLevel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SimplifiedHierarchyLevel(Consumer)} instead.
     * @param aboveLevelId The ID of the level above this one in the hierarchy. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
     * @param belowLevelId The ID of the level below this one in the hierarchy. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
     * @param externalUuid The external UUID of the hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
     * @param hierarchyLevelNumber hierarchyLevelNumber
     * @param id The ID of the hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
     * @param issueTypeIds The issue types available in this hierarchy level.
     * @param level The level of this item in the hierarchy.
     * @param name The name of this hierarchy level.
     * @param projectConfigurationId The ID of the project configuration. This property is deprecated, see [Change oticen: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
     */
    @ApiStatus.Internal
    public SimplifiedHierarchyLevel(Long aboveLevelId, Long belowLevelId, UUID externalUuid, Integer hierarchyLevelNumber, Long id, List<Long> issueTypeIds, Integer level, String name, Long projectConfigurationId) {
        this.aboveLevelId = aboveLevelId;
        this.belowLevelId = belowLevelId;
        this.externalUuid = externalUuid;
        this.hierarchyLevelNumber = hierarchyLevelNumber;
        this.id = id;
        this.issueTypeIds = issueTypeIds;
        this.level = level;
        this.name = name;
        this.projectConfigurationId = projectConfigurationId;
    }

}
