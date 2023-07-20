package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWorkflowTransitionDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link CreateWorkflowTransitionDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateWorkflowTransitionDetails(Consumer<CreateWorkflowTransitionDetails> spec) {
        spec.accept(this);
    }

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
    protected Map<String, String> properties = new HashMap<>();

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
