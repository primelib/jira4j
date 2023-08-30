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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldConfigurationScheme
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
    "description",
    "id",
    "name"
})
@JsonTypeName("FieldConfigurationScheme")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldConfigurationScheme {

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

    /**
     * Constructs a validated instance of {@link FieldConfigurationScheme}.
     *
     * @param spec the specification to process
     */
    public FieldConfigurationScheme(Consumer<FieldConfigurationScheme> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldConfigurationScheme}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldConfigurationScheme(Consumer)} instead.
     * @param description The description of the field configuration scheme.
     * @param id The ID of the field configuration scheme.
     * @param name The name of the field configuration scheme.
     */
    @ApiStatus.Internal
    public FieldConfigurationScheme(String description, String id, String name) {
        this.description = description;
        this.id = id;
        this.name = name;
    }

}
