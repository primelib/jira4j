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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueUpdateDetailsTransition
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
     * Expand options that include additional transition details in the response.
     */
    @JsonProperty("expand")
    protected String expand;

    /**
     * Details of the fields associated with the issue transition screen. Use this information to populate {@code fields} and {@code update} in a transition request.
     */
    @JsonProperty("fields")
    protected Map<String, FieldMetadata> fields;

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

    /**
     * Constructs a validated instance of {@link IssueUpdateDetailsTransition}.
     *
     * @param spec the specification to process
     */
    public IssueUpdateDetailsTransition(Consumer<IssueUpdateDetailsTransition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueUpdateDetailsTransition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueUpdateDetailsTransition(Consumer)} instead.
     * @param expand Expand options that include additional transition details in the response.
     * @param fields Details of the fields associated with the issue transition screen. Use this information to populate {@code fields} and {@code update} in a transition request.
     * @param hasScreen Whether there is a screen associated with the issue transition.
     * @param id The ID of the issue transition. Required when specifying a transition to undertake.
     * @param isAvailable Whether the transition is available to be performed.
     * @param isConditional Whether the issue has to meet criteria before the issue transition is applied.
     * @param isGlobal Whether the issue transition is global, that is, the transition is applied to issues regardless of their status.
     * @param isInitial Whether this is the initial issue transition for the workflow.
     * @param looped looped
     * @param name The name of the issue transition.
     * @param to to
     */
    @ApiStatus.Internal
    public IssueUpdateDetailsTransition(String expand, Map<String, FieldMetadata> fields, Boolean hasScreen, String id, Boolean isAvailable, Boolean isConditional, Boolean isGlobal, Boolean isInitial, Boolean looped, String name, IssueTransitionTo to) {
        this.expand = expand;
        this.fields = fields;
        this.hasScreen = hasScreen;
        this.id = id;
        this.isAvailable = isAvailable;
        this.isConditional = isConditional;
        this.isGlobal = isGlobal;
        this.isInitial = isInitial;
        this.looped = looped;
        this.name = name;
        this.to = to;
    }

}
