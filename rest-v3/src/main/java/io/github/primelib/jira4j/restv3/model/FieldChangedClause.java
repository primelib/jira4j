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
 * FieldChangedClause
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
    "operator",
    "predicates"
})
@JsonTypeName("FieldChangedClause")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldChangedClause {

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
    protected List<JqlQueryClauseTimePredicate> predicates;

    /**
     * Constructs a validated instance of {@link FieldChangedClause}.
     *
     * @param spec the specification to process
     */
    public FieldChangedClause(Consumer<FieldChangedClause> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldChangedClause}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldChangedClause(Consumer)} instead.
     * @param field var.name
     * @param operator The operator applied to the field.
     * @param predicates The list of time predicates.
     */
    @ApiStatus.Internal
    public FieldChangedClause(JqlQueryField field, OperatorEnum operator, List<JqlQueryClauseTimePredicate> predicates) {
        this.field = field;
        this.operator = operator;
        this.predicates = predicates;
    }

    /**
     * The operator applied to the field.
     */
    @AllArgsConstructor
    public enum OperatorEnum {
        CHANGED("changed");

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
