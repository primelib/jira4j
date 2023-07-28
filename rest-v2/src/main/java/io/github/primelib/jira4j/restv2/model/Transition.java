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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Transition
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
     * The description of the transition.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The statuses the transition can start from.
     */
    @JsonProperty("from")
    protected List<String> from;

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
    protected Map<String, Object> properties;

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
     * Constructs a validated instance of {@link Transition}.
     *
     * @param spec the specification to process
     */
    public Transition(Consumer<Transition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Transition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Transition(Consumer)} instead.
     * @param description The description of the transition.
     * @param from The statuses the transition can start from.
     * @param id The ID of the transition.
     * @param name The name of the transition.
     * @param properties The properties of the transition.
     * @param rules var.name
     * @param screen var.name
     * @param to The status the transition goes to.
     * @param type The type of the transition.
     */
    @ApiStatus.Internal
    public Transition(String description, List<String> from, String id, String name, Map<String, Object> properties, WorkflowRules rules, TransitionScreenDetails screen, String to, TypeEnum type) {
        this.description = description;
        this.from = from;
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.rules = rules;
        this.screen = screen;
        this.to = to;
        this.type = type;
    }

    /**
     * The type of the transition.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        GLOBAL("global"),
        INITIAL("initial"),
        DIRECTED("directed");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
