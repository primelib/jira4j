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
 * CustomFieldReplacement
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "customFieldId",
    "moveTo"
})
@JsonTypeName("CustomFieldReplacement")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldReplacement {

    /**
     * Constructs a validated implementation of {@link CustomFieldReplacement}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldReplacement(Consumer<CustomFieldReplacement> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the custom field in which to replace the version number.
     */
    @JsonProperty("customFieldId")
    protected Long customFieldId;

    /**
     * The version number to use as a replacement for the deleted version.
     */
    @JsonProperty("moveTo")
    protected Long moveTo;


}
