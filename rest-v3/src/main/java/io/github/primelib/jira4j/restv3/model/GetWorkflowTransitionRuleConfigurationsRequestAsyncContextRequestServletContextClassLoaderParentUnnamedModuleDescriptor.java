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
 * GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModuleDescriptor
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
    "automatic",
    "open"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_asyncContext_request_servletContext_classLoader_parent_unnamedModule_descriptor")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModuleDescriptor {

    @JsonProperty("automatic")
    protected Boolean automatic;

    @JsonProperty("open")
    protected Boolean open;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModuleDescriptor}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModuleDescriptor(Consumer<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModuleDescriptor> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModuleDescriptor}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModuleDescriptor(Consumer)} instead.
     * @param automatic automatic
     * @param open open
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModuleDescriptor(Boolean automatic, Boolean open) {
        this.automatic = automatic;
        this.open = open;
    }

}
