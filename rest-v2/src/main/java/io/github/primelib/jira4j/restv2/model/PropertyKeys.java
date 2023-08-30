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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PropertyKeys
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
    "keys"
})
@JsonTypeName("PropertyKeys")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PropertyKeys {

    /**
     * Property key details.
     */
    @JsonProperty("keys")
    protected List<PropertyKey> keys;

    /**
     * Constructs a validated instance of {@link PropertyKeys}.
     *
     * @param spec the specification to process
     */
    public PropertyKeys(Consumer<PropertyKeys> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PropertyKeys}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PropertyKeys(Consumer)} instead.
     * @param keys Property key details.
     */
    @ApiStatus.Internal
    public PropertyKeys(List<PropertyKey> keys) {
        this.keys = keys;
    }

}
