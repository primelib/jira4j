package io.github.primelib.jira4j.restv2.model;

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
 * UpdateScreenDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "name"
})
@JsonTypeName("UpdateScreenDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateScreenDetails {

    /**
     * Constructs a validated implementation of {@link UpdateScreenDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateScreenDetails(Consumer<UpdateScreenDetails> spec) {
        spec.accept(this);
    }

    /**
     * The description of the screen. The maximum length is 255 characters.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the screen. The name must be unique. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;


}
