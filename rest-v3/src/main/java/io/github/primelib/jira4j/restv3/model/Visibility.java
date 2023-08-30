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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Visibility
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
    "identifier",
    "type",
    "value"
})
@JsonTypeName("Visibility")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Visibility {

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
     * The name of the group or role that visibility of this item is restricted to. Please note that the name of a group is mutable, to reliably identify a group use {@code identifier}.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link Visibility}.
     *
     * @param spec the specification to process
     */
    public Visibility(Consumer<Visibility> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Visibility}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Visibility(Consumer)} instead.
     * @param identifier The ID of the group or the name of the role that visibility of this item is restricted to.
     * @param type Whether visibility of this item is restricted to a group or role.
     * @param value The name of the group or role that visibility of this item is restricted to. Please note that the name of a group is mutable, to reliably identify a group use {@code identifier}.
     */
    @ApiStatus.Internal
    public Visibility(String identifier, TypeEnum type, String value) {
        this.identifier = identifier;
        this.type = type;
        this.value = value;
    }

    /**
     * Whether visibility of this item is restricted to a group or role.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        GROUP("group"),
        ROLE("role");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
