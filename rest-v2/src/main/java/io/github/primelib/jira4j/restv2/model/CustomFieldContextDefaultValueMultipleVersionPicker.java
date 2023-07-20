package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldContextDefaultValueMultipleVersionPicker
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "versionIds",
    "versionOrder"
})
@JsonTypeName("CustomFieldContextDefaultValueMultipleVersionPicker")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueMultipleVersionPicker {

    /**
     * Constructs a validated implementation of {@link CustomFieldContextDefaultValueMultipleVersionPicker}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueMultipleVersionPicker(Consumer<CustomFieldContextDefaultValueMultipleVersionPicker> spec) {
        spec.accept(this);
    }

    @JsonProperty("type")
    protected String type;

    /**
     * The IDs of the default versions.
     */
    @JsonProperty("versionIds")
    protected Set<String> versionIds = new LinkedHashSet<>();

    /**
     * The order the pickable versions are displayed in. If not provided, the released-first order is used. Available version orders are `"releasedFirst"` and `"unreleasedFirst"`.
     */
    @JsonProperty("versionOrder")
    protected String versionOrder;


}
