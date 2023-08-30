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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApplicationProperty
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
    "allowedValues",
    "defaultValue",
    "desc",
    "example",
    "id",
    "key",
    "name",
    "type",
    "value"
})
@JsonTypeName("ApplicationProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ApplicationProperty {

    /**
     * The allowed values, if applicable.
     */
    @JsonProperty("allowedValues")
    protected List<String> allowedValues;

    /**
     * The default value of the application property.
     */
    @JsonProperty("defaultValue")
    protected String defaultValue;

    /**
     * The description of the application property.
     */
    @JsonProperty("desc")
    protected String desc;

    @JsonProperty("example")
    protected String example;

    /**
     * The ID of the application property. The ID and key are the same.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The key of the application property. The ID and key are the same.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The name of the application property.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The data type of the application property.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The new value.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link ApplicationProperty}.
     *
     * @param spec the specification to process
     */
    public ApplicationProperty(Consumer<ApplicationProperty> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ApplicationProperty}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ApplicationProperty(Consumer)} instead.
     * @param allowedValues The allowed values, if applicable.
     * @param defaultValue The default value of the application property.
     * @param desc The description of the application property.
     * @param example example
     * @param id The ID of the application property. The ID and key are the same.
     * @param key The key of the application property. The ID and key are the same.
     * @param name The name of the application property.
     * @param type The data type of the application property.
     * @param value The new value.
     */
    @ApiStatus.Internal
    public ApplicationProperty(List<String> allowedValues, String defaultValue, String desc, String example, String id, String key, String name, String type, String value) {
        this.allowedValues = allowedValues;
        this.defaultValue = defaultValue;
        this.desc = desc;
        this.example = example;
        this.id = id;
        this.key = key;
        this.name = name;
        this.type = type;
        this.value = value;
    }

}
