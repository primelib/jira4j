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
 * GetWorkflowTransitionRuleConfigurationsRequest
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
    "asyncContext",
    "asyncStarted",
    "asyncSupported",
    "attributeNames",
    "authType",
    "characterEncoding",
    "contentLength",
    "contentLengthLong",
    "contentType",
    "contextPath",
    "cookies",
    "dispatcherType",
    "headerNames",
    "httpServletMapping",
    "inputStream",
    "localAddr",
    "localName",
    "localPort",
    "locale",
    "locales",
    "method",
    "parameterMap",
    "parameterNames",
    "parts",
    "pathInfo",
    "pathTranslated",
    "protocol",
    "queryString",
    "reader",
    "remoteAddr",
    "remoteHost",
    "remotePort",
    "remoteUser",
    "requestURI",
    "requestURL",
    "requestedSessionId",
    "requestedSessionIdFromCookie",
    "requestedSessionIdFromURL",
    "requestedSessionIdFromUrl",
    "requestedSessionIdValid",
    "scheme",
    "secure",
    "serverName",
    "serverPort",
    "servletContext",
    "servletPath",
    "session",
    "trailerFields",
    "trailerFieldsReady",
    "userPrincipal"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequest {

    @JsonProperty("asyncContext")
    protected GetWorkflowTransitionRuleConfigurationsRequestAsyncContext asyncContext;

    @JsonProperty("asyncStarted")
    protected Boolean asyncStarted;

    @JsonProperty("asyncSupported")
    protected Boolean asyncSupported;

    @JsonProperty("attributeNames")
    protected Object attributeNames;

    @JsonProperty("authType")
    protected String authType;

    @JsonProperty("characterEncoding")
    protected String characterEncoding;

    @JsonProperty("contentLength")
    protected Integer contentLength;

    @JsonProperty("contentLengthLong")
    protected Long contentLengthLong;

    @JsonProperty("contentType")
    protected String contentType;

    @JsonProperty("contextPath")
    protected String contextPath;

    @JsonProperty("cookies")
    protected List<GetWorkflowTransitionRuleConfigurationsRequestCookiesInner> cookies;

    @JsonProperty("dispatcherType")
    protected DispatcherTypeEnum dispatcherType;

    @JsonProperty("headerNames")
    protected Object headerNames;

    @JsonProperty("httpServletMapping")
    protected GetWorkflowTransitionRuleConfigurationsRequestHttpServletMapping httpServletMapping;

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

    @JsonProperty("method")
    protected String method;

    @JsonProperty("parameterMap")
    protected Map<String, List<String>> parameterMap;

    @JsonProperty("parameterNames")
    protected Object parameterNames;

    @JsonProperty("parts")
    protected List<GetWorkflowTransitionRuleConfigurationsRequestPartsInner> parts;

    @JsonProperty("pathInfo")
    protected String pathInfo;

    @JsonProperty("pathTranslated")
    protected String pathTranslated;

    @JsonProperty("protocol")
    protected String protocol;

    @JsonProperty("queryString")
    protected String queryString;

    @JsonProperty("reader")
    protected Object reader;

    @JsonProperty("remoteAddr")
    protected String remoteAddr;

    @JsonProperty("remoteHost")
    protected String remoteHost;

    @JsonProperty("remotePort")
    protected Integer remotePort;

    @JsonProperty("remoteUser")
    protected String remoteUser;

    @JsonProperty("requestURI")
    protected String requestURI;

    @JsonProperty("requestURL")
    protected GetWorkflowTransitionRuleConfigurationsRequestRequestURL requestURL;

    @JsonProperty("requestedSessionId")
    protected String requestedSessionId;

    @JsonProperty("requestedSessionIdFromCookie")
    protected Boolean requestedSessionIdFromCookie;

    @JsonProperty("requestedSessionIdFromURL")
    protected Boolean requestedSessionIdFromURL;

    @JsonProperty("requestedSessionIdFromUrl")
    protected Boolean requestedSessionIdFromUrl;

    @JsonProperty("requestedSessionIdValid")
    protected Boolean requestedSessionIdValid;

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

    @JsonProperty("servletPath")
    protected String servletPath;

    @JsonProperty("session")
    protected GetWorkflowTransitionRuleConfigurationsRequestSession session;

    @JsonProperty("trailerFields")
    protected Map<String, String> trailerFields;

    @JsonProperty("trailerFieldsReady")
    protected Boolean trailerFieldsReady;

    @JsonProperty("userPrincipal")
    protected GetWorkflowTransitionRuleConfigurationsRequestUserPrincipal userPrincipal;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequest}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequest(Consumer<GetWorkflowTransitionRuleConfigurationsRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequest(Consumer)} instead.
     * @param asyncContext asyncContext
     * @param asyncStarted asyncStarted
     * @param asyncSupported asyncSupported
     * @param attributeNames attributeNames
     * @param authType authType
     * @param characterEncoding characterEncoding
     * @param contentLength contentLength
     * @param contentLengthLong contentLengthLong
     * @param contentType contentType
     * @param contextPath contextPath
     * @param cookies cookies
     * @param dispatcherType dispatcherType
     * @param headerNames headerNames
     * @param httpServletMapping httpServletMapping
     * @param inputStream inputStream
     * @param localAddr localAddr
     * @param localName localName
     * @param localPort localPort
     * @param locale locale
     * @param locales locales
     * @param method method
     * @param parameterMap parameterMap
     * @param parameterNames parameterNames
     * @param parts parts
     * @param pathInfo pathInfo
     * @param pathTranslated pathTranslated
     * @param protocol protocol
     * @param queryString queryString
     * @param reader reader
     * @param remoteAddr remoteAddr
     * @param remoteHost remoteHost
     * @param remotePort remotePort
     * @param remoteUser remoteUser
     * @param requestURI requestURI
     * @param requestURL requestURL
     * @param requestedSessionId requestedSessionId
     * @param requestedSessionIdFromCookie requestedSessionIdFromCookie
     * @param requestedSessionIdFromURL requestedSessionIdFromURL
     * @param requestedSessionIdFromUrl requestedSessionIdFromUrl
     * @param requestedSessionIdValid requestedSessionIdValid
     * @param scheme scheme
     * @param secure secure
     * @param serverName serverName
     * @param serverPort serverPort
     * @param servletContext servletContext
     * @param servletPath servletPath
     * @param session session
     * @param trailerFields trailerFields
     * @param trailerFieldsReady trailerFieldsReady
     * @param userPrincipal userPrincipal
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequest(GetWorkflowTransitionRuleConfigurationsRequestAsyncContext asyncContext, Boolean asyncStarted, Boolean asyncSupported, Object attributeNames, String authType, String characterEncoding, Integer contentLength, Long contentLengthLong, String contentType, String contextPath, List<GetWorkflowTransitionRuleConfigurationsRequestCookiesInner> cookies, DispatcherTypeEnum dispatcherType, Object headerNames, GetWorkflowTransitionRuleConfigurationsRequestHttpServletMapping httpServletMapping, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestInputStream inputStream, String localAddr, String localName, Integer localPort, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestLocale locale, Object locales, String method, Map<String, List<String>> parameterMap, Object parameterNames, List<GetWorkflowTransitionRuleConfigurationsRequestPartsInner> parts, String pathInfo, String pathTranslated, String protocol, String queryString, Object reader, String remoteAddr, String remoteHost, Integer remotePort, String remoteUser, String requestURI, GetWorkflowTransitionRuleConfigurationsRequestRequestURL requestURL, String requestedSessionId, Boolean requestedSessionIdFromCookie, Boolean requestedSessionIdFromURL, Boolean requestedSessionIdFromUrl, Boolean requestedSessionIdValid, String scheme, Boolean secure, String serverName, Integer serverPort, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContext servletContext, String servletPath, GetWorkflowTransitionRuleConfigurationsRequestSession session, Map<String, String> trailerFields, Boolean trailerFieldsReady, GetWorkflowTransitionRuleConfigurationsRequestUserPrincipal userPrincipal) {
        this.asyncContext = asyncContext;
        this.asyncStarted = asyncStarted;
        this.asyncSupported = asyncSupported;
        this.attributeNames = attributeNames;
        this.authType = authType;
        this.characterEncoding = characterEncoding;
        this.contentLength = contentLength;
        this.contentLengthLong = contentLengthLong;
        this.contentType = contentType;
        this.contextPath = contextPath;
        this.cookies = cookies;
        this.dispatcherType = dispatcherType;
        this.headerNames = headerNames;
        this.httpServletMapping = httpServletMapping;
        this.inputStream = inputStream;
        this.localAddr = localAddr;
        this.localName = localName;
        this.localPort = localPort;
        this.locale = locale;
        this.locales = locales;
        this.method = method;
        this.parameterMap = parameterMap;
        this.parameterNames = parameterNames;
        this.parts = parts;
        this.pathInfo = pathInfo;
        this.pathTranslated = pathTranslated;
        this.protocol = protocol;
        this.queryString = queryString;
        this.reader = reader;
        this.remoteAddr = remoteAddr;
        this.remoteHost = remoteHost;
        this.remotePort = remotePort;
        this.remoteUser = remoteUser;
        this.requestURI = requestURI;
        this.requestURL = requestURL;
        this.requestedSessionId = requestedSessionId;
        this.requestedSessionIdFromCookie = requestedSessionIdFromCookie;
        this.requestedSessionIdFromURL = requestedSessionIdFromURL;
        this.requestedSessionIdFromUrl = requestedSessionIdFromUrl;
        this.requestedSessionIdValid = requestedSessionIdValid;
        this.scheme = scheme;
        this.secure = secure;
        this.serverName = serverName;
        this.serverPort = serverPort;
        this.servletContext = servletContext;
        this.servletPath = servletPath;
        this.session = session;
        this.trailerFields = trailerFields;
        this.trailerFieldsReady = trailerFieldsReady;
        this.userPrincipal = userPrincipal;
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
