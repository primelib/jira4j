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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoader
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
    "defaultAssertionStatus",
    "definedPackages",
    "name",
    "parent",
    "registeredAsParallelCapable",
    "unnamedModule"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_asyncContext_request_servletContext_classLoader")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoader {

    @JsonProperty("defaultAssertionStatus")
    protected Boolean defaultAssertionStatus;

    @JsonProperty("definedPackages")
    protected List<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderDefinedPackagesInner> definedPackages;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("parent")
    protected GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParent parent;

    @JsonProperty("registeredAsParallelCapable")
    protected Boolean registeredAsParallelCapable;

    @JsonProperty("unnamedModule")
    protected GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModule unnamedModule;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoader}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoader(Consumer<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoader> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoader}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoader(Consumer)} instead.
     * @param defaultAssertionStatus defaultAssertionStatus
     * @param definedPackages definedPackages
     * @param name name
     * @param parent parent
     * @param registeredAsParallelCapable registeredAsParallelCapable
     * @param unnamedModule unnamedModule
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoader(Boolean defaultAssertionStatus, List<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderDefinedPackagesInner> definedPackages, String name, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParent parent, Boolean registeredAsParallelCapable, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderParentUnnamedModule unnamedModule) {
        this.defaultAssertionStatus = defaultAssertionStatus;
        this.definedPackages = definedPackages;
        this.name = name;
        this.parent = parent;
        this.registeredAsParallelCapable = registeredAsParallelCapable;
        this.unnamedModule = unnamedModule;
    }

}
