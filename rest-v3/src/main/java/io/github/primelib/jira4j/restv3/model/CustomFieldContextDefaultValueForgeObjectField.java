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
 * CustomFieldContextDefaultValueForgeObjectField
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "object",
    "type"
})
@JsonTypeName("CustomFieldContextDefaultValueForgeObjectField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueForgeObjectField {

    /**
     * Constructs a validated implementation of {@link CustomFieldContextDefaultValueForgeObjectField}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueForgeObjectField(Consumer<CustomFieldContextDefaultValueForgeObjectField> spec) {
        spec.accept(this);
    }

    /**
     * The default JSON object.
     */
    @JsonProperty("object")
    protected Object _object;

    @JsonProperty("type")
    protected String type;


}
