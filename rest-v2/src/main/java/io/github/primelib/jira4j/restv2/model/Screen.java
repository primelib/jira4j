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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Screen
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
    "scope"
})
@JsonTypeName("Screen")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Screen {

    /**
     * The description of the screen.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the screen.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The name of the screen.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("scope")
    protected Scope scope;

    /**
     * Constructs a validated instance of {@link Screen}.
     *
     * @param spec the specification to process
     */
    public Screen(Consumer<Screen> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Screen}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Screen(Consumer)} instead.
     * @param description The description of the screen.
     * @param id The ID of the screen.
     * @param name The name of the screen.
     * @param scope scope
     */
    @ApiStatus.Internal
    public Screen(String description, Long id, String name, Scope scope) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.scope = scope;
    }

}
