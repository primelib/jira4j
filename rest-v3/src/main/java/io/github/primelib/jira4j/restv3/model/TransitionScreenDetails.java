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
 * TransitionScreenDetails
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
    "name"
})
@JsonTypeName("TransitionScreenDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TransitionScreenDetails {

    /**
     * The ID of the screen.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the screen.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link TransitionScreenDetails}.
     *
     * @param spec the specification to process
     */
    public TransitionScreenDetails(Consumer<TransitionScreenDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TransitionScreenDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TransitionScreenDetails(Consumer)} instead.
     * @param id The ID of the screen.
     * @param name The name of the screen.
     */
    @ApiStatus.Internal
    public TransitionScreenDetails(String id, String name) {
        this.id = id;
        this.name = name;
    }

}
