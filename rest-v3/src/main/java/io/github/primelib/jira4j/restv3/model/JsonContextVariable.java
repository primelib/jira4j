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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JsonContextVariable
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
    "type",
    "value"
})
@JsonTypeName("JsonContextVariable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JsonContextVariable {

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

    /**
     * Constructs a validated instance of {@link JsonContextVariable}.
     *
     * @param spec the specification to process
     */
    public JsonContextVariable(Consumer<JsonContextVariable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JsonContextVariable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JsonContextVariable(Consumer)} instead.
     * @param type Type of custom context variable.
     * @param value A JSON object containing custom content.
     */
    @ApiStatus.Internal
    public JsonContextVariable(String type, Object value) {
        this.type = type;
        this.value = value;
    }

}
