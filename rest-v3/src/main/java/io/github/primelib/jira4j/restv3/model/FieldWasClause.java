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
 * FieldWasClause
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "field",
    "operand",
    "operator",
    "predicates"
})
@JsonTypeName("FieldWasClause")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldWasClause {

    /**
     * Constructs a validated implementation of {@link FieldWasClause}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldWasClause(Consumer<FieldWasClause> spec) {
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
     * The list of time predicates.
     */
    @JsonProperty("predicates")
    protected List<JqlQueryClauseTimePredicate> predicates = new ArrayList<>();


    /**
     * The operator between the field and operand.
     */
    @AllArgsConstructor
    public enum OperatorEnum {
        WAS("was"),
        WAS_IN("was in"),
        WAS_NOT_IN("was not in"),
        WAS_NOT("was not");

        private final String value;
    }

}
