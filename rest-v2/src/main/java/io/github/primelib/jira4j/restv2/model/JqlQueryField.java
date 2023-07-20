package io.github.primelib.jira4j.restv2.model;

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
 * JqlQueryField
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "encodedName",
    "name",
    "property"
})
@JsonTypeName("JqlQueryField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlQueryField {

    /**
     * Constructs a validated implementation of {@link JqlQueryField}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JqlQueryField(Consumer<JqlQueryField> spec) {
        spec.accept(this);
    }

    /**
     * The encoded name of the field, which can be used directly in a JQL query.
     */
    @JsonProperty("encodedName")
    protected String encodedName;

    /**
     * The name of the field.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * When the field refers to a value in an entity property, details of the entity property value.
     */
    @JsonProperty("property")
    protected List<JqlQueryFieldEntityProperty> property;


}
