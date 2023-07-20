package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueTypeSchemeProjects
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueTypeScheme",
    "projectIds"
})
@JsonTypeName("IssueTypeSchemeProjects")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeSchemeProjects {

    /**
     * Constructs a validated implementation of {@link IssueTypeSchemeProjects}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeSchemeProjects(Consumer<IssueTypeSchemeProjects> spec) {
        spec.accept(this);
    }

    @JsonProperty("issueTypeScheme")
    protected IssueTypeSchemeProjectsIssueTypeScheme issueTypeScheme;

    /**
     * The IDs of the projects using the issue type scheme.
     */
    @JsonProperty("projectIds")
    protected List<String> projectIds = new ArrayList<>();


}
