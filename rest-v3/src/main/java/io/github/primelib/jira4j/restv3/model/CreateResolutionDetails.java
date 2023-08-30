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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateResolutionDetails
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
    "name"
})
@JsonTypeName("CreateResolutionDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateResolutionDetails {

    /**
     * The description of the resolution.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the resolution. Must be unique (case-insensitive).
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link CreateResolutionDetails}.
     *
     * @param spec the specification to process
     */
    public CreateResolutionDetails(Consumer<CreateResolutionDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateResolutionDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateResolutionDetails(Consumer)} instead.
     * @param description The description of the resolution.
     * @param name The name of the resolution. Must be unique (case-insensitive).
     */
    @ApiStatus.Internal
    public CreateResolutionDetails(String description, String name) {
        this.description = description;
        this.name = name;
    }

}
