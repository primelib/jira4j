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
 * CustomFieldContextDefaultValueSingleVersionPicker
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "versionId",
    "versionOrder"
})
@JsonTypeName("CustomFieldContextDefaultValueSingleVersionPicker")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueSingleVersionPicker {

    /**
     * Constructs a validated implementation of {@link CustomFieldContextDefaultValueSingleVersionPicker}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueSingleVersionPicker(Consumer<CustomFieldContextDefaultValueSingleVersionPicker> spec) {
        spec.accept(this);
    }

    @JsonProperty("type")
    protected String type;

    /**
     * The ID of the default version.
     */
    @JsonProperty("versionId")
    protected String versionId;

    /**
     * The order the pickable versions are displayed in. If not provided, the released-first order is used. Available version orders are `"releasedFirst"` and `"unreleasedFirst"`.
     */
    @JsonProperty("versionOrder")
    protected String versionOrder;


}
