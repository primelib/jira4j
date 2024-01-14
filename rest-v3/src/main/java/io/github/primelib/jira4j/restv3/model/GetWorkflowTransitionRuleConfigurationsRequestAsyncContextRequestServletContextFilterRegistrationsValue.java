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

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextFilterRegistrationsValue
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
    "className",
    "initParameters",
    "name",
    "servletNameMappings",
    "urlPatternMappings"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_asyncContext_request_servletContext_filterRegistrations_value")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextFilterRegistrationsValue {

    @JsonProperty("className")
    protected String className;

    @JsonProperty("initParameters")
    protected Map<String, String> initParameters;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("servletNameMappings")
    protected List<String> servletNameMappings;

    @JsonProperty("urlPatternMappings")
    protected List<String> urlPatternMappings;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextFilterRegistrationsValue}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextFilterRegistrationsValue(Consumer<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextFilterRegistrationsValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextFilterRegistrationsValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextFilterRegistrationsValue(Consumer)} instead.
     * @param className className
     * @param initParameters initParameters
     * @param name name
     * @param servletNameMappings servletNameMappings
     * @param urlPatternMappings urlPatternMappings
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextFilterRegistrationsValue(String className, Map<String, String> initParameters, String name, List<String> servletNameMappings, List<String> urlPatternMappings) {
        this.className = className;
        this.initParameters = initParameters;
        this.name = name;
        this.servletNameMappings = servletNameMappings;
        this.urlPatternMappings = urlPatternMappings;
    }

}
