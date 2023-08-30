package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import java.util.UUID;
import io.github.primelib.jira4j.restv2.model.WorkflowRulesSearch;
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
 * MigrationResourceWorkflowRuleSearchPostSpec
 * <p>
 * Specification for the MigrationResourceWorkflowRuleSearchPost operation.
 * <p>
 * Get workflow transition rule configurations
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MigrationResourceWorkflowRuleSearchPostOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The app migration transfer ID.
     */
    @NotNull 
    private UUID atlassianTransferId;

    /**
     */
    @NotNull 
    private WorkflowRulesSearch workflowRulesSearch;

    /**
     * Constructs a validated instance of {@link MigrationResourceWorkflowRuleSearchPostOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MigrationResourceWorkflowRuleSearchPostOperationSpec(Consumer<MigrationResourceWorkflowRuleSearchPostOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link MigrationResourceWorkflowRuleSearchPostOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param atlassianTransferId  The app migration transfer ID.
     * @param workflowRulesSearch  
     */
    @ApiStatus.Internal
    public MigrationResourceWorkflowRuleSearchPostOperationSpec(UUID atlassianTransferId, WorkflowRulesSearch workflowRulesSearch) {
        this.atlassianTransferId = atlassianTransferId;
        this.workflowRulesSearch = workflowRulesSearch;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(atlassianTransferId, "atlassianTransferId is a required parameter!");
        Objects.requireNonNull(workflowRulesSearch, "workflowRulesSearch is a required parameter!");
    }
}
