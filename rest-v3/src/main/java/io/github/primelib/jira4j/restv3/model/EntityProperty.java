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
 * EntityProperty
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
    "value"
})
@JsonTypeName("EntityProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EntityProperty {

    /**
     * The key of the property. Required on create and update.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The value of the property. Required on create and update.
     */
    @JsonProperty("value")
    protected Object value;

    /**
     * Constructs a validated instance of {@link EntityProperty}.
     *
     * @param spec the specification to process
     */
    public EntityProperty(Consumer<EntityProperty> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EntityProperty}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EntityProperty(Consumer)} instead.
     * @param key The key of the property. Required on create and update.
     * @param value The value of the property. Required on create and update.
     */
    @ApiStatus.Internal
    public EntityProperty(String key, Object value) {
        this.key = key;
        this.value = value;
    }

}
