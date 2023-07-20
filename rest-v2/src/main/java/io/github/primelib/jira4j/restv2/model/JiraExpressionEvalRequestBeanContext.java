package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JiraExpressionEvalRequestBeanContext
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "board",
    "custom",
    "customerRequest",
    "issue",
    "issues",
    "project",
    "serviceDesk",
    "sprint"
})
@JsonTypeName("JiraExpressionEvalRequestBean_context")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionEvalRequestBeanContext {

    /**
     * Constructs a validated implementation of {@link JiraExpressionEvalRequestBeanContext}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JiraExpressionEvalRequestBeanContext(Consumer<JiraExpressionEvalRequestBeanContext> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the board that is available under the `board` variable when evaluating the expression.
     */
    @JsonProperty("board")
    protected Long board;

    /**
     * Custom context variables and their types. These variable types are available for use in a custom context:
     *  *
     * `user`: A [user](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user) specified as an Atlassian account ID.
     * *
     * `issue`: An [issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue) specified by ID or key. All the fields of the issue object are available in the Jira expression.
     * *
     * `json`: A JSON object containing custom content.
     * *
     * `list`: A JSON list of `user`, `issue`, or `json` variable types.
     */
    @JsonProperty("custom")
    protected List<CustomContextVariable> custom;

    /**
     * The ID of the customer request that is available under the `customerRequest` variable when evaluating the expression. This is the same as the ID of the underlying Jira issue, but the customer request context variable will have a different type.
     */
    @JsonProperty("customerRequest")
    protected Long customerRequest;

    @JsonProperty("issue")
    protected JiraExpressionEvalContextBeanIssue issue;

    @JsonProperty("issues")
    protected JiraExpressionEvalContextBeanIssues issues;

    @JsonProperty("project")
    protected JiraExpressionEvalContextBeanProject project;

    /**
     * The ID of the service desk that is available under the `serviceDesk` variable when evaluating the expression.
     */
    @JsonProperty("serviceDesk")
    protected Long serviceDesk;

    /**
     * The ID of the sprint that is available under the `sprint` variable when evaluating the expression.
     */
    @JsonProperty("sprint")
    protected Long sprint;


}
