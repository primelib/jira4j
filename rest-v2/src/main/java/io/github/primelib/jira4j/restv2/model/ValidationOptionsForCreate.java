package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ValidationOptionsForCreate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "levels"
})
@JsonTypeName("ValidationOptionsForCreate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ValidationOptionsForCreate {

    /**
     * Constructs a validated implementation of {@link ValidationOptionsForCreate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ValidationOptionsForCreate(Consumer<ValidationOptionsForCreate> spec) {
        spec.accept(this);
    }

    @JsonProperty("levels")
    protected List<LevelsEnum> levels;


    @AllArgsConstructor
    public enum LevelsEnum {
        WARNING("WARNING"),
        ERROR("ERROR");

        private final String value;
    }

}
