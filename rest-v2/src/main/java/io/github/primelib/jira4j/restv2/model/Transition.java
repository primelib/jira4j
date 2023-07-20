package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Transition
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "from",
    "id",
    "name",
    "properties",
    "rules",
    "screen",
    "to",
    "type"
})
@JsonTypeName("Transition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Transition {

    /**
     * Constructs a validated implementation of {@link Transition}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Transition(Consumer<Transition> spec) {
        spec.accept(this);
    }

    /**
     * The description of the transition.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The statuses the transition can start from.
     */
    @JsonProperty("from")
    protected List<String> from = new ArrayList<>();

    /**
     * The ID of the transition.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the transition.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The properties of the transition.
     */
    @JsonProperty("properties")
    protected Map<String, Object> properties = new HashMap<>();

    @JsonProperty("rules")
    protected WorkflowRules rules;

    @JsonProperty("screen")
    protected TransitionScreenDetails screen;

    /**
     * The status the transition goes to.
     */
    @JsonProperty("to")
    protected String to;

    /**
     * The type of the transition.
     */
    @JsonProperty("type")
    protected TypeEnum type;


    /**
     * The type of the transition.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        GLOBAL("global"),
        INITIAL("initial"),
        DIRECTED("directed");

        private final String value;
    }

}
