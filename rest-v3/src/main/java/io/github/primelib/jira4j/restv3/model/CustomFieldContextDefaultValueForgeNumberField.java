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
 * CustomFieldContextDefaultValueForgeNumberField
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "contextId",
    "number",
    "type"
})
@JsonTypeName("CustomFieldContextDefaultValueForgeNumberField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueForgeNumberField {

    /**
     * Constructs a validated implementation of {@link CustomFieldContextDefaultValueForgeNumberField}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueForgeNumberField(Consumer<CustomFieldContextDefaultValueForgeNumberField> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the context.
     */
    @JsonProperty("contextId")
    protected String contextId;

    /**
     * The default floating-point number.
     */
    @JsonProperty("number")
    protected Double number;

    @JsonProperty("type")
    protected String type;


}
