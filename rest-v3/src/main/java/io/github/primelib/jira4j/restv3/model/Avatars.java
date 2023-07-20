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
 * Avatars
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "custom",
    "system"
})
@JsonTypeName("Avatars")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Avatars {

    /**
     * Constructs a validated implementation of {@link Avatars}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Avatars(Consumer<Avatars> spec) {
        spec.accept(this);
    }

    /**
     * Custom avatars list.
     */
    @JsonProperty("custom")
    protected List<Avatar> custom;

    /**
     * System avatars list.
     */
    @JsonProperty("system")
    protected List<Avatar> system;


}
