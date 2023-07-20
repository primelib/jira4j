package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Transitions;
import io.github.primelib.jira4j.restv3.model.User;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetTransitionsSpec
 * <p>
 * Specification for the GetTransitions operation.
 * <p>
 * Get transitions
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetTransitionsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID or key of the issue.
     */
    @NotNull 
    private String issueIdOrKey;

    /**
     * Use [expand](#expansion) to include additional information about transitions in the response. This parameter accepts `transitions.fields`, which returns information about the fields in the transition screen for each transition. Fields hidden from the screen are not returned. Use this information to populate the `fields` and `update` fields in [Transition issue](#api-rest-api-3-issue-issueIdOrKey-transitions-post).
     */
    @Nullable 
    private String expand;

    /**
     * The ID of the transition.
     */
    @Nullable 
    private String transitionId;

    /**
     * Whether transitions with the condition *Hide From User Condition* are included in the response.
     */
    @Nullable 
    private Boolean skipRemoteOnlyCondition = false;

    /**
     * Whether details of transitions that fail a condition are included in the response
     */
    @Nullable 
    private Boolean includeUnavailableTransitions = false;

    /**
     * Whether the transitions are sorted by ops-bar sequence value first then category order (Todo, In Progress, Done) or only by ops-bar sequence value.
     */
    @Nullable 
    private Boolean sortByOpsBarAndStatus = false;

    /**
     * Constructs a validated implementation of {@link GetTransitionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetTransitionsOperationSpec(Consumer<GetTransitionsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(issueIdOrKey, "issueIdOrKey is a required parameter!");
    }

}
