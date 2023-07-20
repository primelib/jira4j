package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectIssueTypes
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueTypes",
    "project"
})
@JsonTypeName("ProjectIssueTypes")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectIssueTypes {

    /**
     * Constructs a validated implementation of {@link ProjectIssueTypes}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectIssueTypes(Consumer<ProjectIssueTypes> spec) {
        spec.accept(this);
    }

    /**
     * IDs of the issue types
     */
    @JsonProperty("issueTypes")
    protected Set<String> issueTypes;

    @JsonProperty("project")
    protected ProjectId project;


}
