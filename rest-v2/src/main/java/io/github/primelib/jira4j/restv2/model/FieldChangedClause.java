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
 * FieldChangedClause
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "field",
    "operator",
    "predicates"
})
@JsonTypeName("FieldChangedClause")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldChangedClause {

    /**
     * Constructs a validated implementation of {@link FieldChangedClause}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldChangedClause(Consumer<FieldChangedClause> spec) {
        spec.accept(this);
    }

    @JsonProperty("field")
    protected JqlQueryField field;

    /**
     * The operator applied to the field.
     */
    @JsonProperty("operator")
    protected OperatorEnum operator;

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
