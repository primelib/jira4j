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
 * CustomFieldContextDefaultValueCascadingOption
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "cascadingOptionId",
    "contextId",
    "optionId",
    "type"
})
@JsonTypeName("CustomFieldContextDefaultValueCascadingOption")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueCascadingOption {

    /**
     * Constructs a validated implementation of {@link CustomFieldContextDefaultValueCascadingOption}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueCascadingOption(Consumer<CustomFieldContextDefaultValueCascadingOption> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the default cascading option.
     */
    @JsonProperty("cascadingOptionId")
    protected String cascadingOptionId;

    /**
     * The ID of the context.
     */
    @JsonProperty("contextId")
    protected String contextId;

    /**
     * The ID of the default option.
     */
    @JsonProperty("optionId")
    protected String optionId;

    @JsonProperty("type")
    protected String type;


}
