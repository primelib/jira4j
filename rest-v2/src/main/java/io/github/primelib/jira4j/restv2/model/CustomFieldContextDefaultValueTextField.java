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
 * CustomFieldContextDefaultValueTextField
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "text",
    "type"
})
@JsonTypeName("CustomFieldContextDefaultValueTextField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueTextField {

    /**
     * Constructs a validated implementation of {@link CustomFieldContextDefaultValueTextField}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueTextField(Consumer<CustomFieldContextDefaultValueTextField> spec) {
        spec.accept(this);
    }

    /**
     * The default text. The maximum length is 254 characters.
     */
    @JsonProperty("text")
    protected String text;

    @JsonProperty("type")
    protected String type;


}
