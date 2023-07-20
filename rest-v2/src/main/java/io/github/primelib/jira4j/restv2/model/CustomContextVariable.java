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
 * CustomContextVariable
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type"
})
@JsonTypeName("CustomContextVariable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomContextVariable {

    /**
     * Constructs a validated implementation of {@link CustomContextVariable}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomContextVariable(Consumer<CustomContextVariable> spec) {
        spec.accept(this);
    }

    /**
     * Type of custom context variable.
     */
    @JsonProperty("type")
    protected String type;


}
