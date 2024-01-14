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
 * GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderDefinedPackagesInner
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
    "implementationTitle",
    "implementationVendor",
    "implementationVersion",
    "name",
    "sealed",
    "specificationTitle",
    "specificationVendor",
    "specificationVersion"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_asyncContext_request_servletContext_classLoader_definedPackages_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderDefinedPackagesInner {

    @JsonProperty("annotations")
    protected List<Object> annotations;

    @JsonProperty("declaredAnnotations")
    protected List<Object> declaredAnnotations;

    @JsonProperty("implementationTitle")
    protected String implementationTitle;

    @JsonProperty("implementationVendor")
    protected String implementationVendor;

    @JsonProperty("implementationVersion")
    protected String implementationVersion;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("sealed")
    protected Boolean sealed;

    @JsonProperty("specificationTitle")
    protected String specificationTitle;

    @JsonProperty("specificationVendor")
    protected String specificationVendor;

    @JsonProperty("specificationVersion")
    protected String specificationVersion;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderDefinedPackagesInner}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderDefinedPackagesInner(Consumer<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderDefinedPackagesInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderDefinedPackagesInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderDefinedPackagesInner(Consumer)} instead.
     * @param annotations annotations
     * @param declaredAnnotations declaredAnnotations
     * @param implementationTitle implementationTitle
     * @param implementationVendor implementationVendor
     * @param implementationVersion implementationVersion
     * @param name name
     * @param sealed sealed
     * @param specificationTitle specificationTitle
     * @param specificationVendor specificationVendor
     * @param specificationVersion specificationVersion
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoaderDefinedPackagesInner(List<Object> annotations, List<Object> declaredAnnotations, String implementationTitle, String implementationVendor, String implementationVersion, String name, Boolean sealed, String specificationTitle, String specificationVendor, String specificationVersion) {
        this.annotations = annotations;
        this.declaredAnnotations = declaredAnnotations;
        this.implementationTitle = implementationTitle;
        this.implementationVendor = implementationVendor;
        this.implementationVersion = implementationVersion;
        this.name = name;
        this.sealed = sealed;
        this.specificationTitle = specificationTitle;
        this.specificationVendor = specificationVendor;
        this.specificationVersion = specificationVersion;
    }

}
