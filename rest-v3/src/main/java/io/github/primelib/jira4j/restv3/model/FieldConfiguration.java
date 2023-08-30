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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldConfiguration
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
    "isDefault",
    "name"
})
@JsonTypeName("FieldConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldConfiguration {

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

    /**
     * Constructs a validated instance of {@link FieldConfiguration}.
     *
     * @param spec the specification to process
     */
    public FieldConfiguration(Consumer<FieldConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldConfiguration(Consumer)} instead.
     * @param description The description of the field configuration.
     * @param id The ID of the field configuration.
     * @param isDefault Whether the field configuration is the default.
     * @param name The name of the field configuration.
     */
    @ApiStatus.Internal
    public FieldConfiguration(String description, Long id, Boolean isDefault, String name) {
        this.description = description;
        this.id = id;
        this.isDefault = isDefault;
        this.name = name;
    }

}
