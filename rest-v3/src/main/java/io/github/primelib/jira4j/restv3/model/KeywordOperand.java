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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * KeywordOperand
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
    "keyword"
})
@JsonTypeName("KeywordOperand")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class KeywordOperand {

    /**
     * The keyword that is the operand value.
     */
    @JsonProperty("keyword")
    protected KeywordEnum keyword;

    /**
     * Constructs a validated instance of {@link KeywordOperand}.
     *
     * @param spec the specification to process
     */
    public KeywordOperand(Consumer<KeywordOperand> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link KeywordOperand}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #KeywordOperand(Consumer)} instead.
     * @param keyword The keyword that is the operand value.
     */
    @ApiStatus.Internal
    public KeywordOperand(KeywordEnum keyword) {
        this.keyword = keyword;
    }

    /**
     * The keyword that is the operand value.
     */
    @AllArgsConstructor
    public enum KeywordEnum {
        EMPTY("empty");

        private static final KeywordEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static KeywordEnum of(String input) {
            if (input != null) {
                for (KeywordEnum v : VALUES) {
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
