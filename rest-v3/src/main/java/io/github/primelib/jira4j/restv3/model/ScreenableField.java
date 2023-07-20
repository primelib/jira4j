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
 * ScreenableField
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "name"
})
@JsonTypeName("ScreenableField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScreenableField {

    /**
     * Constructs a validated implementation of {@link ScreenableField}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ScreenableField(Consumer<ScreenableField> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the screen tab field.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the screen tab field. Required on create and update. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;


}
