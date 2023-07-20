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
 * CustomFieldContextOption
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "disabled",
    "id",
    "optionId",
    "value"
})
@JsonTypeName("CustomFieldContextOption")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextOption {

    /**
     * Constructs a validated implementation of {@link CustomFieldContextOption}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldContextOption(Consumer<CustomFieldContextOption> spec) {
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
     * For cascading options, the ID of the custom field option containing the cascading option.
     */
    @JsonProperty("optionId")
    protected String optionId;

    /**
     * The value of the custom field option.
     */
    @JsonProperty("value")
    protected String value;


}
