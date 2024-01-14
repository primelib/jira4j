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
 * GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptor
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
    "jspPropertyGroups",
    "taglibs"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_asyncContext_request_servletContext_jspConfigDescriptor")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptor {

    @JsonProperty("jspPropertyGroups")
    protected List<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorJspPropertyGroupsInner> jspPropertyGroups;

    @JsonProperty("taglibs")
    protected List<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorTaglibsInner> taglibs;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptor}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptor(Consumer<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptor> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptor}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptor(Consumer)} instead.
     * @param jspPropertyGroups jspPropertyGroups
     * @param taglibs taglibs
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptor(List<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorJspPropertyGroupsInner> jspPropertyGroups, List<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorTaglibsInner> taglibs) {
        this.jspPropertyGroups = jspPropertyGroups;
        this.taglibs = taglibs;
    }

}
