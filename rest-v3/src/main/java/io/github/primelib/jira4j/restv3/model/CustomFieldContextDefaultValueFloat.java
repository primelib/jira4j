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
 * CustomFieldContextDefaultValueFloat
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "number",
    "type"
})
@JsonTypeName("CustomFieldContextDefaultValueFloat")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueFloat {

    /**
     * Constructs a validated implementation of {@link CustomFieldContextDefaultValueFloat}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueFloat(Consumer<CustomFieldContextDefaultValueFloat> spec) {
        spec.accept(this);
    }

    /**
     * The default floating-point number.
     */
    @JsonProperty("number")
    protected Double number;

    @JsonProperty("type")
    protected String type;


}
