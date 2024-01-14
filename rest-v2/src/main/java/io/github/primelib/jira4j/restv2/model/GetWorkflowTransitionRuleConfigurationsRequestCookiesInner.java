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
 * GetWorkflowTransitionRuleConfigurationsRequestCookiesInner
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
    "comment",
    "domain",
    "httpOnly",
    "maxAge",
    "name",
    "path",
    "secure",
    "value",
    "version"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_cookies_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestCookiesInner {

    @JsonProperty("comment")
    protected String comment;

    @JsonProperty("domain")
    protected String domain;

    @JsonProperty("httpOnly")
    protected Boolean httpOnly;

    @JsonProperty("maxAge")
    protected Integer maxAge;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("path")
    protected String path;

    @JsonProperty("secure")
    protected Boolean secure;

    @JsonProperty("value")
    protected String value;

    @JsonProperty("version")
    protected Integer version;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestCookiesInner}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestCookiesInner(Consumer<GetWorkflowTransitionRuleConfigurationsRequestCookiesInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestCookiesInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestCookiesInner(Consumer)} instead.
     * @param comment comment
     * @param domain domain
     * @param httpOnly httpOnly
     * @param maxAge maxAge
     * @param name name
     * @param path path
     * @param secure secure
     * @param value value
     * @param version version
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestCookiesInner(String comment, String domain, Boolean httpOnly, Integer maxAge, String name, String path, Boolean secure, String value, Integer version) {
        this.comment = comment;
        this.domain = domain;
        this.httpOnly = httpOnly;
        this.maxAge = maxAge;
        this.name = name;
        this.path = path;
        this.secure = secure;
        this.value = value;
        this.version = version;
    }

}
