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
 * GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorTaglibsInner
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
    "taglibLocation",
    "taglibURI"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_asyncContext_request_servletContext_jspConfigDescriptor_taglibs_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorTaglibsInner {

    @JsonProperty("taglibLocation")
    protected String taglibLocation;

    @JsonProperty("taglibURI")
    protected String taglibURI;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorTaglibsInner}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorTaglibsInner(Consumer<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorTaglibsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorTaglibsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorTaglibsInner(Consumer)} instead.
     * @param taglibLocation taglibLocation
     * @param taglibURI taglibURI
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorTaglibsInner(String taglibLocation, String taglibURI) {
        this.taglibLocation = taglibLocation;
        this.taglibURI = taglibURI;
    }

}
