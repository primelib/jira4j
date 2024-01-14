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
 * GetWorkflowTransitionRuleConfigurationsRequestAsyncContext
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
    "request",
    "response",
    "timeout"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_asyncContext")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestAsyncContext {

    @JsonProperty("request")
    protected GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequest request;

    @JsonProperty("response")
    protected GetWorkflowTransitionRuleConfigurationsRequestAsyncContextResponse response;

    @JsonProperty("timeout")
    protected Long timeout;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContext}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContext(Consumer<GetWorkflowTransitionRuleConfigurationsRequestAsyncContext> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContext}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestAsyncContext(Consumer)} instead.
     * @param request request
     * @param response response
     * @param timeout timeout
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContext(GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequest request, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextResponse response, Long timeout) {
        this.request = request;
        this.response = response;
        this.timeout = timeout;
    }

}
