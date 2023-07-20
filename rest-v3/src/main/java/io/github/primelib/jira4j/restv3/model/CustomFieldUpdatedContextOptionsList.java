package io.github.primelib.jira4j.restv3.model;

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
 * CustomFieldUpdatedContextOptionsList
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "options"
})
@JsonTypeName("CustomFieldUpdatedContextOptionsList")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldUpdatedContextOptionsList {

    /**
     * Constructs a validated implementation of {@link CustomFieldUpdatedContextOptionsList}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldUpdatedContextOptionsList(Consumer<CustomFieldUpdatedContextOptionsList> spec) {
        spec.accept(this);
    }

    /**
     * The updated custom field options.
     */
    @JsonProperty("options")
    protected List<CustomFieldOptionUpdate> options;


}
