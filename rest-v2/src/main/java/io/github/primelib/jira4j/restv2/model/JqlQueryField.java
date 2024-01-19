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
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JqlQueryField
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
    "encodedName",
    "name",
    "property"
})
@JsonTypeName("JqlQueryField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlQueryField {

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

    /**
     * Constructs a validated instance of {@link JqlQueryField}.
     *
     * @param spec the specification to process
     */
    public JqlQueryField(Consumer<JqlQueryField> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JqlQueryField}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JqlQueryField(Consumer)} instead.
     * @param encodedName The encoded name of the field, which can be used directly in a JQL query.
     * @param name The name of the field.
     * @param property When the field refers to a value in an entity property, details of the entity property value.
     */
    @ApiStatus.Internal
    public JqlQueryField(String encodedName, String name, List<JqlQueryFieldEntityProperty> property) {
        this.encodedName = encodedName;
        this.name = name;
        this.property = property;
    }

}
