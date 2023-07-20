package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Filter;
import java.util.Set;
import io.github.primelib.jira4j.restv3.model.Transitions;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetWorkflowsPaginatedSpec
 * <p>
 * Specification for the GetWorkflowsPaginated operation.
 * <p>
 * Get workflows paginated
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowsPaginatedOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Long startAt = 0L;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults = 50;

    /**
     * The name of a workflow to return. To include multiple workflows, provide an ampersand-separated list. For example, `workflowName=name1&amp;workflowName=name2`.
     */
    @Nullable 
    private Set<String> workflowName;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * `transitions` For each workflow, returns information about the transitions inside the workflow.
     * *
     * `transitions.rules` For each workflow transition, returns information about its rules. Transitions are included automatically if this expand is requested.
     * *
     * `transitions.properties` For each workflow transition, returns information about its properties. Transitions are included automatically if this expand is requested.
     * *
     * `statuses` For each workflow, returns information about the statuses inside the workflow.
     * *
     * `statuses.properties` For each workflow status, returns information about its properties. Statuses are included automatically if this expand is requested.
     * *
     * `default` For each workflow, returns information about whether this is the default workflow.
     * *
     * `schemes` For each workflow, returns information about the workflow schemes the workflow is assigned to.
     * *
     * `projects` For each workflow, returns information about the projects the workflow is assigned to, through workflow schemes.
     * *
     * `hasDraftWorkflow` For each workflow, returns information about whether the workflow has a draft version.
     * *
     * `operations` For each workflow, returns information about the actions that can be undertaken on the workflow.
     */
    @Nullable 
    private String expand;

    /**
     * String used to perform a case-insensitive partial match with workflow name.
     */
    @Nullable 
    private String queryString;

    /**
     * [Order](#ordering) the results by a field:
     *  *
     * `name` Sorts by workflow name.
     * *
     * `created` Sorts by create time.
     * *
     * `updated` Sorts by update time.
     */
    @Nullable 
    private String orderBy;

    /**
     * Filters active and inactive workflows.
     */
    @Nullable 
    private Boolean isActive;

    /**
     * Constructs a validated implementation of {@link GetWorkflowsPaginatedOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetWorkflowsPaginatedOperationSpec(Consumer<GetWorkflowsPaginatedOperationSpec> spec) {
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
    }

}
