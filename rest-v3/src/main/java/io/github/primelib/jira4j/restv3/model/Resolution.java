package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resolution
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "name",
    "self"
})
@JsonTypeName("Resolution")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Resolution {

    /**
     * Constructs a validated implementation of {@link Resolution}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Resolution(Consumer<Resolution> spec) {
        spec.accept(this);
    }

    /**
     * The description of the issue resolution.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the issue resolution.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the issue resolution.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URL of the issue resolution.
     */
    @JsonProperty("self")
    protected URI self;


}
