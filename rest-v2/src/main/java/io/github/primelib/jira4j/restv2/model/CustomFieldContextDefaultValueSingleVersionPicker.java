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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldContextDefaultValueSingleVersionPicker
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
    "type",
    "versionId",
    "versionOrder"
})
@JsonTypeName("CustomFieldContextDefaultValueSingleVersionPicker")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueSingleVersionPicker {

    @JsonProperty("type")
    protected String type;

    /**
     * The ID of the default version.
     */
    @JsonProperty("versionId")
    protected String versionId;

    /**
     * The order the pickable versions are displayed in. If not provided, the released-first order is used. Available version orders are {@code "releasedFirst"} and {@code "unreleasedFirst"}.
     */
    @JsonProperty("versionOrder")
    protected String versionOrder;

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueSingleVersionPicker}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextDefaultValueSingleVersionPicker(Consumer<CustomFieldContextDefaultValueSingleVersionPicker> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueSingleVersionPicker}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextDefaultValueSingleVersionPicker(Consumer)} instead.
     * @param type type
     * @param versionId The ID of the default version.
     * @param versionOrder The order the pickable versions are displayed in. If not provided, the released-first order is used. Available version orders are {@code "releasedFirst"} and {@code "unreleasedFirst"}.
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueSingleVersionPicker(String type, String versionId, String versionOrder) {
        this.type = type;
        this.versionId = versionId;
        this.versionOrder = versionOrder;
    }

}
