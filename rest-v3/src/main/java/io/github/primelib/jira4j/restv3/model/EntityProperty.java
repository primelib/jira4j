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
 * EntityProperty
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "key",
    "value"
})
@JsonTypeName("EntityProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EntityProperty {

    /**
     * Constructs a validated implementation of {@link EntityProperty}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EntityProperty(Consumer<EntityProperty> spec) {
        spec.accept(this);
    }

    /**
     * The key of the property. Required on create and update.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The value of the property. Required on create and update.
     */
    @JsonProperty("value")
    protected Object value = null;


}
