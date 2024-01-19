package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv2.model.User;
import io.github.primelib.jira4j.restv2.model.Worklog;
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
 * UpdateWorklogSpec
 * <p>
 * Specification for the UpdateWorklog operation.
 * <p>
 * Update worklog
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateWorklogOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID or key the issue.
     */
    @NotNull 
    private String issueIdOrKey;

    /**
     * The ID of the worklog.
     */
    @NotNull 
    private String id;

    /**
     */
    @NotNull 
    private Worklog worklog;

    /**
     * Whether users watching the issue are notified by email.
     */
    @Nullable 
    private Boolean notifyUsers;

    /**
     * Defines how to update the issue's time estimate, the options are:
     *  *
     * {@code new} Sets the estimate to a specific value, defined in {@code newEstimate}.
     * *
     * {@code leave} Leaves the estimate unchanged.
     * *
     * {@code auto} Updates the estimate by the difference between the original and updated value of {@code timeSpent} or {@code timeSpentSeconds}.
     */
    @Nullable 
    private String adjustEstimate;

    /**
     * The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when {@code adjustEstimate} is {@code new}.
     */
    @Nullable 
    private String newEstimate;

    /**
     * Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts {@code properties}, which returns worklog properties.
     */
    @Nullable 
    private String expand;

    /**
     * Whether the worklog should be added to the issue even if the issue is not editable. For example, because the issue is closed. Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) can use this flag.
     */
    @Nullable 
    private Boolean overrideEditableFlag;

    /**
     * Constructs a validated instance of {@link UpdateWorklogOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateWorklogOperationSpec(Consumer<UpdateWorklogOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateWorklogOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueIdOrKey         The ID or key the issue.
     * @param id                   The ID of the worklog.
     * @param worklog              
     * @param notifyUsers          Whether users watching the issue are notified by email.
     * @param adjustEstimate       Defines how to update the issue's time estimate, the options are:   *  {@code new} Sets the estimate to a specific value, defined in {@code newEstimate}.  *  {@code leave} Leaves the estimate unchanged.  *  {@code auto} Updates the estimate by the difference between the original and updated value of {@code timeSpent} or {@code timeSpentSeconds}.
     * @param newEstimate          The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when {@code adjustEstimate} is {@code new}.
     * @param expand               Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts {@code properties}, which returns worklog properties.
     * @param overrideEditableFlag Whether the worklog should be added to the issue even if the issue is not editable. For example, because the issue is closed. Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) can use this flag.
     */
    @ApiStatus.Internal
    public UpdateWorklogOperationSpec(String issueIdOrKey, String id, Worklog worklog, Boolean notifyUsers, String adjustEstimate, String newEstimate, String expand, Boolean overrideEditableFlag) {
        this.issueIdOrKey = issueIdOrKey;
        this.id = id;
        this.worklog = worklog;
        this.notifyUsers = notifyUsers;
        this.adjustEstimate = adjustEstimate;
        this.newEstimate = newEstimate;
        this.expand = expand;
        this.overrideEditableFlag = overrideEditableFlag;

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
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(worklog, "worklog is a required parameter!");
    }
}
