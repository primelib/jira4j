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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueFieldOptionCreateBean
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
    "config",
    "properties",
    "value"
})
@JsonTypeName("IssueFieldOptionCreateBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueFieldOptionCreateBean {

    @JsonProperty("config")
    protected IssueFieldOptionConfiguration config;

    /**
     * The properties of the option as arbitrary key-value pairs. These properties can be searched using JQL, if the extractions (see https://developer.atlassian.com/cloud/jira/platform/modules/issue-field-option-property-index/) are defined in the descriptor for the issue field module.
     */
    @JsonProperty("properties")
    protected Map<String, Object> properties;

    /**
     * The option's name, which is displayed in Jira.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link IssueFieldOptionCreateBean}.
     *
     * @param spec the specification to process
     */
    public IssueFieldOptionCreateBean(Consumer<IssueFieldOptionCreateBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueFieldOptionCreateBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueFieldOptionCreateBean(Consumer)} instead.
     * @param config config
     * @param properties The properties of the option as arbitrary key-value pairs. These properties can be searched using JQL, if the extractions (see https://developer.atlassian.com/cloud/jira/platform/modules/issue-field-option-property-index/) are defined in the descriptor for the issue field module.
     * @param value The option's name, which is displayed in Jira.
     */
    @ApiStatus.Internal
    public IssueFieldOptionCreateBean(IssueFieldOptionConfiguration config, Map<String, Object> properties, String value) {
        this.config = config;
        this.properties = properties;
        this.value = value;
    }

}
