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
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
    private Boolean notifyUsers = true;

    /**
     * Defines how to update the issue's time estimate, the options are:
     *  *
     * `new` Sets the estimate to a specific value, defined in `newEstimate`.
     * *
     * `leave` Leaves the estimate unchanged.
     * *
     * `manual` Increases the estimate by amount specified in `increaseBy`.
     * *
     * `auto` Reduces the estimate by the value of `timeSpent` in the worklog.
     */
    @Nullable 
    private String adjustEstimate = "auto";

    /**
     * The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when `adjustEstimate` is `new`.
     */
    @Nullable 
    private String newEstimate;

    /**
     * The amount to increase the issue's remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when `adjustEstimate` is `manual`.
     */
    @Nullable 
    private String increaseBy;

    /**
     * Whether the work log entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Connect and Forge app users with admin permission can use this flag.
     */
    @Nullable 
    private Boolean overrideEditableFlag = false;

    /**
     * Constructs a validated implementation of {@link DeleteWorklogOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(issueIdOrKey, "issueIdOrKey is a required parameter!");
        Objects.requireNonNull(id, "id is a required parameter!");
    }

}
