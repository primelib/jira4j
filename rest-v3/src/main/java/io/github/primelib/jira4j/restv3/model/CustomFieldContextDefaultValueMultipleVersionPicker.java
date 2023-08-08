package io.github.primelib.jira4j.restv3.model;

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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldContextDefaultValueMultipleVersionPicker
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
    "versionIds",
    "versionOrder"
})
@JsonTypeName("CustomFieldContextDefaultValueMultipleVersionPicker")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueMultipleVersionPicker {

    @JsonProperty("type")
    protected String type;

    /**
     * The IDs of the default versions.
     */
    @JsonProperty("versionIds")
    protected Set<String> versionIds;

    /**
     * The order the pickable versions are displayed in. If not provided, the released-first order is used. Available version orders are {@code "releasedFirst"} and {@code "unreleasedFirst"}.
     */
    @JsonProperty("versionOrder")
    protected String versionOrder;

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueMultipleVersionPicker}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextDefaultValueMultipleVersionPicker(Consumer<CustomFieldContextDefaultValueMultipleVersionPicker> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueMultipleVersionPicker}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextDefaultValueMultipleVersionPicker(Consumer)} instead.
     * @param type type
     * @param versionIds The IDs of the default versions.
     * @param versionOrder The order the pickable versions are displayed in. If not provided, the released-first order is used. Available version orders are {@code "releasedFirst"} and {@code "unreleasedFirst"}.
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueMultipleVersionPicker(String type, Set<String> versionIds, String versionOrder) {
        this.type = type;
        this.versionIds = versionIds;
        this.versionOrder = versionOrder;
    }

}
