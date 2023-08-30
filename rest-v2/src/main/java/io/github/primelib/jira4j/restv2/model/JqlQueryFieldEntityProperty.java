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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * JqlQueryFieldEntityProperty
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
    "entity",
    "key",
    "path",
    "type"
})
@JsonTypeName("JqlQueryFieldEntityProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlQueryFieldEntityProperty {

    /**
     * The object on which the property is set.
     */
    @JsonProperty("entity")
    protected String entity;

    /**
     * The key of the property.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The path in the property value to query.
     */
    @JsonProperty("path")
    protected String path;

    /**
     * The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link JqlQueryFieldEntityProperty}.
     *
     * @param spec the specification to process
     */
    public JqlQueryFieldEntityProperty(Consumer<JqlQueryFieldEntityProperty> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JqlQueryFieldEntityProperty}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JqlQueryFieldEntityProperty(Consumer)} instead.
     * @param entity The object on which the property is set.
     * @param key The key of the property.
     * @param path The path in the property value to query.
     * @param type The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module.
     */
    @ApiStatus.Internal
    public JqlQueryFieldEntityProperty(String entity, String key, String path, TypeEnum type) {
        this.entity = entity;
        this.key = key;
        this.path = path;
        this.type = type;
    }

    /**
     * The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        NUMBER("number"),
        STRING("string"),
        TEXT("text"),
        DATE("date"),
        USER("user");

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
