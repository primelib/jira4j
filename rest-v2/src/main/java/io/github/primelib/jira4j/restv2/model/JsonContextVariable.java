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
 * JsonContextVariable
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "value"
})
@JsonTypeName("JsonContextVariable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JsonContextVariable {

    /**
     * Constructs a validated implementation of {@link JsonContextVariable}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JsonContextVariable(Consumer<JsonContextVariable> spec) {
        spec.accept(this);
    }

    /**
     * Type of custom context variable.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * A JSON object containing custom content.
     */
    @JsonProperty("value")
    protected Object value;


}
