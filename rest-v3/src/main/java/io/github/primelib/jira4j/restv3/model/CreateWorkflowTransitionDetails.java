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
 * CreateWorkflowTransitionDetails
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
    "name",
    "properties",
    "rules",
    "screen",
    "to",
    "type"
})
@JsonTypeName("CreateWorkflowTransitionDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateWorkflowTransitionDetails {

    /**
     * The description of the transition. The maximum length is 1000 characters.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The statuses the transition can start from.
     */
    @JsonProperty("from")
    protected List<String> from;

    /**
     * The name of the transition. The maximum length is 60 characters.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The properties of the transition.
     */
    @JsonProperty("properties")
    protected Map<String, String> properties;

    @JsonProperty("rules")
    protected CreateWorkflowTransitionDetailsRules rules;

    @JsonProperty("screen")
    protected CreateWorkflowTransitionDetailsScreen screen;

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
     * Constructs a validated instance of {@link CreateWorkflowTransitionDetails}.
     *
     * @param spec the specification to process
     */
    public CreateWorkflowTransitionDetails(Consumer<CreateWorkflowTransitionDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateWorkflowTransitionDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateWorkflowTransitionDetails(Consumer)} instead.
     * @param description The description of the transition. The maximum length is 1000 characters.
     * @param from The statuses the transition can start from.
     * @param name The name of the transition. The maximum length is 60 characters.
     * @param properties The properties of the transition.
     * @param rules var.name
     * @param screen var.name
     * @param to The status the transition goes to.
     * @param type The type of the transition.
     */
    @ApiStatus.Internal
    public CreateWorkflowTransitionDetails(String description, List<String> from, String name, Map<String, String> properties, CreateWorkflowTransitionDetailsRules rules, CreateWorkflowTransitionDetailsScreen screen, String to, TypeEnum type) {
        this.description = description;
        this.from = from;
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
