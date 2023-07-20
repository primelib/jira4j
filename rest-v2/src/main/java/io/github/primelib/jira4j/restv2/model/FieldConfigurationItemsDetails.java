package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldConfigurationItemsDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "fieldConfigurationItems"
})
@JsonTypeName("FieldConfigurationItemsDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldConfigurationItemsDetails {

    /**
     * Constructs a validated implementation of {@link FieldConfigurationItemsDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldConfigurationItemsDetails(Consumer<FieldConfigurationItemsDetails> spec) {
        spec.accept(this);
    }

    /**
     * Details of fields in a field configuration.
     */
    @JsonProperty("fieldConfigurationItems")
    protected List<FieldConfigurationItem> fieldConfigurationItems = new ArrayList<>();


}
