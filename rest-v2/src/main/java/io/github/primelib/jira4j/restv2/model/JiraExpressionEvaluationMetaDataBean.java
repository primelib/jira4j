package io.github.primelib.jira4j.restv2.model;

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
 * JiraExpressionEvaluationMetaDataBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "complexity",
    "issues"
})
@JsonTypeName("JiraExpressionEvaluationMetaDataBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionEvaluationMetaDataBean {

    /**
     * Constructs a validated implementation of {@link JiraExpressionEvaluationMetaDataBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JiraExpressionEvaluationMetaDataBean(Consumer<JiraExpressionEvaluationMetaDataBean> spec) {
        spec.accept(this);
    }

    @JsonProperty("complexity")
    protected JiraExpressionEvaluationMetaDataBeanComplexity complexity;

    @JsonProperty("issues")
    protected JiraExpressionEvaluationMetaDataBeanIssues issues;


}
