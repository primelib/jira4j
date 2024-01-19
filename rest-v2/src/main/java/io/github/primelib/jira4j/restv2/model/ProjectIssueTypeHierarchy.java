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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectIssueTypeHierarchy
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
    "hierarchy",
    "projectId"
})
@JsonTypeName("ProjectIssueTypeHierarchy")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectIssueTypeHierarchy {

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

    /**
     * Constructs a validated instance of {@link ProjectIssueTypeHierarchy}.
     *
     * @param spec the specification to process
     */
    public ProjectIssueTypeHierarchy(Consumer<ProjectIssueTypeHierarchy> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectIssueTypeHierarchy}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectIssueTypeHierarchy(Consumer)} instead.
     * @param hierarchy Details of an issue type hierarchy level.
     * @param projectId The ID of the project.
     */
    @ApiStatus.Internal
    public ProjectIssueTypeHierarchy(List<ProjectIssueTypesHierarchyLevel> hierarchy, Long projectId) {
        this.hierarchy = hierarchy;
        this.projectId = projectId;
    }

}
