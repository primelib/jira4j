package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Project;
import java.util.Set;
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
 * GetIssuePickerResourceSpec
 * <p>
 * Specification for the GetIssuePickerResource operation.
 * <p>
 * Get issue picker suggestions
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetIssuePickerResourceOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * A string to match against text fields in the issue such as title, description, or comments.
     */
    @Nullable 
    private String query;

    /**
     * A JQL query defining a list of issues to search for the query term. Note that {@code username} and {@code userkey} cannot be used as search terms for this parameter, due to privacy reasons. Use {@code accountId} instead.
     */
    @Nullable 
    private String currentJQL;

    /**
     * The key of an issue to exclude from search results. For example, the issue the user is viewing when they perform this query.
     */
    @Nullable 
    private String currentIssueKey;

    /**
     * The ID of a project that suggested issues must belong to.
     */
    @Nullable 
    private String currentProjectId;

    /**
     * Indicate whether to include subtasks in the suggestions list.
     */
    @Nullable 
    private Boolean showSubTasks;

    /**
     * When {@code currentIssueKey} is a subtask, whether to include the parent issue in the suggestions if it matches the query.
     */
    @Nullable 
    private Boolean showSubTaskParent;

    /**
     * Constructs a validated instance of {@link GetIssuePickerResourceOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetIssuePickerResourceOperationSpec(Consumer<GetIssuePickerResourceOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetIssuePickerResourceOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param query                A string to match against text fields in the issue such as title, description, or comments.
     * @param currentJQL           A JQL query defining a list of issues to search for the query term. Note that {@code username} and {@code userkey} cannot be used as search terms for this parameter, due to privacy reasons. Use {@code accountId} instead.
     * @param currentIssueKey      The key of an issue to exclude from search results. For example, the issue the user is viewing when they perform this query.
     * @param currentProjectId     The ID of a project that suggested issues must belong to.
     * @param showSubTasks         Indicate whether to include subtasks in the suggestions list.
     * @param showSubTaskParent    When {@code currentIssueKey} is a subtask, whether to include the parent issue in the suggestions if it matches the query.
     */
    @ApiStatus.Internal
    public GetIssuePickerResourceOperationSpec(String query, String currentJQL, String currentIssueKey, String currentProjectId, Boolean showSubTasks, Boolean showSubTaskParent) {
        this.query = query;
        this.currentJQL = currentJQL;
        this.currentIssueKey = currentIssueKey;
        this.currentProjectId = currentProjectId;
        this.showSubTasks = showSubTasks;
        this.showSubTaskParent = showSubTaskParent;

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
