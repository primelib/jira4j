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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JiraExpressionEvalContextBean
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
    "board",
    "custom",
    "customerRequest",
    "issue",
    "issues",
    "project",
    "serviceDesk",
    "sprint"
})
@JsonTypeName("JiraExpressionEvalContextBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionEvalContextBean {

    /**
     * The ID of the board that is available under the {@code board} variable when evaluating the expression.
     */
    @JsonProperty("board")
    protected Long board;

    /**
     * Custom context variables and their types. These variable types are available for use in a custom context:
     *  *
     * {@code user}: A [user](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user) specified as an Atlassian account ID.
     * *
     * {@code issue}: An [issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue) specified by ID or key. All the fields of the issue object are available in the Jira expression.
     * *
     * {@code json}: A JSON object containing custom content.
     * *
     * {@code list}: A JSON list of {@code user}, {@code issue}, or {@code json} variable types.
     */
    @JsonProperty("custom")
    protected List<CustomContextVariable> custom;

    /**
     * The ID of the customer request that is available under the {@code customerRequest} variable when evaluating the expression. This is the same as the ID of the underlying Jira issue, but the customer request context variable will have a different type.
     */
    @JsonProperty("customerRequest")
    protected Long customerRequest;

    @JsonProperty("issue")
    protected IdOrKeyBean issue;

    @JsonProperty("issues")
    protected JexpIssues issues;

    @JsonProperty("project")
    protected IdOrKeyBean project;

    /**
     * The ID of the service desk that is available under the {@code serviceDesk} variable when evaluating the expression.
     */
    @JsonProperty("serviceDesk")
    protected Long serviceDesk;

    /**
     * The ID of the sprint that is available under the {@code sprint} variable when evaluating the expression.
     */
    @JsonProperty("sprint")
    protected Long sprint;

    /**
     * Constructs a validated instance of {@link JiraExpressionEvalContextBean}.
     *
     * @param spec the specification to process
     */
    public JiraExpressionEvalContextBean(Consumer<JiraExpressionEvalContextBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JiraExpressionEvalContextBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JiraExpressionEvalContextBean(Consumer)} instead.
     * @param board The ID of the board that is available under the {@code board} variable when evaluating the expression.
     * @param custom Custom context variables and their types. These variable types are available for use in a custom context:   *  {@code user}: A [user](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user) specified as an Atlassian account ID.  *  {@code issue}: An [issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue) specified by ID or key. All the fields of the issue object are available in the Jira expression.  *  {@code json}: A JSON object containing custom content.  *  {@code list}: A JSON list of {@code user}, {@code issue}, or {@code json} variable types.
     * @param customerRequest The ID of the customer request that is available under the {@code customerRequest} variable when evaluating the expression. This is the same as the ID of the underlying Jira issue, but the customer request context variable will have a different type.
     * @param issue issue
     * @param issues issues
     * @param project project
     * @param serviceDesk The ID of the service desk that is available under the {@code serviceDesk} variable when evaluating the expression.
     * @param sprint The ID of the sprint that is available under the {@code sprint} variable when evaluating the expression.
     */
    @ApiStatus.Internal
    public JiraExpressionEvalContextBean(Long board, List<CustomContextVariable> custom, Long customerRequest, IdOrKeyBean issue, JexpIssues issues, IdOrKeyBean project, Long serviceDesk, Long sprint) {
        this.board = board;
        this.custom = custom;
        this.customerRequest = customerRequest;
        this.issue = issue;
        this.issues = issues;
        this.project = project;
        this.serviceDesk = serviceDesk;
        this.sprint = sprint;
    }

}
