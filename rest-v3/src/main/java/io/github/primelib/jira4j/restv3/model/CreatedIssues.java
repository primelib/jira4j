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
 * CreatedIssues
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "errors",
    "issues"
})
@JsonTypeName("CreatedIssues")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreatedIssues {

    /**
     * Constructs a validated implementation of {@link CreatedIssues}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreatedIssues(Consumer<CreatedIssues> spec) {
        spec.accept(this);
    }

    /**
     * Error details for failed issue creation requests.
     */
    @JsonProperty("errors")
    protected List<BulkOperationErrorResult> errors;

    /**
     * Details of the issues created.
     */
    @JsonProperty("issues")
    protected List<CreatedIssue> issues;


}
