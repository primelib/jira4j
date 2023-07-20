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
 * CustomFieldOptionCreate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "disabled",
    "optionId",
    "value"
})
@JsonTypeName("CustomFieldOptionCreate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldOptionCreate {

    /**
     * Constructs a validated implementation of {@link CustomFieldOptionCreate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldOptionCreate(Consumer<CustomFieldOptionCreate> spec) {
        spec.accept(this);
    }

    /**
     * Whether the option is disabled.
     */
    @JsonProperty("disabled")
    protected Boolean disabled;

    /**
     * For cascading options, the ID of the custom field object containing the cascading option.
     */
    @JsonProperty("optionId")
    protected String optionId;

    /**
     * The value of the custom field option.
     */
    @JsonProperty("value")
    protected String value;


}
