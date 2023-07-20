package io.github.primelib.jira4j.restv2.model;

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
 * JqlQueryClauseTimePredicate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "operand",
    "operator"
})
@JsonTypeName("JqlQueryClauseTimePredicate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlQueryClauseTimePredicate {

    /**
     * Constructs a validated implementation of {@link JqlQueryClauseTimePredicate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JqlQueryClauseTimePredicate(Consumer<JqlQueryClauseTimePredicate> spec) {
        spec.accept(this);
    }

    @JsonProperty("operand")
    protected JqlQueryClauseOperand operand;

    /**
     * The operator between the field and the operand.
     */
    @JsonProperty("operator")
    protected OperatorEnum operator;


    /**
     * The operator between the field and the operand.
     */
    @AllArgsConstructor
    public enum OperatorEnum {
        BEFORE("before"),
        AFTER("after"),
        FROM("from"),
        TO("to"),
        ON("on"),
        DURING("during"),
        BY("by");

        private final String value;
    }

}
