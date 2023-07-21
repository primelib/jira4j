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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CompoundClause
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
    "operator"
})
@JsonTypeName("CompoundClause")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CompoundClause {

    /**
     * The list of nested clauses.
     */
    @JsonProperty("clauses")
    protected List<JqlQueryClause> clauses;

    /**
     * The operator between the clauses.
     */
    @JsonProperty("operator")
    protected OperatorEnum operator;

    /**
     * Constructs a validated instance of {@link CompoundClause}.
     *
     * @param spec the specification to process
     */
    public CompoundClause(Consumer<CompoundClause> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CompoundClause}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CompoundClause(Consumer)} instead.
     * @param clauses The list of nested clauses.
     * @param operator The operator between the clauses.
     */
    @ApiStatus.Internal
    public CompoundClause(List<JqlQueryClause> clauses, OperatorEnum operator) {
        this.clauses = clauses;
        this.operator = operator;
    }

    /**
     * The operator between the clauses.
     */
    @AllArgsConstructor
    public enum OperatorEnum {
        AND("and"),
        OR("or"),
        NOT("not");

        private final String value;
    }

}
