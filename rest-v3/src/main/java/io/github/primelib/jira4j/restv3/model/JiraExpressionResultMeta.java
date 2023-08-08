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
 * JiraExpressionResultMeta
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
@JsonTypeName("JiraExpressionResult_meta")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionResultMeta {

    @JsonProperty("complexity")
    protected JiraExpressionEvaluationMetaDataBeanComplexity complexity;

    @JsonProperty("issues")
    protected JiraExpressionEvaluationMetaDataBeanIssues issues;

    /**
     * Constructs a validated instance of {@link JiraExpressionResultMeta}.
     *
     * @param spec the specification to process
     */
    public JiraExpressionResultMeta(Consumer<JiraExpressionResultMeta> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JiraExpressionResultMeta}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JiraExpressionResultMeta(Consumer)} instead.
     * @param complexity complexity
     * @param issues issues
     */
    @ApiStatus.Internal
    public JiraExpressionResultMeta(JiraExpressionEvaluationMetaDataBeanComplexity complexity, JiraExpressionEvaluationMetaDataBeanIssues issues) {
        this.complexity = complexity;
        this.issues = issues;
    }

}
