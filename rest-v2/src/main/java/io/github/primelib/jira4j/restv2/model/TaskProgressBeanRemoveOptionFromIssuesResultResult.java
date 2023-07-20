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
 * TaskProgressBeanRemoveOptionFromIssuesResultResult
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "errors",
    "modifiedIssues",
    "unmodifiedIssues"
})
@JsonTypeName("TaskProgressBeanRemoveOptionFromIssuesResult_result")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TaskProgressBeanRemoveOptionFromIssuesResultResult {

    /**
     * Constructs a validated implementation of {@link TaskProgressBeanRemoveOptionFromIssuesResultResult}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TaskProgressBeanRemoveOptionFromIssuesResultResult(Consumer<TaskProgressBeanRemoveOptionFromIssuesResultResult> spec) {
        spec.accept(this);
    }

    @JsonProperty("errors")
    protected RemoveOptionFromIssuesResultErrors errors;

    /**
     * The IDs of the modified issues.
     */
    @JsonProperty("modifiedIssues")
    protected List<Long> modifiedIssues;

    /**
     * The IDs of the unchanged issues, those issues where errors prevent modification.
     */
    @JsonProperty("unmodifiedIssues")
    protected List<Long> unmodifiedIssues;


}
