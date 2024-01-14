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
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModule
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
    "annotations",
    "declaredAnnotations",
    "descriptor",
    "layer",
    "name",
    "named",
    "packages"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_asyncContext_request_servletContext_classLoader_parent_unnamedModule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModule {

    @JsonProperty("annotations")
    protected List<Object> annotations;

    @JsonProperty("declaredAnnotations")
    protected List<Object> declaredAnnotations;

    @JsonProperty("descriptor")
    protected GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModuleDescriptor descriptor;

    @JsonProperty("layer")
    protected Object layer;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("named")
    protected Boolean named;

    @JsonProperty("packages")
    protected Set<String> packages;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModule}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModule(Consumer<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModule> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModule}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModule(Consumer)} instead.
     * @param annotations annotations
     * @param declaredAnnotations declaredAnnotations
     * @param descriptor descriptor
     * @param layer layer
     * @param name name
     * @param named named
     * @param packages packages
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModule(List<Object> annotations, List<Object> declaredAnnotations, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModuleDescriptor descriptor, Object layer, String name, Boolean named, Set<String> packages) {
        this.annotations = annotations;
        this.declaredAnnotations = declaredAnnotations;
        this.descriptor = descriptor;
        this.layer = layer;
        this.name = name;
        this.named = named;
        this.packages = packages;
    }

}
