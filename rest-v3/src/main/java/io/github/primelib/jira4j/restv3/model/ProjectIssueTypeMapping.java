package io.github.primelib.jira4j.restv3.model;

import java.util.Map;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectIssueTypeMapping
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueTypeId",
    "projectId"
})
@JsonTypeName("ProjectIssueTypeMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectIssueTypeMapping {

    /**
     * Constructs a validated implementation of {@link ProjectIssueTypeMapping}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectIssueTypeMapping(Consumer<ProjectIssueTypeMapping> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the issue type.
     */
    @JsonProperty("issueTypeId")
    protected String issueTypeId;

    /**
     * The ID of the project.
     */
    @JsonProperty("projectId")
    protected String projectId;


}
