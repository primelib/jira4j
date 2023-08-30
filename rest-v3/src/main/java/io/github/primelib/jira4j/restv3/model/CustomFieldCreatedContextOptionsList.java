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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldCreatedContextOptionsList
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
    "options"
})
@JsonTypeName("CustomFieldCreatedContextOptionsList")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldCreatedContextOptionsList {

    /**
     * The created custom field options.
     */
    @JsonProperty("options")
    protected List<CustomFieldContextOption> options;

    /**
     * Constructs a validated instance of {@link CustomFieldCreatedContextOptionsList}.
     *
     * @param spec the specification to process
     */
    public CustomFieldCreatedContextOptionsList(Consumer<CustomFieldCreatedContextOptionsList> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldCreatedContextOptionsList}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldCreatedContextOptionsList(Consumer)} instead.
     * @param options The created custom field options.
     */
    @ApiStatus.Internal
    public CustomFieldCreatedContextOptionsList(List<CustomFieldContextOption> options) {
        this.options = options;
    }

}
