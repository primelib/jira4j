package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EntityPropertyDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "entityId",
    "key",
    "value"
})
@JsonTypeName("EntityPropertyDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EntityPropertyDetails {

    /**
     * Constructs a validated implementation of {@link EntityPropertyDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EntityPropertyDetails(Consumer<EntityPropertyDetails> spec) {
        spec.accept(this);
    }

    /**
     * The entity property ID.
     */
    @JsonProperty("entityId")
    protected BigDecimal entityId;

    /**
     * The entity property key.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The new value of the entity property.
     */
    @JsonProperty("value")
    protected String value;


}
