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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JiraExpressionEvalRequestBean
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
    "context",
    "expression"
})
@JsonTypeName("JiraExpressionEvalRequestBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionEvalRequestBean {

    @JsonProperty("context")
    protected JiraExpressionEvalRequestBeanContext context;

    /**
     * The Jira expression to evaluate.
     */
    @JsonProperty("expression")
    protected String expression;

    /**
     * Constructs a validated instance of {@link JiraExpressionEvalRequestBean}.
     *
     * @param spec the specification to process
     */
    public JiraExpressionEvalRequestBean(Consumer<JiraExpressionEvalRequestBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JiraExpressionEvalRequestBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JiraExpressionEvalRequestBean(Consumer)} instead.
     * @param context context
     * @param expression The Jira expression to evaluate.
     */
    @ApiStatus.Internal
    public JiraExpressionEvalRequestBean(JiraExpressionEvalRequestBeanContext context, String expression) {
        this.context = context;
        this.expression = expression;
    }

}
