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
 * ListOperand
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "encodedOperand",
    "values"
})
@JsonTypeName("ListOperand")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListOperand {

    /**
     * Constructs a validated implementation of {@link ListOperand}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListOperand(Consumer<ListOperand> spec) {
        spec.accept(this);
    }

    /**
     * Encoded operand, which can be used directly in a JQL query.
     */
    @JsonProperty("encodedOperand")
    protected String encodedOperand;

    /**
     * The list of operand values.
     */
    @JsonProperty("values")
    protected List<JqlQueryUnitaryOperand> values = new ArrayList<>();


}
