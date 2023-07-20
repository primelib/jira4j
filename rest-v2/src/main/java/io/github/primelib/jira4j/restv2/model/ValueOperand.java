package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ValueOperand
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "encodedValue",
    "value"
})
@JsonTypeName("ValueOperand")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ValueOperand {

    /**
     * Constructs a validated implementation of {@link ValueOperand}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ValueOperand(Consumer<ValueOperand> spec) {
        spec.accept(this);
    }

    /**
     * Encoded value, which can be used directly in a JQL query.
     */
    @JsonProperty("encodedValue")
    protected String encodedValue;

    /**
     * The operand value.
     */
    @JsonProperty("value")
    protected String value;


}
