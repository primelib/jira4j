package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowCondition
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "configuration",
    "nodeType",
    "type",
    "conditions",
    "operator"
})
@JsonTypeName("WorkflowCondition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowCondition {

    /**
     * Constructs a validated implementation of {@link WorkflowCondition}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowCondition(Consumer<WorkflowCondition> spec) {
        spec.accept(this);
    }

    /**
     * EXPERIMENTAL. The configuration of the transition rule.
     */
    @JsonProperty("configuration")
    protected Object _configuration;

    @JsonProperty("nodeType")
    protected String nodeType;

    /**
     * The type of the transition rule.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The list of workflow conditions.
     */
    @JsonProperty("conditions")
    protected List<WorkflowCondition> conditions = new ArrayList<>();

    /**
     * The compound condition operator.
     */
    @JsonProperty("operator")
    protected OperatorEnum operator;


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
