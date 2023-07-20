package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RuleConfiguration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "disabled",
    "tag",
    "value"
})
@JsonTypeName("RuleConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RuleConfiguration {

    /**
     * Constructs a validated implementation of {@link RuleConfiguration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RuleConfiguration(Consumer<RuleConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * EXPERIMENTAL: Whether the rule is disabled.
     */
    @JsonProperty("disabled")
    protected Boolean disabled = false;

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


}
