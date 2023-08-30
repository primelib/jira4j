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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreatedIssues
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
    "errors",
    "issues"
})
@JsonTypeName("CreatedIssues")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreatedIssues {

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

    /**
     * Constructs a validated instance of {@link CreatedIssues}.
     *
     * @param spec the specification to process
     */
    public CreatedIssues(Consumer<CreatedIssues> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreatedIssues}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreatedIssues(Consumer)} instead.
     * @param errors Error details for failed issue creation requests.
     * @param issues Details of the issues created.
     */
    @ApiStatus.Internal
    public CreatedIssues(List<BulkOperationErrorResult> errors, List<CreatedIssue> issues) {
        this.errors = errors;
        this.issues = issues;
    }

}
