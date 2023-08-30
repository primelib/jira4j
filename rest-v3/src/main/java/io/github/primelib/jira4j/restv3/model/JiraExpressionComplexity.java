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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JiraExpressionComplexity
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
    "expensiveOperations",
    "variables"
})
@JsonTypeName("JiraExpressionComplexity")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionComplexity {

    /**
     * Information that can be used to determine how many [expensive operations](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#expensive-operations) the evaluation of the expression will perform. This information may be a formula or number. For example:
     *  *
     * {@code issues.map(i =&amp;gt; i.comments)} performs as many expensive operations as there are issues on the issues list. So this parameter returns {@code N}, where {@code N} is the size of issue list.
     * *
     * {@code new Issue(10010).comments} gets comments for one issue, so its complexity is {@code 2} ({@code 1} to retrieve issue 10010 from the database plus {@code 1} to get its comments).
     */
    @JsonProperty("expensiveOperations")
    protected String expensiveOperations;

    /**
     * Variables used in the formula, mapped to the parts of the expression they refer to.
     */
    @JsonProperty("variables")
    protected Map<String, String> variables;

    /**
     * Constructs a validated instance of {@link JiraExpressionComplexity}.
     *
     * @param spec the specification to process
     */
    public JiraExpressionComplexity(Consumer<JiraExpressionComplexity> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JiraExpressionComplexity}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JiraExpressionComplexity(Consumer)} instead.
     * @param expensiveOperations Information that can be used to determine how many [expensive operations](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#expensive-operations) the evaluation of the expression will perform. This information may be a formula or number. For example:   *  {@code issues.map(i =&amp;gt; i.comments)} performs as many expensive operations as there are issues on the issues list. So this parameter returns {@code N}, where {@code N} is the size of issue list.  *  {@code new Issue(10010).comments} gets comments for one issue, so its complexity is {@code 2} ({@code 1} to retrieve issue 10010 from the database plus {@code 1} to get its comments).
     * @param variables Variables used in the formula, mapped to the parts of the expression they refer to.
     */
    @ApiStatus.Internal
    public JiraExpressionComplexity(String expensiveOperations, Map<String, String> variables) {
        this.expensiveOperations = expensiveOperations;
        this.variables = variables;
    }

}
