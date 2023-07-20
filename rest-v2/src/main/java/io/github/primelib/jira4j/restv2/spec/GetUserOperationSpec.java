package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.User;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetUserSpec
 * <p>
 * Specification for the GetUser operation.
 * <p>
 * Get user
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetUserOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required.
     */
    @Nullable 
    private String accountId;

    /**
     * This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide) for details.
     */
    @Nullable 
    private String username;

    /**
     * This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide) for details.
     */
    @Nullable 
    private String key;

    /**
     * Use [expand](#expansion) to include additional information about users in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * `groups` includes all groups and nested groups to which the user belongs.
     * *
     * `applicationRoles` includes details of all the applications to which the user has access.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link GetUserOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetUserOperationSpec(Consumer<GetUserOperationSpec> spec) {
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
