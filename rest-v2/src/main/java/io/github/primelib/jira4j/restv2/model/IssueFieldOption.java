package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueFieldOption
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "config",
    "id",
    "properties",
    "value"
})
@JsonTypeName("IssueFieldOption")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueFieldOption {

    /**
     * Constructs a validated implementation of {@link IssueFieldOption}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueFieldOption(Consumer<IssueFieldOption> spec) {
        spec.accept(this);
    }

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
    protected Map<String, Object> properties = new HashMap<>();

    /**
     * The option's name, which is displayed in Jira.
     */
    @JsonProperty("value")
    protected String value;


}
