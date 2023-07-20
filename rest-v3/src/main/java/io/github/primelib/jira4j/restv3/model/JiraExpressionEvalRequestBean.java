package io.github.primelib.jira4j.restv3.model;

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
 * JiraExpressionEvalRequestBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "context",
    "expression"
})
@JsonTypeName("JiraExpressionEvalRequestBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionEvalRequestBean {

    /**
     * Constructs a validated implementation of {@link JiraExpressionEvalRequestBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JiraExpressionEvalRequestBean(Consumer<JiraExpressionEvalRequestBean> spec) {
        spec.accept(this);
    }

    @JsonProperty("context")
    protected JiraExpressionEvalRequestBeanContext context;

    /**
     * The Jira expression to evaluate.
     */
    @JsonProperty("expression")
    protected String expression;


}
