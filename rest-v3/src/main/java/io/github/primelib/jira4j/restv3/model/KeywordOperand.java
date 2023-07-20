package io.github.primelib.jira4j.restv3.model;

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
 * KeywordOperand
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "keyword"
})
@JsonTypeName("KeywordOperand")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class KeywordOperand {

    /**
     * Constructs a validated implementation of {@link KeywordOperand}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public KeywordOperand(Consumer<KeywordOperand> spec) {
        spec.accept(this);
    }

    /**
     * The keyword that is the operand value.
     */
    @JsonProperty("keyword")
    protected KeywordEnum keyword;


    /**
     * The keyword that is the operand value.
     */
    @AllArgsConstructor
    public enum KeywordEnum {
        EMPTY("empty");

        private final String value;
    }

}
