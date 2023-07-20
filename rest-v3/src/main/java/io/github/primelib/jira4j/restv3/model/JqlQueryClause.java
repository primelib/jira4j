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
 * JqlQueryClause
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link JqlQueryClause}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JqlQueryClause(Consumer<JqlQueryClause> spec) {
        spec.accept(this);
    }

    /**
     * The list of nested clauses.
     */
    @JsonProperty("clauses")
    protected List<JqlQueryClause> clauses = new ArrayList<>();

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
    protected List<JqlQueryClauseTimePredicate> predicates = new ArrayList<>();


    /**
     * The operator applied to the field.
     */
    @AllArgsConstructor
    public enum OperatorEnum {
        CHANGED("changed");

        private final String value;
    }

}
