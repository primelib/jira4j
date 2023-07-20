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
 * JqlQueryFieldEntityProperty
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link JqlQueryFieldEntityProperty}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JqlQueryFieldEntityProperty(Consumer<JqlQueryFieldEntityProperty> spec) {
        spec.accept(this);
    }

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
     * The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        NUMBER("number"),
        STRING("string"),
        TEXT("text"),
        DATE("date"),
        USER("user");

        private final String value;
    }

}
