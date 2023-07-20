package io.github.primelib.jira4j.restv2.spec;

import java.util.Map;
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
 * UpdateWorklogSpec
 * <p>
 * Specification for the UpdateWorklog operation.
 * <p>
 * Update worklog
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
    private Map<String, Object> requestBody;

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
     * `auto` Updates the estimate by the difference between the original and updated value of `timeSpent` or `timeSpentSeconds`.
     */
    @Nullable 
    private String adjustEstimate = "auto";

    /**
     * The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when `adjustEstimate` is `new`.
     */
    @Nullable 
    private String newEstimate;

    /**
     * Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts `properties`, which returns worklog properties.
     */
    @Nullable 
    private String expand;

    /**
     * Whether the worklog should be added to the issue even if the issue is not editable. For example, because the issue is closed. Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) can use this flag.
     */
    @Nullable 
    private Boolean overrideEditableFlag = false;

    /**
     * Constructs a validated implementation of {@link UpdateWorklogOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(issueIdOrKey, "issueIdOrKey is a required parameter!");
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(requestBody, "requestBody is a required parameter!");
    }

}
