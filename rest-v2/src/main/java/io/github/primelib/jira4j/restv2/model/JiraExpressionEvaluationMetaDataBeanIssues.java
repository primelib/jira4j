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
 * JiraExpressionEvaluationMetaDataBeanIssues
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
    "jql"
})
@JsonTypeName("JiraExpressionEvaluationMetaDataBean_issues")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionEvaluationMetaDataBeanIssues {

    @JsonProperty("jql")
    protected IssuesJqlMetaDataBean jql;

    /**
     * Constructs a validated instance of {@link JiraExpressionEvaluationMetaDataBeanIssues}.
     *
     * @param spec the specification to process
     */
    public JiraExpressionEvaluationMetaDataBeanIssues(Consumer<JiraExpressionEvaluationMetaDataBeanIssues> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JiraExpressionEvaluationMetaDataBeanIssues}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JiraExpressionEvaluationMetaDataBeanIssues(Consumer)} instead.
     * @param jql jql
     */
    @ApiStatus.Internal
    public JiraExpressionEvaluationMetaDataBeanIssues(IssuesJqlMetaDataBean jql) {
        this.jql = jql;
    }

}
