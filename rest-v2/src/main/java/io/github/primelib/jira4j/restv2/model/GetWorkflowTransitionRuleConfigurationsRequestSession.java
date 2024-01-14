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
 * GetWorkflowTransitionRuleConfigurationsRequestSession
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
    "attributeNames",
    "creationTime",
    "id",
    "lastAccessedTime",
    "maxInactiveInterval",
    "new",
    "servletContext",
    "sessionContext",
    "valueNames"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_session")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestSession {

    @JsonProperty("attributeNames")
    protected Object attributeNames;

    @JsonProperty("creationTime")
    protected Long creationTime;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("lastAccessedTime")
    protected Long lastAccessedTime;

    @JsonProperty("maxInactiveInterval")
    protected Integer maxInactiveInterval;

    @JsonProperty("new")
    protected Boolean _new;

    @JsonProperty("servletContext")
    protected GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContext servletContext;

    @JsonProperty("sessionContext")
    protected GetWorkflowTransitionRuleConfigurationsRequestSessionSessionContext sessionContext;

    @JsonProperty("valueNames")
    protected List<String> valueNames;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestSession}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestSession(Consumer<GetWorkflowTransitionRuleConfigurationsRequestSession> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestSession}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestSession(Consumer)} instead.
     * @param attributeNames attributeNames
     * @param creationTime creationTime
     * @param id id
     * @param lastAccessedTime lastAccessedTime
     * @param maxInactiveInterval maxInactiveInterval
     * @param _new _new
     * @param servletContext servletContext
     * @param sessionContext sessionContext
     * @param valueNames valueNames
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestSession(Object attributeNames, Long creationTime, String id, Long lastAccessedTime, Integer maxInactiveInterval, Boolean _new, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContext servletContext, GetWorkflowTransitionRuleConfigurationsRequestSessionSessionContext sessionContext, List<String> valueNames) {
        this.attributeNames = attributeNames;
        this.creationTime = creationTime;
        this.id = id;
        this.lastAccessedTime = lastAccessedTime;
        this.maxInactiveInterval = maxInactiveInterval;
        this._new = _new;
        this.servletContext = servletContext;
        this.sessionContext = sessionContext;
        this.valueNames = valueNames;
    }

}
