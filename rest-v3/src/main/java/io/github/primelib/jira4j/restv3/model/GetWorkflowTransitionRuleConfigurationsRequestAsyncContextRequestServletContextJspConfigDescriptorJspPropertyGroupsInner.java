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
 * GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorJspPropertyGroupsInner
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
    "buffer",
    "defaultContentType",
    "deferredSyntaxAllowedAsLiteral",
    "elIgnored",
    "errorOnUndeclaredNamespace",
    "includeCodas",
    "includePreludes",
    "isXml",
    "pageEncoding",
    "scriptingInvalid",
    "trimDirectiveWhitespaces",
    "urlPatterns"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_asyncContext_request_servletContext_jspConfigDescriptor_jspPropertyGroups_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorJspPropertyGroupsInner {

    @JsonProperty("buffer")
    protected String buffer;

    @JsonProperty("defaultContentType")
    protected String defaultContentType;

    @JsonProperty("deferredSyntaxAllowedAsLiteral")
    protected String deferredSyntaxAllowedAsLiteral;

    @JsonProperty("elIgnored")
    protected String elIgnored;

    @JsonProperty("errorOnUndeclaredNamespace")
    protected String errorOnUndeclaredNamespace;

    @JsonProperty("includeCodas")
    protected List<String> includeCodas;

    @JsonProperty("includePreludes")
    protected List<String> includePreludes;

    @JsonProperty("isXml")
    protected String isXml;

    @JsonProperty("pageEncoding")
    protected String pageEncoding;

    @JsonProperty("scriptingInvalid")
    protected String scriptingInvalid;

    @JsonProperty("trimDirectiveWhitespaces")
    protected String trimDirectiveWhitespaces;

    @JsonProperty("urlPatterns")
    protected List<String> urlPatterns;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorJspPropertyGroupsInner}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorJspPropertyGroupsInner(Consumer<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorJspPropertyGroupsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorJspPropertyGroupsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorJspPropertyGroupsInner(Consumer)} instead.
     * @param buffer buffer
     * @param defaultContentType defaultContentType
     * @param deferredSyntaxAllowedAsLiteral deferredSyntaxAllowedAsLiteral
     * @param elIgnored elIgnored
     * @param errorOnUndeclaredNamespace errorOnUndeclaredNamespace
     * @param includeCodas includeCodas
     * @param includePreludes includePreludes
     * @param isXml isXml
     * @param pageEncoding pageEncoding
     * @param scriptingInvalid scriptingInvalid
     * @param trimDirectiveWhitespaces trimDirectiveWhitespaces
     * @param urlPatterns urlPatterns
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptorJspPropertyGroupsInner(String buffer, String defaultContentType, String deferredSyntaxAllowedAsLiteral, String elIgnored, String errorOnUndeclaredNamespace, List<String> includeCodas, List<String> includePreludes, String isXml, String pageEncoding, String scriptingInvalid, String trimDirectiveWhitespaces, List<String> urlPatterns) {
        this.buffer = buffer;
        this.defaultContentType = defaultContentType;
        this.deferredSyntaxAllowedAsLiteral = deferredSyntaxAllowedAsLiteral;
        this.elIgnored = elIgnored;
        this.errorOnUndeclaredNamespace = errorOnUndeclaredNamespace;
        this.includeCodas = includeCodas;
        this.includePreludes = includePreludes;
        this.isXml = isXml;
        this.pageEncoding = pageEncoding;
        this.scriptingInvalid = scriptingInvalid;
        this.trimDirectiveWhitespaces = trimDirectiveWhitespaces;
        this.urlPatterns = urlPatterns;
    }

}
