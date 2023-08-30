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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldContextDefaultValueForgeObjectField
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
    "object",
    "type"
})
@JsonTypeName("CustomFieldContextDefaultValueForgeObjectField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueForgeObjectField {

    /**
     * The default JSON object.
     */
    @JsonProperty("object")
    protected Object object;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueForgeObjectField}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextDefaultValueForgeObjectField(Consumer<CustomFieldContextDefaultValueForgeObjectField> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueForgeObjectField}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextDefaultValueForgeObjectField(Consumer)} instead.
     * @param object The default JSON object.
     * @param type type
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueForgeObjectField(Object object, String type) {
        this.object = object;
        this.type = type;
    }

}
