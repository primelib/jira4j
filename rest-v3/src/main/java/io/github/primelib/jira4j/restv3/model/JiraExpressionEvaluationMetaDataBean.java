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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JiraExpressionEvaluationMetaDataBean
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
    "complexity",
    "issues"
})
@JsonTypeName("JiraExpressionEvaluationMetaDataBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionEvaluationMetaDataBean {

    @JsonProperty("complexity")
    protected JiraExpressionsComplexityBean complexity;

    @JsonProperty("issues")
    protected IssuesMetaBean issues;

    /**
     * Constructs a validated instance of {@link JiraExpressionEvaluationMetaDataBean}.
     *
     * @param spec the specification to process
     */
    public JiraExpressionEvaluationMetaDataBean(Consumer<JiraExpressionEvaluationMetaDataBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JiraExpressionEvaluationMetaDataBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JiraExpressionEvaluationMetaDataBean(Consumer)} instead.
     * @param complexity complexity
     * @param issues issues
     */
    @ApiStatus.Internal
    public JiraExpressionEvaluationMetaDataBean(JiraExpressionsComplexityBean complexity, IssuesMetaBean issues) {
        this.complexity = complexity;
        this.issues = issues;
    }

}
