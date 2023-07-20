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
 * FieldConfigurationScheme
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "name"
})
@JsonTypeName("FieldConfigurationScheme")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldConfigurationScheme {

    /**
     * Constructs a validated implementation of {@link FieldConfigurationScheme}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldConfigurationScheme(Consumer<FieldConfigurationScheme> spec) {
        spec.accept(this);
    }

    /**
     * The description of the field configuration scheme.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the field configuration scheme.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the field configuration scheme.
     */
    @JsonProperty("name")
    protected String name;


}
