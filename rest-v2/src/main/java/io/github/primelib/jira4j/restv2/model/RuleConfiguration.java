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
 * RuleConfiguration
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
    "disabled",
    "tag",
    "value"
})
@JsonTypeName("RuleConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RuleConfiguration {

    /**
     * EXPERIMENTAL: Whether the rule is disabled.
     */
    @JsonProperty("disabled")
    protected Boolean disabled;

    /**
     * EXPERIMENTAL: A tag used to filter rules in [Get workflow transition rule configurations](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-workflow-transition-rules/#api-rest-api-3-workflow-rule-config-get).
     */
    @JsonProperty("tag")
    protected String tag;

    /**
     * Configuration of the rule, as it is stored by the Connect or the Forge app on the rule configuration page.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link RuleConfiguration}.
     *
     * @param spec the specification to process
     */
    public RuleConfiguration(Consumer<RuleConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RuleConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RuleConfiguration(Consumer)} instead.
     * @param disabled EXPERIMENTAL: Whether the rule is disabled.
     * @param tag EXPERIMENTAL: A tag used to filter rules in [Get workflow transition rule configurations](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-workflow-transition-rules/#api-rest-api-3-workflow-rule-config-get).
     * @param value Configuration of the rule, as it is stored by the Connect or the Forge app on the rule configuration page.
     */
    @ApiStatus.Internal
    public RuleConfiguration(Boolean disabled, String tag, String value) {
        this.disabled = disabled;
        this.tag = tag;
        this.value = value;
    }

}
