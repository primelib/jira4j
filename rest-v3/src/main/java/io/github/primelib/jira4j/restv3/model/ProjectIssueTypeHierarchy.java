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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectIssueTypeHierarchy
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "hierarchy",
    "projectId"
})
@JsonTypeName("ProjectIssueTypeHierarchy")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectIssueTypeHierarchy {

    /**
     * Constructs a validated implementation of {@link ProjectIssueTypeHierarchy}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectIssueTypeHierarchy(Consumer<ProjectIssueTypeHierarchy> spec) {
        spec.accept(this);
    }

    /**
     * Details of an issue type hierarchy level.
     */
    @JsonProperty("hierarchy")
    protected List<ProjectIssueTypesHierarchyLevel> hierarchy;

    /**
     * The ID of the project.
     */
    @JsonProperty("projectId")
    protected Long projectId;


}
