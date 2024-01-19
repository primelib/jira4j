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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectIssueTypes
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
    "issueTypes",
    "project"
})
@JsonTypeName("ProjectIssueTypes")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectIssueTypes {

    /**
     * IDs of the issue types
     */
    @JsonProperty("issueTypes")
    protected Set<String> issueTypes;

    @JsonProperty("project")
    protected ProjectId project;

    /**
     * Constructs a validated instance of {@link ProjectIssueTypes}.
     *
     * @param spec the specification to process
     */
    public ProjectIssueTypes(Consumer<ProjectIssueTypes> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectIssueTypes}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectIssueTypes(Consumer)} instead.
     * @param issueTypes IDs of the issue types
     * @param project project
     */
    @ApiStatus.Internal
    public ProjectIssueTypes(Set<String> issueTypes, ProjectId project) {
        this.issueTypes = issueTypes;
        this.project = project;
    }

}
