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
 * FieldValueClause
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "field",
    "operand",
    "operator"
})
@JsonTypeName("FieldValueClause")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldValueClause {

    /**
     * Constructs a validated implementation of {@link FieldValueClause}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldValueClause(Consumer<FieldValueClause> spec) {
        spec.accept(this);
    }

    @JsonProperty("field")
    protected JqlQueryField field;

    @JsonProperty("operand")
    protected JqlQueryClauseOperand operand;

    /**
     * The operator between the field and operand.
     */
    @JsonProperty("operator")
    protected OperatorEnum operator;


    /**
     * The operator between the field and operand.
     */
    @AllArgsConstructor
    public enum OperatorEnum {
        EQUAL("="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        LESS_THAN("<"),
        GREATER_THAN_OR_EQUAL_TO(">="),
        LESS_THAN_OR_EQUAL_TO("<="),
        IN("in"),
        NOT_IN("not in"),
        TILDE("~"),
        TILDE_EQUAL("~="),
        IS("is"),
        IS_NOT("is not");

        private final String value;
    }

}
