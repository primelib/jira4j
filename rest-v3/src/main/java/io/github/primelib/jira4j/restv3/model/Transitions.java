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
 * Transitions
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "expand",
    "transitions"
})
@JsonTypeName("Transitions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Transitions {

    /**
     * Constructs a validated implementation of {@link Transitions}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Transitions(Consumer<Transitions> spec) {
        spec.accept(this);
    }

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


}
