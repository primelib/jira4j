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
 * RemoveOptionFromIssuesResult
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
    "modifiedIssues",
    "unmodifiedIssues"
})
@JsonTypeName("RemoveOptionFromIssuesResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoveOptionFromIssuesResult {

    @JsonProperty("errors")
    protected SimpleErrorCollection errors;

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

    /**
     * Constructs a validated instance of {@link RemoveOptionFromIssuesResult}.
     *
     * @param spec the specification to process
     */
    public RemoveOptionFromIssuesResult(Consumer<RemoveOptionFromIssuesResult> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RemoveOptionFromIssuesResult}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RemoveOptionFromIssuesResult(Consumer)} instead.
     * @param errors errors
     * @param modifiedIssues The IDs of the modified issues.
     * @param unmodifiedIssues The IDs of the unchanged issues, those issues where errors prevent modification.
     */
    @ApiStatus.Internal
    public RemoveOptionFromIssuesResult(SimpleErrorCollection errors, List<Long> modifiedIssues, List<Long> unmodifiedIssues) {
        this.errors = errors;
        this.modifiedIssues = modifiedIssues;
        this.unmodifiedIssues = unmodifiedIssues;
    }

}
