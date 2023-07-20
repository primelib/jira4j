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
 * JiraExpressionEvaluationMetaDataBeanIssues
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "jql"
})
@JsonTypeName("JiraExpressionEvaluationMetaDataBean_issues")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionEvaluationMetaDataBeanIssues {

    /**
     * Constructs a validated implementation of {@link JiraExpressionEvaluationMetaDataBeanIssues}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JiraExpressionEvaluationMetaDataBeanIssues(Consumer<JiraExpressionEvaluationMetaDataBeanIssues> spec) {
        spec.accept(this);
    }

    @JsonProperty("jql")
    protected IssuesJqlMetaDataBean jql;


}
