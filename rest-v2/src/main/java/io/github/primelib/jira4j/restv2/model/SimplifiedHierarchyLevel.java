package io.github.primelib.jira4j.restv2.model;

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
 * SimplifiedHierarchyLevel
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link SimplifiedHierarchyLevel}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SimplifiedHierarchyLevel(Consumer<SimplifiedHierarchyLevel> spec) {
        spec.accept(this);
    }

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


}
