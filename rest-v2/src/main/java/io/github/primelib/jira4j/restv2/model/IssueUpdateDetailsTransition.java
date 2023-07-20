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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueUpdateDetailsTransition
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "expand",
    "fields",
    "hasScreen",
    "id",
    "isAvailable",
    "isConditional",
    "isGlobal",
    "isInitial",
    "looped",
    "name",
    "to"
})
@JsonTypeName("IssueUpdateDetails_transition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueUpdateDetailsTransition {

    /**
     * Constructs a validated implementation of {@link IssueUpdateDetailsTransition}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueUpdateDetailsTransition(Consumer<IssueUpdateDetailsTransition> spec) {
        spec.accept(this);
    }

    /**
     * Expand options that include additional transition details in the response.
     */
    @JsonProperty("expand")
    protected String expand;

    /**
     * Details of the fields associated with the issue transition screen. Use this information to populate `fields` and `update` in a transition request.
     */
    @JsonProperty("fields")
    protected Map<String, FieldMetadata> fields = new HashMap<>();

    /**
     * Whether there is a screen associated with the issue transition.
     */
    @JsonProperty("hasScreen")
    protected Boolean hasScreen;

    /**
     * The ID of the issue transition. Required when specifying a transition to undertake.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Whether the transition is available to be performed.
     */
    @JsonProperty("isAvailable")
    protected Boolean isAvailable;

    /**
     * Whether the issue has to meet criteria before the issue transition is applied.
     */
    @JsonProperty("isConditional")
    protected Boolean isConditional;

    /**
     * Whether the issue transition is global, that is, the transition is applied to issues regardless of their status.
     */
    @JsonProperty("isGlobal")
    protected Boolean isGlobal;

    /**
     * Whether this is the initial issue transition for the workflow.
     */
    @JsonProperty("isInitial")
    protected Boolean isInitial;

    @JsonProperty("looped")
    protected Boolean looped;

    /**
     * The name of the issue transition.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("to")
    protected IssueTransitionTo to;


}
