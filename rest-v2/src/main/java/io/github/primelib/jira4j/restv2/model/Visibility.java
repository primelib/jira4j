package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Visibility
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "identifier",
    "type",
    "value"
})
@JsonTypeName("Visibility")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Visibility extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link Visibility}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Visibility(Consumer<Visibility> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the group or the name of the role that visibility of this item is restricted to.
     */
    @JsonProperty("identifier")
    protected String identifier;

    /**
     * Whether visibility of this item is restricted to a group or role.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The name of the group or role that visibility of this item is restricted to. Please note that the name of a group is mutable, to reliably identify a group use `identifier`.
     */
    @JsonProperty("value")
    protected String value;


    /**
     * Whether visibility of this item is restricted to a group or role.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        GROUP("group"),
        ROLE("role");

        private final String value;
    }

}
