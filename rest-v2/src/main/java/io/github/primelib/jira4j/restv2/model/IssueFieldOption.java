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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueFieldOption
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
    "id",
    "properties",
    "value"
})
@JsonTypeName("IssueFieldOption")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueFieldOption {

    @JsonProperty("config")
    protected IssueFieldOptionConfiguration config;

    /**
     * The unique identifier for the option. This is only unique within the select field's set of options.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The properties of the object, as arbitrary key-value pairs. These properties can be searched using JQL, if the extractions (see [Issue Field Option Property Index](https://developer.atlassian.com/cloud/jira/platform/modules/issue-field-option-property-index/)) are defined in the descriptor for the issue field module.
     */
    @JsonProperty("properties")
    protected Map<String, Object> properties;

    /**
     * The option's name, which is displayed in Jira.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link IssueFieldOption}.
     *
     * @param spec the specification to process
     */
    public IssueFieldOption(Consumer<IssueFieldOption> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueFieldOption}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueFieldOption(Consumer)} instead.
     * @param config var.name
     * @param id The unique identifier for the option. This is only unique within the select field's set of options.
     * @param properties The properties of the object, as arbitrary key-value pairs. These properties can be searched using JQL, if the extractions (see [Issue Field Option Property Index](https://developer.atlassian.com/cloud/jira/platform/modules/issue-field-option-property-index/)) are defined in the descriptor for the issue field module.
     * @param value The option's name, which is displayed in Jira.
     */
    @ApiStatus.Internal
    public IssueFieldOption(IssueFieldOptionConfiguration config, Long id, Map<String, Object> properties, String value) {
        this.config = config;
        this.id = id;
        this.properties = properties;
        this.value = value;
    }

}
