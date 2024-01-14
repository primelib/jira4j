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
 * GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextServletRegistrationsValue
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
    "mappings",
    "name",
    "runAsRole"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_asyncContext_request_servletContext_servletRegistrations_value")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextServletRegistrationsValue {

    @JsonProperty("className")
    protected String className;

    @JsonProperty("initParameters")
    protected Map<String, String> initParameters;

    @JsonProperty("mappings")
    protected List<String> mappings;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("runAsRole")
    protected String runAsRole;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextServletRegistrationsValue}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextServletRegistrationsValue(Consumer<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextServletRegistrationsValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextServletRegistrationsValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextServletRegistrationsValue(Consumer)} instead.
     * @param className className
     * @param initParameters initParameters
     * @param mappings mappings
     * @param name name
     * @param runAsRole runAsRole
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextServletRegistrationsValue(String className, Map<String, String> initParameters, List<String> mappings, String name, String runAsRole) {
        this.className = className;
        this.initParameters = initParameters;
        this.mappings = mappings;
        this.name = name;
        this.runAsRole = runAsRole;
    }

}
