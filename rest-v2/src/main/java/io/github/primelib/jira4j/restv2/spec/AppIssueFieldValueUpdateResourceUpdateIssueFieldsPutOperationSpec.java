package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.ConnectCustomFieldValues;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * AppIssueFieldValueUpdateResourceUpdateIssueFieldsPutSpec
 * <p>
 * Specification for the AppIssueFieldValueUpdateResourceUpdateIssueFieldsPut operation.
 * <p>
 * Bulk update custom field value
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AppIssueFieldValueUpdateResourceUpdateIssueFieldsPutOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the transfer.
     */
    @NotNull 
    private UUID atlassianTransferId;

    /**
     */
    @NotNull 
    private ConnectCustomFieldValues connectCustomFieldValues;

    /**
     * Constructs a validated implementation of {@link AppIssueFieldValueUpdateResourceUpdateIssueFieldsPutOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AppIssueFieldValueUpdateResourceUpdateIssueFieldsPutOperationSpec(Consumer<AppIssueFieldValueUpdateResourceUpdateIssueFieldsPutOperationSpec> spec) {
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
        Objects.requireNonNull(atlassianTransferId, "atlassianTransferId is a required parameter!");
        Objects.requireNonNull(connectCustomFieldValues, "connectCustomFieldValues is a required parameter!");
    }

}
