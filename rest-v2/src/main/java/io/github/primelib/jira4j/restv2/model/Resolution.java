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

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resolution
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
    "id",
    "name",
    "self"
})
@JsonTypeName("Resolution")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Resolution {

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

    /**
     * Constructs a validated instance of {@link Resolution}.
     *
     * @param spec the specification to process
     */
    public Resolution(Consumer<Resolution> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Resolution}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Resolution(Consumer)} instead.
     * @param description The description of the issue resolution.
     * @param id The ID of the issue resolution.
     * @param name The name of the issue resolution.
     * @param self The URL of the issue resolution.
     */
    @ApiStatus.Internal
    public Resolution(String description, String id, String name, URI self) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.self = self;
    }

}
