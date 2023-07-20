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
 * ScreenSchemeId
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id"
})
@JsonTypeName("ScreenSchemeId")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScreenSchemeId {

    /**
     * Constructs a validated implementation of {@link ScreenSchemeId}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ScreenSchemeId(Consumer<ScreenSchemeId> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the screen scheme.
     */
    @JsonProperty("id")
    protected Long id;


}
