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
 * FieldConfiguration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "isDefault",
    "name"
})
@JsonTypeName("FieldConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldConfiguration {

    /**
     * Constructs a validated implementation of {@link FieldConfiguration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldConfiguration(Consumer<FieldConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * The description of the field configuration.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the field configuration.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * Whether the field configuration is the default.
     */
    @JsonProperty("isDefault")
    protected Boolean isDefault;

    /**
     * The name of the field configuration.
     */
    @JsonProperty("name")
    protected String name;


}
