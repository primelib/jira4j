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

import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContext
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
    "attributeNames",
    "classLoader",
    "contextPath",
    "defaultSessionTrackingModes",
    "effectiveMajorVersion",
    "effectiveMinorVersion",
    "effectiveSessionTrackingModes",
    "filterRegistrations",
    "initParameterNames",
    "jspConfigDescriptor",
    "majorVersion",
    "minorVersion",
    "requestCharacterEncoding",
    "responseCharacterEncoding",
    "serverInfo",
    "servletContextName",
    "servletNames",
    "servletRegistrations",
    "servlets",
    "sessionCookieConfig",
    "sessionTimeout",
    "sessionTrackingModes",
    "virtualServerName"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_asyncContext_request_servletContext")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContext {

    @JsonProperty("attributeNames")
    protected Object attributeNames;

    @JsonProperty("classLoader")
    protected GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoader classLoader;

    @JsonProperty("contextPath")
    protected String contextPath;

    @JsonProperty("defaultSessionTrackingModes")
    protected Set<DefaultSessionTrackingModesEnum> defaultSessionTrackingModes;

    @JsonProperty("effectiveMajorVersion")
    protected Integer effectiveMajorVersion;

    @JsonProperty("effectiveMinorVersion")
    protected Integer effectiveMinorVersion;

    @JsonProperty("effectiveSessionTrackingModes")
    protected Set<EffectiveSessionTrackingModesEnum> effectiveSessionTrackingModes;

    @JsonProperty("filterRegistrations")
    protected Map<String, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextFilterRegistrationsValue> filterRegistrations;

    @JsonProperty("initParameterNames")
    protected Object initParameterNames;

    @JsonProperty("jspConfigDescriptor")
    protected GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptor jspConfigDescriptor;

    @JsonProperty("majorVersion")
    protected Integer majorVersion;

    @JsonProperty("minorVersion")
    protected Integer minorVersion;

    @JsonProperty("requestCharacterEncoding")
    protected String requestCharacterEncoding;

    @JsonProperty("responseCharacterEncoding")
    protected String responseCharacterEncoding;

    @JsonProperty("serverInfo")
    protected String serverInfo;

    @JsonProperty("servletContextName")
    protected String servletContextName;

    @JsonProperty("servletNames")
    protected Object servletNames;

    @JsonProperty("servletRegistrations")
    protected Map<String, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextServletRegistrationsValue> servletRegistrations;

    @JsonProperty("servlets")
    protected Object servlets;

    @JsonProperty("sessionCookieConfig")
    protected GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextSessionCookieConfig sessionCookieConfig;

    @JsonProperty("sessionTimeout")
    protected Integer sessionTimeout;

    @JsonProperty("sessionTrackingModes")
    protected Set<SessionTrackingModesEnum> sessionTrackingModes;

    @JsonProperty("virtualServerName")
    protected String virtualServerName;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContext}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContext(Consumer<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContext> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContext}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContext(Consumer)} instead.
     * @param attributeNames attributeNames
     * @param classLoader classLoader
     * @param contextPath contextPath
     * @param defaultSessionTrackingModes defaultSessionTrackingModes
     * @param effectiveMajorVersion effectiveMajorVersion
     * @param effectiveMinorVersion effectiveMinorVersion
     * @param effectiveSessionTrackingModes effectiveSessionTrackingModes
     * @param filterRegistrations filterRegistrations
     * @param initParameterNames initParameterNames
     * @param jspConfigDescriptor jspConfigDescriptor
     * @param majorVersion majorVersion
     * @param minorVersion minorVersion
     * @param requestCharacterEncoding requestCharacterEncoding
     * @param responseCharacterEncoding responseCharacterEncoding
     * @param serverInfo serverInfo
     * @param servletContextName servletContextName
     * @param servletNames servletNames
     * @param servletRegistrations servletRegistrations
     * @param servlets servlets
     * @param sessionCookieConfig sessionCookieConfig
     * @param sessionTimeout sessionTimeout
     * @param sessionTrackingModes sessionTrackingModes
     * @param virtualServerName virtualServerName
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContext(Object attributeNames, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextClassLoader classLoader, String contextPath, Set<DefaultSessionTrackingModesEnum> defaultSessionTrackingModes, Integer effectiveMajorVersion, Integer effectiveMinorVersion, Set<EffectiveSessionTrackingModesEnum> effectiveSessionTrackingModes, Map<String, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextFilterRegistrationsValue> filterRegistrations, Object initParameterNames, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextJspConfigDescriptor jspConfigDescriptor, Integer majorVersion, Integer minorVersion, String requestCharacterEncoding, String responseCharacterEncoding, String serverInfo, String servletContextName, Object servletNames, Map<String, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextServletRegistrationsValue> servletRegistrations, Object servlets, GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestServletContextSessionCookieConfig sessionCookieConfig, Integer sessionTimeout, Set<SessionTrackingModesEnum> sessionTrackingModes, String virtualServerName) {
        this.attributeNames = attributeNames;
        this.classLoader = classLoader;
        this.contextPath = contextPath;
        this.defaultSessionTrackingModes = defaultSessionTrackingModes;
        this.effectiveMajorVersion = effectiveMajorVersion;
        this.effectiveMinorVersion = effectiveMinorVersion;
        this.effectiveSessionTrackingModes = effectiveSessionTrackingModes;
        this.filterRegistrations = filterRegistrations;
        this.initParameterNames = initParameterNames;
        this.jspConfigDescriptor = jspConfigDescriptor;
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
        this.requestCharacterEncoding = requestCharacterEncoding;
        this.responseCharacterEncoding = responseCharacterEncoding;
        this.serverInfo = serverInfo;
        this.servletContextName = servletContextName;
        this.servletNames = servletNames;
        this.servletRegistrations = servletRegistrations;
        this.servlets = servlets;
        this.sessionCookieConfig = sessionCookieConfig;
        this.sessionTimeout = sessionTimeout;
        this.sessionTrackingModes = sessionTrackingModes;
        this.virtualServerName = virtualServerName;
    }

    @AllArgsConstructor
    public enum DefaultSessionTrackingModesEnum {
        COOKIE("COOKIE"),
        URL("URL"),
        SSL("SSL");

        private static final DefaultSessionTrackingModesEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static DefaultSessionTrackingModesEnum of(String input) {
            if (input != null) {
                for (DefaultSessionTrackingModesEnum v : VALUES) {
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

    @AllArgsConstructor
    public enum EffectiveSessionTrackingModesEnum {
        COOKIE("COOKIE"),
        URL("URL"),
        SSL("SSL");

        private static final EffectiveSessionTrackingModesEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static EffectiveSessionTrackingModesEnum of(String input) {
            if (input != null) {
                for (EffectiveSessionTrackingModesEnum v : VALUES) {
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

    @AllArgsConstructor
    public enum SessionTrackingModesEnum {
        COOKIE("COOKIE"),
        URL("URL"),
        SSL("SSL");

        private static final SessionTrackingModesEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static SessionTrackingModesEnum of(String input) {
            if (input != null) {
                for (SessionTrackingModesEnum v : VALUES) {
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
