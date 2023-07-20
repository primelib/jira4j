package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JiraExpressionComplexity
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "expensiveOperations",
    "variables"
})
@JsonTypeName("JiraExpressionComplexity")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionComplexity {

    /**
     * Constructs a validated implementation of {@link JiraExpressionComplexity}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JiraExpressionComplexity(Consumer<JiraExpressionComplexity> spec) {
        spec.accept(this);
    }

    /**
     * Information that can be used to determine how many [expensive operations](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#expensive-operations) the evaluation of the expression will perform. This information may be a formula or number. For example:
     *  *
     * `issues.map(i =&amp;gt; i.comments)` performs as many expensive operations as there are issues on the issues list. So this parameter returns `N`, where `N` is the size of issue list.
     * *
     * `new Issue(10010).comments` gets comments for one issue, so its complexity is `2` (`1` to retrieve issue 10010 from the database plus `1` to get its comments).
     */
    @JsonProperty("expensiveOperations")
    protected String expensiveOperations;

    /**
     * Variables used in the formula, mapped to the parts of the expression they refer to.
     */
    @JsonProperty("variables")
    protected Map<String, String> variables = new HashMap<>();


}
