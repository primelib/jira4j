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
 * CustomFieldCreatedContextOptionsList
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "options"
})
@JsonTypeName("CustomFieldCreatedContextOptionsList")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldCreatedContextOptionsList {

    /**
     * Constructs a validated implementation of {@link CustomFieldCreatedContextOptionsList}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldCreatedContextOptionsList(Consumer<CustomFieldCreatedContextOptionsList> spec) {
        spec.accept(this);
    }

    /**
     * The created custom field options.
     */
    @JsonProperty("options")
    protected List<CustomFieldContextOption> options;


}
