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
 * CustomFieldContextDefaultValueUpdate
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
    "defaultValues"
})
@JsonTypeName("CustomFieldContextDefaultValueUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueUpdate {

    @JsonProperty("defaultValues")
    protected List<CustomFieldContextDefaultValue> defaultValues;

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueUpdate}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextDefaultValueUpdate(Consumer<CustomFieldContextDefaultValueUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextDefaultValueUpdate(Consumer)} instead.
     * @param defaultValues var.name
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueUpdate(List<CustomFieldContextDefaultValue> defaultValues) {
        this.defaultValues = defaultValues;
    }

}
