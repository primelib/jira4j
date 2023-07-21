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

/**
 * JqlQueryClause
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
    "clauses",
    "operator",
    "field",
    "operand",
    "predicates"
})
@JsonTypeName("JqlQueryClause")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlQueryClause {

    /**
     * The list of nested clauses.
     */
    @JsonProperty("clauses")
    protected List<JqlQueryClause> clauses;

    /**
     * The operator applied to the field.
     */
    @JsonProperty("operator")
    protected OperatorEnum operator;

    @JsonProperty("field")
    protected JqlQueryField field;

    @JsonProperty("operand")
    protected JqlQueryClauseOperand operand;

    /**
     * The list of time predicates.
     */
    @JsonProperty("predicates")
    protected List<JqlQueryClauseTimePredicate> predicates;

    /**
     * Constructs a validated instance of {@link JqlQueryClause}.
     *
     * @param spec the specification to process
     */
    public JqlQueryClause(Consumer<JqlQueryClause> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JqlQueryClause}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JqlQueryClause(Consumer)} instead.
     * @param clauses The list of nested clauses.
     * @param operator The operator applied to the field.
     * @param field var.name
     * @param operand var.name
     * @param predicates The list of time predicates.
     */
    @ApiStatus.Internal
    public JqlQueryClause(List<JqlQueryClause> clauses, OperatorEnum operator, JqlQueryField field, JqlQueryClauseOperand operand, List<JqlQueryClauseTimePredicate> predicates) {
        this.clauses = clauses;
        this.operator = operator;
        this.field = field;
        this.operand = operand;
        this.predicates = predicates;
    }

    /**
     * The operator applied to the field.
     */
    @AllArgsConstructor
    public enum OperatorEnum {
        CHANGED("changed");

        private final String value;
    }

}
