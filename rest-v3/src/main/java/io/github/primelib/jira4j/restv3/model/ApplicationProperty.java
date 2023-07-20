package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApplicationProperty
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link ApplicationProperty}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ApplicationProperty(Consumer<ApplicationProperty> spec) {
        spec.accept(this);
    }

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


}
