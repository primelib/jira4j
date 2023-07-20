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
 * CustomFieldOptionUpdate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "disabled",
    "id",
    "value"
})
@JsonTypeName("CustomFieldOptionUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldOptionUpdate {

    /**
     * Constructs a validated implementation of {@link CustomFieldOptionUpdate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldOptionUpdate(Consumer<CustomFieldOptionUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Whether the option is disabled.
     */
    @JsonProperty("disabled")
    protected Boolean disabled;

    /**
     * The ID of the custom field option.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The value of the custom field option.
     */
    @JsonProperty("value")
    protected String value;


}
