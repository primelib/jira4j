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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * FieldValueClause
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
    "field",
    "operand",
    "operator"
})
@JsonTypeName("FieldValueClause")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldValueClause {

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
     * Constructs a validated instance of {@link FieldValueClause}.
     *
     * @param spec the specification to process
     */
    public FieldValueClause(Consumer<FieldValueClause> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldValueClause}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldValueClause(Consumer)} instead.
     * @param field field
     * @param operand operand
     * @param operator The operator between the field and operand.
     */
    @ApiStatus.Internal
    public FieldValueClause(JqlQueryField field, JqlQueryClauseOperand operand, OperatorEnum operator) {
        this.field = field;
        this.operand = operand;
        this.operator = operator;
    }

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

        private static final OperatorEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static OperatorEnum of(String input) {
            if (input != null) {
                for (OperatorEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
