package io.github.primelib.jira4j.restv2.model;

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
 * CompoundClause
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "clauses",
    "operator"
})
@JsonTypeName("CompoundClause")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CompoundClause {

    /**
     * Constructs a validated implementation of {@link CompoundClause}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CompoundClause(Consumer<CompoundClause> spec) {
        spec.accept(this);
    }

    /**
     * The list of nested clauses.
     */
    @JsonProperty("clauses")
    protected List<JqlQueryClause> clauses = new ArrayList<>();

    /**
     * The operator between the clauses.
     */
    @JsonProperty("operator")
    protected OperatorEnum operator;


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
