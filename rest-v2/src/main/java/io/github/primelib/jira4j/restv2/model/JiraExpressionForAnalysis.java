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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JiraExpressionForAnalysis
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
    "contextVariables",
    "expressions"
})
@JsonTypeName("JiraExpressionForAnalysis")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionForAnalysis {

    /**
     * Context variables and their types. The type checker assumes that [common context variables](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#context-variables), such as {@code issue} or {@code project}, are available in context and sets their type. Use this property to override the default types or provide details of new variables.
     */
    @JsonProperty("contextVariables")
    protected Map<String, String> contextVariables;

    /**
     * The list of Jira expressions to analyse.
     */
    @JsonProperty("expressions")
    protected List<String> expressions;

    /**
     * Constructs a validated instance of {@link JiraExpressionForAnalysis}.
     *
     * @param spec the specification to process
     */
    public JiraExpressionForAnalysis(Consumer<JiraExpressionForAnalysis> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JiraExpressionForAnalysis}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JiraExpressionForAnalysis(Consumer)} instead.
     * @param contextVariables Context variables and their types. The type checker assumes that [common context variables](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#context-variables), such as {@code issue} or {@code project}, are available in context and sets their type. Use this property to override the default types or provide details of new variables.
     * @param expressions The list of Jira expressions to analyse.
     */
    @ApiStatus.Internal
    public JiraExpressionForAnalysis(Map<String, String> contextVariables, List<String> expressions) {
        this.contextVariables = contextVariables;
        this.expressions = expressions;
    }

}
