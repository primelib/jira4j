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
 * CustomFieldContextUpdateDetails
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
@JsonTypeName("CustomFieldContextUpdateDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextUpdateDetails {

    /**
     * The description of the custom field context. The maximum length is 255 characters.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the custom field context. The name must be unique. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link CustomFieldContextUpdateDetails}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextUpdateDetails(Consumer<CustomFieldContextUpdateDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextUpdateDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextUpdateDetails(Consumer)} instead.
     * @param description The description of the custom field context. The maximum length is 255 characters.
     * @param name The name of the custom field context. The name must be unique. The maximum length is 255 characters.
     */
    @ApiStatus.Internal
    public CustomFieldContextUpdateDetails(String description, String name) {
        this.description = description;
        this.name = name;
    }

}
