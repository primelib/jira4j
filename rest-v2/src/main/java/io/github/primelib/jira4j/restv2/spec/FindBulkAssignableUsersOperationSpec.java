package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.User;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * FindBulkAssignableUsersSpec
 * <p>
 * Specification for the FindBulkAssignableUsers operation.
 * <p>
 * Find users assignable to projects
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FindBulkAssignableUsersOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * A list of project keys (case sensitive). This parameter accepts a comma-separated list.
     */
    @NotNull 
    private String projectKeys;

    /**
     * A query string that is matched against user attributes, such as `displayName` and `emailAddress`, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a `displayName` of *John Smith* and a user with an `emailAddress` of *johnson@example.com*. Required, unless `accountId` is specified.
     */
    @Nullable 
    private String query;

    /**
     * This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @Nullable 
    private String username;

    /**
     * A query string that is matched exactly against user `accountId`. Required, unless `query` is specified.
     */
    @Nullable 
    private String accountId;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Integer startAt = 0;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults = 50;

    /**
     * Constructs a validated implementation of {@link FindBulkAssignableUsersOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FindBulkAssignableUsersOperationSpec(Consumer<FindBulkAssignableUsersOperationSpec> spec) {
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
        Objects.requireNonNull(projectKeys, "projectKeys is a required parameter!");
    }

}
