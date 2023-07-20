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
 * JiraExpressionResultMeta
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
@JsonTypeName("JiraExpressionResult_meta")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionResultMeta {

    /**
     * Constructs a validated implementation of {@link JiraExpressionResultMeta}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JiraExpressionResultMeta(Consumer<JiraExpressionResultMeta> spec) {
        spec.accept(this);
    }

    @JsonProperty("complexity")
    protected JiraExpressionEvaluationMetaDataBeanComplexity complexity;

    @JsonProperty("issues")
    protected JiraExpressionEvaluationMetaDataBeanIssues issues;


}
