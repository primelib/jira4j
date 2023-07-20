package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
 * IssueFieldOptionCreateBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "config",
    "properties",
    "value"
})
@JsonTypeName("IssueFieldOptionCreateBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueFieldOptionCreateBean extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link IssueFieldOptionCreateBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueFieldOptionCreateBean(Consumer<IssueFieldOptionCreateBean> spec) {
        spec.accept(this);
    }

    @JsonProperty("config")
    protected IssueFieldOptionConfiguration config;

    /**
     * The properties of the option as arbitrary key-value pairs. These properties can be searched using JQL, if the extractions (see https://developer.atlassian.com/cloud/jira/platform/modules/issue-field-option-property-index/) are defined in the descriptor for the issue field module.
     */
    @JsonProperty("properties")
    protected Map<String, Object> properties = new HashMap<>();

    /**
     * The option's name, which is displayed in Jira.
     */
    @JsonProperty("value")
    protected String value;


}
