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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * FieldWasClause
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
    "operator",
    "predicates"
})
@JsonTypeName("FieldWasClause")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldWasClause {

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
     * The list of time predicates.
     */
    @JsonProperty("predicates")
    protected List<JqlQueryClauseTimePredicate> predicates;

    /**
     * Constructs a validated instance of {@link FieldWasClause}.
     *
     * @param spec the specification to process
     */
    public FieldWasClause(Consumer<FieldWasClause> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldWasClause}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldWasClause(Consumer)} instead.
     * @param field field
     * @param operand operand
     * @param operator The operator between the field and operand.
     * @param predicates The list of time predicates.
     */
    @ApiStatus.Internal
    public FieldWasClause(JqlQueryField field, JqlQueryClauseOperand operand, OperatorEnum operator, List<JqlQueryClauseTimePredicate> predicates) {
        this.field = field;
        this.operand = operand;
        this.operator = operator;
        this.predicates = predicates;
    }

    /**
     * The operator between the field and operand.
     */
    @AllArgsConstructor
    public enum OperatorEnum {
        WAS("was"),
        WAS_IN("was in"),
        WAS_NOT_IN("was not in"),
        WAS_NOT("was not");

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
