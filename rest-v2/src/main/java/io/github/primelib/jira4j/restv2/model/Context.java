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
 * Context
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
    "id",
    "name",
    "scope"
})
@JsonTypeName("Context")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Context {

    /**
     * The ID of the context.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The name of the context.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("scope")
    protected Scope scope;

    /**
     * Constructs a validated instance of {@link Context}.
     *
     * @param spec the specification to process
     */
    public Context(Consumer<Context> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Context}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Context(Consumer)} instead.
     * @param id The ID of the context.
     * @param name The name of the context.
     * @param scope scope
     */
    @ApiStatus.Internal
    public Context(Long id, String name, Scope scope) {
        this.id = id;
        this.name = name;
        this.scope = scope;
    }

}
