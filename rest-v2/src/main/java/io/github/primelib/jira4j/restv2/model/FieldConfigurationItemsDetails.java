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
 * FieldConfigurationItemsDetails
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
    "fieldConfigurationItems"
})
@JsonTypeName("FieldConfigurationItemsDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldConfigurationItemsDetails {

    /**
     * Details of fields in a field configuration.
     */
    @JsonProperty("fieldConfigurationItems")
    protected List<FieldConfigurationItem> fieldConfigurationItems;

    /**
     * Constructs a validated instance of {@link FieldConfigurationItemsDetails}.
     *
     * @param spec the specification to process
     */
    public FieldConfigurationItemsDetails(Consumer<FieldConfigurationItemsDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldConfigurationItemsDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldConfigurationItemsDetails(Consumer)} instead.
     * @param fieldConfigurationItems Details of fields in a field configuration.
     */
    @ApiStatus.Internal
    public FieldConfigurationItemsDetails(List<FieldConfigurationItem> fieldConfigurationItems) {
        this.fieldConfigurationItems = fieldConfigurationItems;
    }

}
