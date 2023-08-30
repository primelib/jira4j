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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PropertyKey
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
    "key",
    "self"
})
@JsonTypeName("PropertyKey")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PropertyKey {

    /**
     * The key of the property.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The URL of the property.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * Constructs a validated instance of {@link PropertyKey}.
     *
     * @param spec the specification to process
     */
    public PropertyKey(Consumer<PropertyKey> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PropertyKey}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PropertyKey(Consumer)} instead.
     * @param key The key of the property.
     * @param self The URL of the property.
     */
    @ApiStatus.Internal
    public PropertyKey(String key, String self) {
        this.key = key;
        this.self = self;
    }

}
