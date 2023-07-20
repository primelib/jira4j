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
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWorkflowCondition
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "conditions",
    "configuration",
    "operator",
    "type"
})
@JsonTypeName("CreateWorkflowCondition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateWorkflowCondition {

    /**
     * Constructs a validated implementation of {@link CreateWorkflowCondition}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateWorkflowCondition(Consumer<CreateWorkflowCondition> spec) {
        spec.accept(this);
    }

    /**
     * The list of workflow conditions.
     */
    @JsonProperty("conditions")
    protected List<CreateWorkflowCondition> conditions;

    /**
     * EXPERIMENTAL. The configuration of the transition rule.
     */
    @JsonProperty("configuration")
    protected Map<String, Object> _configuration = new HashMap<>();

    /**
     * The compound condition operator.
     */
    @JsonProperty("operator")
    protected OperatorEnum operator;

    /**
     * The type of the transition rule.
     */
    @JsonProperty("type")
    protected String type;


    /**
     * The compound condition operator.
     */
    @AllArgsConstructor
    public enum OperatorEnum {
        AND("AND"),
        OR("OR");

        private final String value;
    }

}
