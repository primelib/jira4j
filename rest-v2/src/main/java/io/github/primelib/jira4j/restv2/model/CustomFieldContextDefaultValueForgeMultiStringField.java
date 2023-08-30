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
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldContextDefaultValueForgeMultiStringField
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
    "values"
})
@JsonTypeName("CustomFieldContextDefaultValueForgeMultiStringField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueForgeMultiStringField {

    @JsonProperty("type")
    protected String type;

    /**
     * List of string values. The maximum length for a value is 254 characters.
     */
    @JsonProperty("values")
    protected List<String> values;

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueForgeMultiStringField}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextDefaultValueForgeMultiStringField(Consumer<CustomFieldContextDefaultValueForgeMultiStringField> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueForgeMultiStringField}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextDefaultValueForgeMultiStringField(Consumer)} instead.
     * @param type type
     * @param values List of string values. The maximum length for a value is 254 characters.
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueForgeMultiStringField(String type, List<String> values) {
        this.type = type;
        this.values = values;
    }

}
