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
 * JiraExpressionEvalContextBeanIssues
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
@JsonTypeName("JiraExpressionEvalContextBean_issues")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionEvalContextBeanIssues {

    @JsonProperty("jql")
    protected JexpIssuesJql jql;

    /**
     * Constructs a validated instance of {@link JiraExpressionEvalContextBeanIssues}.
     *
     * @param spec the specification to process
     */
    public JiraExpressionEvalContextBeanIssues(Consumer<JiraExpressionEvalContextBeanIssues> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JiraExpressionEvalContextBeanIssues}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JiraExpressionEvalContextBeanIssues(Consumer)} instead.
     * @param jql jql
     */
    @ApiStatus.Internal
    public JiraExpressionEvalContextBeanIssues(JexpIssuesJql jql) {
        this.jql = jql;
    }

}
