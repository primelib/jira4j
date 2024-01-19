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
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListOperand
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
    "encodedOperand",
    "values"
})
@JsonTypeName("ListOperand")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListOperand {

    /**
     * Encoded operand, which can be used directly in a JQL query.
     */
    @JsonProperty("encodedOperand")
    protected String encodedOperand;

    /**
     * The list of operand values.
     */
    @JsonProperty("values")
    protected List<JqlQueryUnitaryOperand> values;

    /**
     * Constructs a validated instance of {@link ListOperand}.
     *
     * @param spec the specification to process
     */
    public ListOperand(Consumer<ListOperand> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListOperand}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListOperand(Consumer)} instead.
     * @param encodedOperand Encoded operand, which can be used directly in a JQL query.
     * @param values The list of operand values.
     */
    @ApiStatus.Internal
    public ListOperand(String encodedOperand, List<JqlQueryUnitaryOperand> values) {
        this.encodedOperand = encodedOperand;
        this.values = values;
    }

}
