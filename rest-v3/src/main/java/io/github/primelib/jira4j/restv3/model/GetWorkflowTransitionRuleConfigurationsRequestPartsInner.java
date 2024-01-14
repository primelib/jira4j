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
 * GetWorkflowTransitionRuleConfigurationsRequestPartsInner
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
    "contentType",
    "headerNames",
    "inputStream",
    "name",
    "size",
    "submittedFileName"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_parts_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestPartsInner {

    @JsonProperty("contentType")
    protected String contentType;

    @JsonProperty("headerNames")
    protected List<String> headerNames;

    @JsonProperty("inputStream")
    protected Object inputStream;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("size")
    protected Long size;

    @JsonProperty("submittedFileName")
    protected String submittedFileName;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestPartsInner}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestPartsInner(Consumer<GetWorkflowTransitionRuleConfigurationsRequestPartsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestPartsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestPartsInner(Consumer)} instead.
     * @param contentType contentType
     * @param headerNames headerNames
     * @param inputStream inputStream
     * @param name name
     * @param size size
     * @param submittedFileName submittedFileName
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestPartsInner(String contentType, List<String> headerNames, Object inputStream, String name, Long size, String submittedFileName) {
        this.contentType = contentType;
        this.headerNames = headerNames;
        this.inputStream = inputStream;
        this.name = name;
        this.size = size;
        this.submittedFileName = submittedFileName;
    }

}
