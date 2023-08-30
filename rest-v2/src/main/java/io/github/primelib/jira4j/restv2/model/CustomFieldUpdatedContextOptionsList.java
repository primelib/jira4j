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
 * CustomFieldUpdatedContextOptionsList
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
@JsonTypeName("CustomFieldUpdatedContextOptionsList")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldUpdatedContextOptionsList {

    /**
     * The updated custom field options.
     */
    @JsonProperty("options")
    protected List<CustomFieldOptionUpdate> options;

    /**
     * Constructs a validated instance of {@link CustomFieldUpdatedContextOptionsList}.
     *
     * @param spec the specification to process
     */
    public CustomFieldUpdatedContextOptionsList(Consumer<CustomFieldUpdatedContextOptionsList> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldUpdatedContextOptionsList}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldUpdatedContextOptionsList(Consumer)} instead.
     * @param options The updated custom field options.
     */
    @ApiStatus.Internal
    public CustomFieldUpdatedContextOptionsList(List<CustomFieldOptionUpdate> options) {
        this.options = options;
    }

}
