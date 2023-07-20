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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Hierarchy
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "baseLevelId",
    "levels"
})
@JsonTypeName("Hierarchy")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Hierarchy {

    /**
     * Constructs a validated implementation of {@link Hierarchy}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Hierarchy(Consumer<Hierarchy> spec) {
        spec.accept(this);
    }

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


}
