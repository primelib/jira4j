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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequest
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
    "asyncStarted",
    "asyncSupported",
    "attributeNames",
    "characterEncoding",
    "contentLength",
    "contentLengthLong",
    "contentType",
    "dispatcherType",
    "inputStream",
    "localAddr",
    "localName",
    "localPort",
    "locale",
    "locales",
    "parameterMap",
    "parameterNames",
    "protocol",
    "reader",
    "remoteAddr",
    "remoteHost",
    "remotePort",
    "scheme",
    "secure",
    "serverName",
    "serverPort",
    "servletContext"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_asyncContext_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequest {

    @JsonProperty("asyncStarted")
    protected Boolean asyncStarted;

    @JsonProperty("asyncSupported")
    protected Boolean asyncSupported;

    @JsonProperty("attributeNames")
    protected Object attributeNames;

    @JsonProperty("characterEncoding")
    protected String characterEncoding;

    @JsonProperty("contentLength")
    protected Integer contentLength;

    @JsonProperty("contentLengthLong")
    protected Long contentLengthLong;

    @JsonProperty("contentType")
    protected String contentType;

    @JsonProperty("dispatcherType")
    protected DispatcherTypeEnum dispatcherType;

    @JsonProperty("inputStream")
    protected GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestInputStream inputStream;

    @JsonProperty("localAddr")
    protected String localAddr;

    @JsonProperty("localName")
    protected String localName;

    @JsonProperty("localPort")
    protected Integer localPort;

    @JsonProperty("locale")
    protected GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestLocale locale;

    @JsonProperty("locales")
    protected Object locales;

    @JsonProperty("parameterMap")
    protected Map<String, List<String>> parameterMap;

    @JsonProperty("parameterNames")
    protected Object parameterNames;

    @JsonProperty("protocol")
    protected String protocol;

    @JsonProperty("reader")
    protected Object reader;

    @JsonProperty("remoteAddr")
    protected String remoteAddr;

    @JsonProperty("remoteHost")
    protected String remoteHost;

    @JsonProperty("remotePort")
    protected Integer remotePort;

    @JsonProperty("scheme")
    protected String scheme;

    @JsonProperty("secure")
    protected Boolean secure;

    @JsonProperty("serverName")
    protected String serverName;

    @JsonProperty("serverPort")
    protected Integer serverPort;

    @JsonProperty("servletContext")
    protected GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContext servletContext;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequest}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequest(Consumer<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequest(Consumer)} instead.
     * @param asyncStarted asyncStarted
     * @param asyncSupported asyncSupported
     * @param attributeNames attributeNames
     * @param characterEncoding characterEncoding
     * @param contentLength contentLength
     * @param contentLengthLong contentLengthLong
     * @param contentType contentType
     * @param dispatcherType dispatcherType
     * @param inputStream inputStream
     * @param localAddr localAddr
     * @param localName localName
     * @param localPort localPort
     * @param locale locale
     * @param locales locales
     * @param parameterMap parameterMap
     * @param parameterNames parameterNames
     * @param protocol protocol
     * @param reader reader
     * @param remoteAddr remoteAddr
     * @param remoteHost remoteHost
     * @param remotePort remotePort
     * @param scheme scheme
     * @param secure secure
     * @param serverName serverName
     * @param serverPort serverPort
     * @param servletContext servletContext
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequest(Boolean asyncStarted, Boolean asyncSupported, Object attributeNames, String characterEncoding, Integer contentLength, Long contentLengthLong, String contentType, DispatcherTypeEnum dispatcherType, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestInputStream inputStream, String localAddr, String localName, Integer localPort, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestLocale locale, Object locales, Map<String, List<String>> parameterMap, Object parameterNames, String protocol, Object reader, String remoteAddr, String remoteHost, Integer remotePort, String scheme, Boolean secure, String serverName, Integer serverPort, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContext servletContext) {
        this.asyncStarted = asyncStarted;
        this.asyncSupported = asyncSupported;
        this.attributeNames = attributeNames;
        this.characterEncoding = characterEncoding;
        this.contentLength = contentLength;
        this.contentLengthLong = contentLengthLong;
        this.contentType = contentType;
        this.dispatcherType = dispatcherType;
        this.inputStream = inputStream;
        this.localAddr = localAddr;
        this.localName = localName;
        this.localPort = localPort;
        this.locale = locale;
        this.locales = locales;
        this.parameterMap = parameterMap;
        this.parameterNames = parameterNames;
        this.protocol = protocol;
        this.reader = reader;
        this.remoteAddr = remoteAddr;
        this.remoteHost = remoteHost;
        this.remotePort = remotePort;
        this.scheme = scheme;
        this.secure = secure;
        this.serverName = serverName;
        this.serverPort = serverPort;
        this.servletContext = servletContext;
    }

    @AllArgsConstructor
    public enum DispatcherTypeEnum {
        FORWARD("FORWARD"),
        INCLUDE("INCLUDE"),
        REQUEST("REQUEST"),
        ASYNC("ASYNC"),
        ERROR("ERROR");

        private static final DispatcherTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static DispatcherTypeEnum of(String input) {
            if (input != null) {
                for (DispatcherTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
