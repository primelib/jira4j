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
 * WorkflowCompoundCondition
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "conditions",
    "nodeType",
    "operator"
})
@JsonTypeName("WorkflowCompoundCondition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowCompoundCondition {

    /**
     * Constructs a validated implementation of {@link WorkflowCompoundCondition}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowCompoundCondition(Consumer<WorkflowCompoundCondition> spec) {
        spec.accept(this);
    }

    /**
     * The list of workflow conditions.
     */
    @JsonProperty("conditions")
    protected List<WorkflowCondition> conditions = new ArrayList<>();

    @JsonProperty("nodeType")
    protected String nodeType;

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
