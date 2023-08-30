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
 * UpdateFieldConfigurationSchemeDetails
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
    "name"
})
@JsonTypeName("UpdateFieldConfigurationSchemeDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateFieldConfigurationSchemeDetails {

    /**
     * The description of the field configuration scheme.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the field configuration scheme. The name must be unique.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link UpdateFieldConfigurationSchemeDetails}.
     *
     * @param spec the specification to process
     */
    public UpdateFieldConfigurationSchemeDetails(Consumer<UpdateFieldConfigurationSchemeDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateFieldConfigurationSchemeDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateFieldConfigurationSchemeDetails(Consumer)} instead.
     * @param description The description of the field configuration scheme.
     * @param name The name of the field configuration scheme. The name must be unique.
     */
    @ApiStatus.Internal
    public UpdateFieldConfigurationSchemeDetails(String description, String name) {
        this.description = description;
        this.name = name;
    }

}
