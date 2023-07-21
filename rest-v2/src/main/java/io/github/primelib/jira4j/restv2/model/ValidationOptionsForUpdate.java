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
 * ValidationOptionsForUpdate
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
@JsonTypeName("ValidationOptionsForUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ValidationOptionsForUpdate {

    @JsonProperty("levels")
    protected List<LevelsEnum> levels;

    /**
     * Constructs a validated instance of {@link ValidationOptionsForUpdate}.
     *
     * @param spec the specification to process
     */
    public ValidationOptionsForUpdate(Consumer<ValidationOptionsForUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ValidationOptionsForUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ValidationOptionsForUpdate(Consumer)} instead.
     * @param levels var.name
     */
    @ApiStatus.Internal
    public ValidationOptionsForUpdate(List<LevelsEnum> levels) {
        this.levels = levels;
    }

    @AllArgsConstructor
    public enum LevelsEnum {
        WARNING("WARNING"),
        ERROR("ERROR");

        private final String value;
    }

}
