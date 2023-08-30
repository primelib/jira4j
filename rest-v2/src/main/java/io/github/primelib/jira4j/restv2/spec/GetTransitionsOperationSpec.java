package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv2.model.Transitions;
import io.github.primelib.jira4j.restv2.model.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
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
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Use [expand](#expansion) to include additional information about transitions in the response. This parameter accepts {@code transitions.fields}, which returns information about the fields in the transition screen for each transition. Fields hidden from the screen are not returned. Use this information to populate the {@code fields} and {@code update} fields in [Transition issue](#api-rest-api-2-issue-issueIdOrKey-transitions-post).
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
    private Boolean skipRemoteOnlyCondition;

    /**
     * Whether details of transitions that fail a condition are included in the response
     */
    @Nullable 
    private Boolean includeUnavailableTransitions;

    /**
     * Whether the transitions are sorted by ops-bar sequence value first then category order (Todo, In Progress, Done) or only by ops-bar sequence value.
     */
    @Nullable 
    private Boolean sortByOpsBarAndStatus;

    /**
     * Constructs a validated instance of {@link GetTransitionsOperationSpec}.
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
     * Constructs a validated instance of {@link GetTransitionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueIdOrKey         The ID or key of the issue.
     * @param expand               Use [expand](#expansion) to include additional information about transitions in the response. This parameter accepts {@code transitions.fields}, which returns information about the fields in the transition screen for each transition. Fields hidden from the screen are not returned. Use this information to populate the {@code fields} and {@code update} fields in [Transition issue](#api-rest-api-2-issue-issueIdOrKey-transitions-post).
     * @param transitionId         The ID of the transition.
     * @param skipRemoteOnlyCondition Whether transitions with the condition *Hide From User Condition* are included in the response.
     * @param includeUnavailableTransitions Whether details of transitions that fail a condition are included in the response
     * @param sortByOpsBarAndStatus Whether the transitions are sorted by ops-bar sequence value first then category order (Todo, In Progress, Done) or only by ops-bar sequence value.
     */
    @ApiStatus.Internal
    public GetTransitionsOperationSpec(String issueIdOrKey, String expand, String transitionId, Boolean skipRemoteOnlyCondition, Boolean includeUnavailableTransitions, Boolean sortByOpsBarAndStatus) {
        this.issueIdOrKey = issueIdOrKey;
        this.expand = expand;
        this.transitionId = transitionId;
        this.skipRemoteOnlyCondition = skipRemoteOnlyCondition;
        this.includeUnavailableTransitions = includeUnavailableTransitions;
        this.sortByOpsBarAndStatus = sortByOpsBarAndStatus;

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
