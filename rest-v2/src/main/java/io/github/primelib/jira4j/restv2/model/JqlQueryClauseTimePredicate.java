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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * JqlQueryClauseTimePredicate
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
    "operand",
    "operator"
})
@JsonTypeName("JqlQueryClauseTimePredicate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlQueryClauseTimePredicate {

    @JsonProperty("operand")
    protected JqlQueryClauseOperand operand;

    /**
     * The operator between the field and the operand.
     */
    @JsonProperty("operator")
    protected OperatorEnum operator;

    /**
     * Constructs a validated instance of {@link JqlQueryClauseTimePredicate}.
     *
     * @param spec the specification to process
     */
    public JqlQueryClauseTimePredicate(Consumer<JqlQueryClauseTimePredicate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JqlQueryClauseTimePredicate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JqlQueryClauseTimePredicate(Consumer)} instead.
     * @param operand operand
     * @param operator The operator between the field and the operand.
     */
    @ApiStatus.Internal
    public JqlQueryClauseTimePredicate(JqlQueryClauseOperand operand, OperatorEnum operator) {
        this.operand = operand;
        this.operator = operator;
    }

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
