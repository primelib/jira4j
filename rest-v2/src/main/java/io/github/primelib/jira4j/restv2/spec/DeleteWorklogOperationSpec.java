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
 * DeleteWorklogSpec
 * <p>
 * Specification for the DeleteWorklog operation.
 * <p>
 * Delete worklog
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteWorklogOperationSpec {
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
     * The ID of the worklog.
     */
    @NotNull 
    private String id;

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
     * {@code manual} Increases the estimate by amount specified in {@code increaseBy}.
     * *
     * {@code auto} Reduces the estimate by the value of {@code timeSpent} in the worklog.
     */
    @Nullable 
    private String adjustEstimate;

    /**
     * The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when {@code adjustEstimate} is {@code new}.
     */
    @Nullable 
    private String newEstimate;

    /**
     * The amount to increase the issue's remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when {@code adjustEstimate} is {@code manual}.
     */
    @Nullable 
    private String increaseBy;

    /**
     * Whether the work log entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Connect and Forge app users with admin permission can use this flag.
     */
    @Nullable 
    private Boolean overrideEditableFlag;

    /**
     * Constructs a validated instance of {@link DeleteWorklogOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteWorklogOperationSpec(Consumer<DeleteWorklogOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteWorklogOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueIdOrKey         The ID or key of the issue.
     * @param id                   The ID of the worklog.
     * @param notifyUsers          Whether users watching the issue are notified by email.
     * @param adjustEstimate       Defines how to update the issue's time estimate, the options are:   *  {@code new} Sets the estimate to a specific value, defined in {@code newEstimate}.  *  {@code leave} Leaves the estimate unchanged.  *  {@code manual} Increases the estimate by amount specified in {@code increaseBy}.  *  {@code auto} Reduces the estimate by the value of {@code timeSpent} in the worklog.
     * @param newEstimate          The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when {@code adjustEstimate} is {@code new}.
     * @param increaseBy           The amount to increase the issue's remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when {@code adjustEstimate} is {@code manual}.
     * @param overrideEditableFlag Whether the work log entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Connect and Forge app users with admin permission can use this flag.
     */
    @ApiStatus.Internal
    public DeleteWorklogOperationSpec(String issueIdOrKey, String id, Boolean notifyUsers, String adjustEstimate, String newEstimate, String increaseBy, Boolean overrideEditableFlag) {
        this.issueIdOrKey = issueIdOrKey;
        this.id = id;
        this.notifyUsers = notifyUsers;
        this.adjustEstimate = adjustEstimate;
        this.newEstimate = newEstimate;
        this.increaseBy = increaseBy;
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
    }
}
