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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Hierarchy
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
    "baseLevelId",
    "levels"
})
@JsonTypeName("Hierarchy")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Hierarchy {

    /**
     * The ID of the base level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
     */
    @JsonProperty("baseLevelId")
    protected Long baseLevelId;

    /**
     * Details about the hierarchy level.
     */
    @JsonProperty("levels")
    protected List<SimplifiedHierarchyLevel> levels;

    /**
     * Constructs a validated instance of {@link Hierarchy}.
     *
     * @param spec the specification to process
     */
    public Hierarchy(Consumer<Hierarchy> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Hierarchy}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Hierarchy(Consumer)} instead.
     * @param baseLevelId The ID of the base level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
     * @param levels Details about the hierarchy level.
     */
    @ApiStatus.Internal
    public Hierarchy(Long baseLevelId, List<SimplifiedHierarchyLevel> levels) {
        this.baseLevelId = baseLevelId;
        this.levels = levels;
    }

}
