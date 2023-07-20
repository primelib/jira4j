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
 * PropertyKey
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "key",
    "self"
})
@JsonTypeName("PropertyKey")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PropertyKey {

    /**
     * Constructs a validated implementation of {@link PropertyKey}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PropertyKey(Consumer<PropertyKey> spec) {
        spec.accept(this);
    }

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


}
