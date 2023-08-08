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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ValidationOptionsForCreate
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
    "levels"
})
@JsonTypeName("ValidationOptionsForCreate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ValidationOptionsForCreate {

    @JsonProperty("levels")
    protected List<LevelsEnum> levels;

    /**
     * Constructs a validated instance of {@link ValidationOptionsForCreate}.
     *
     * @param spec the specification to process
     */
    public ValidationOptionsForCreate(Consumer<ValidationOptionsForCreate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ValidationOptionsForCreate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ValidationOptionsForCreate(Consumer)} instead.
     * @param levels levels
     */
    @ApiStatus.Internal
    public ValidationOptionsForCreate(List<LevelsEnum> levels) {
        this.levels = levels;
    }

    @AllArgsConstructor
    public enum LevelsEnum {
        WARNING("WARNING"),
        ERROR("ERROR");

        private static final LevelsEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static LevelsEnum of(String input) {
            if (input != null) {
                for (LevelsEnum v : VALUES) {
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
