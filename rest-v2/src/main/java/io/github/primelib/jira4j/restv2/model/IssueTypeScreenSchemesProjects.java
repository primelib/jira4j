package io.github.primelib.jira4j.restv2.model;

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
 * IssueTypeScreenSchemesProjects
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueTypeScreenScheme",
    "projectIds"
})
@JsonTypeName("IssueTypeScreenSchemesProjects")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeScreenSchemesProjects {

    /**
     * Constructs a validated implementation of {@link IssueTypeScreenSchemesProjects}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeScreenSchemesProjects(Consumer<IssueTypeScreenSchemesProjects> spec) {
        spec.accept(this);
    }

    @JsonProperty("issueTypeScreenScheme")
    protected IssueTypeScreenSchemesProjectsIssueTypeScreenScheme issueTypeScreenScheme;

    /**
     * The IDs of the projects using the issue type screen scheme.
     */
    @JsonProperty("projectIds")
    protected List<String> projectIds = new ArrayList<>();


}
