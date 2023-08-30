package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv3.model.User;
import io.github.primelib.jira4j.restv3.model.Worklog;
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
 * AddWorklogSpec
 * <p>
 * Specification for the AddWorklog operation.
 * <p>
 * Add worklog
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddWorklogOperationSpec {
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
     * {@code manual} Reduces the estimate by amount specified in {@code reduceBy}.
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
     * The amount to reduce the issue's remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m). For example, *2d*. Required when {@code adjustEstimate} is {@code manual}.
     */
    @Nullable 
    private String reduceBy;

    /**
     * Use [expand](#expansion) to include additional information about work logs in the response. This parameter accepts {@code properties}, which returns worklog properties.
     */
    @Nullable 
    private String expand;

    /**
     * Whether the worklog entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) can use this flag.
     */
    @Nullable 
    private Boolean overrideEditableFlag;

    /**
     * Constructs a validated instance of {@link AddWorklogOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddWorklogOperationSpec(Consumer<AddWorklogOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link AddWorklogOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueIdOrKey         The ID or key the issue.
     * @param worklog              
     * @param notifyUsers          Whether users watching the issue are notified by email.
     * @param adjustEstimate       Defines how to update the issue's time estimate, the options are:   *  {@code new} Sets the estimate to a specific value, defined in {@code newEstimate}.  *  {@code leave} Leaves the estimate unchanged.  *  {@code manual} Reduces the estimate by amount specified in {@code reduceBy}.  *  {@code auto} Reduces the estimate by the value of {@code timeSpent} in the worklog.
     * @param newEstimate          The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when {@code adjustEstimate} is {@code new}.
     * @param reduceBy             The amount to reduce the issue's remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m). For example, *2d*. Required when {@code adjustEstimate} is {@code manual}.
     * @param expand               Use [expand](#expansion) to include additional information about work logs in the response. This parameter accepts {@code properties}, which returns worklog properties.
     * @param overrideEditableFlag Whether the worklog entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) can use this flag.
     */
    @ApiStatus.Internal
    public AddWorklogOperationSpec(String issueIdOrKey, Worklog worklog, Boolean notifyUsers, String adjustEstimate, String newEstimate, String reduceBy, String expand, Boolean overrideEditableFlag) {
        this.issueIdOrKey = issueIdOrKey;
        this.worklog = worklog;
        this.notifyUsers = notifyUsers;
        this.adjustEstimate = adjustEstimate;
        this.newEstimate = newEstimate;
        this.reduceBy = reduceBy;
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
        Objects.requireNonNull(worklog, "worklog is a required parameter!");
    }
}
