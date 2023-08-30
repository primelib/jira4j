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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Transitions
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
    "expand",
    "transitions"
})
@JsonTypeName("Transitions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Transitions {

    /**
     * Expand options that include additional transitions details in the response.
     */
    @JsonProperty("expand")
    protected String expand;

    /**
     * List of issue transitions.
     */
    @JsonProperty("transitions")
    protected List<IssueTransition> transitions;

    /**
     * Constructs a validated instance of {@link Transitions}.
     *
     * @param spec the specification to process
     */
    public Transitions(Consumer<Transitions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Transitions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Transitions(Consumer)} instead.
     * @param expand Expand options that include additional transitions details in the response.
     * @param transitions List of issue transitions.
     */
    @ApiStatus.Internal
    public Transitions(String expand, List<IssueTransition> transitions) {
        this.expand = expand;
        this.transitions = transitions;
    }

}
