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
 * GetWorkflowTransitionRuleConfigurationsRequestAsyncContextResponse
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
    "bufferSize",
    "characterEncoding",
    "committed",
    "contentLength",
    "contentLengthLong",
    "contentType",
    "locale",
    "outputStream",
    "writer"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_asyncContext_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestAsyncContextResponse {

    @JsonProperty("bufferSize")
    protected Integer bufferSize;

    @JsonProperty("characterEncoding")
    protected String characterEncoding;

    @JsonProperty("committed")
    protected Boolean committed;

    @JsonProperty("contentLength")
    protected Integer contentLength;

    @JsonProperty("contentLengthLong")
    protected Long contentLengthLong;

    @JsonProperty("contentType")
    protected String contentType;

    @JsonProperty("locale")
    protected GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestLocale locale;

    @JsonProperty("outputStream")
    protected GetWorkflowTransitionRuleConfigurationsRequestAsyncContextResponseOutputStream outputStream;

    @JsonProperty("writer")
    protected Object writer;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextResponse}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextResponse(Consumer<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestAsyncContextResponse(Consumer)} instead.
     * @param bufferSize bufferSize
     * @param characterEncoding characterEncoding
     * @param committed committed
     * @param contentLength contentLength
     * @param contentLengthLong contentLengthLong
     * @param contentType contentType
     * @param locale locale
     * @param outputStream outputStream
     * @param writer writer
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextResponse(Integer bufferSize, String characterEncoding, Boolean committed, Integer contentLength, Long contentLengthLong, String contentType, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestLocale locale, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextResponseOutputStream outputStream, Object writer) {
        this.bufferSize = bufferSize;
        this.characterEncoding = characterEncoding;
        this.committed = committed;
        this.contentLength = contentLength;
        this.contentLengthLong = contentLengthLong;
        this.contentType = contentType;
        this.locale = locale;
        this.outputStream = outputStream;
        this.writer = writer;
    }

}
