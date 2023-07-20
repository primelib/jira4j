package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Permissions;
import java.net.URI;
import io.github.primelib.jira4j.restv3.model.User;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * FindUsersWithAllPermissionsSpec
 * <p>
 * Specification for the FindUsersWithAllPermissions operation.
 * <p>
 * Find users with permissions
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FindUsersWithAllPermissionsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * A comma separated list of permissions. Permissions can be specified as any:
     *  *
     * permission returned by [Get all permissions](#api-rest-api-3-permissions-get).
     * *
     * custom project permission added by Connect apps.
     * *
     * (deprecated) one of the following:
     * 
     * 
     * 
     * 
     *  *
     * ASSIGNABLE\\_USER
     * 
     * 
     * *
     * ASSIGN\\_ISSUE
     * 
     * 
     * *
     * ATTACHMENT\\_DELETE\\_ALL
     * 
     * 
     * *
     * ATTACHMENT\\_DELETE\\_OWN
     * 
     * 
     * *
     * BROWSE
     * 
     * 
     * *
     * CLOSE\\_ISSUE
     * 
     * 
     * *
     * COMMENT\\_DELETE\\_ALL
     * 
     * 
     * *
     * COMMENT\\_DELETE\\_OWN
     * 
     * 
     * *
     * COMMENT\\_EDIT\\_ALL
     * 
     * 
     * *
     * COMMENT\\_EDIT\\_OWN
     * 
     * 
     * *
     * COMMENT\\_ISSUE
     * 
     * 
     * *
     * CREATE\\_ATTACHMENT
     * 
     * 
     * *
     * CREATE\\_ISSUE
     * 
     * 
     * *
     * DELETE\\_ISSUE
     * 
     * 
     * *
     * EDIT\\_ISSUE
     * 
     * 
     * *
     * LINK\\_ISSUE
     * 
     * 
     * *
     * MANAGE\\_WATCHER\\_LIST
     * 
     * 
     * *
     * MODIFY\\_REPORTER
     * 
     * 
     * *
     * MOVE\\_ISSUE
     * 
     * 
     * *
     * PROJECT\\_ADMIN
     * 
     * 
     * *
     * RESOLVE\\_ISSUE
     * 
     * 
     * *
     * SCHEDULE\\_ISSUE
     * 
     * 
     * *
     * SET\\_ISSUE\\_SECURITY
     * 
     * 
     * *
     * TRANSITION\\_ISSUE
     * 
     * 
     * *
     * VIEW\\_VERSION\\_CONTROL
     * 
     * 
     * *
     * VIEW\\_VOTERS\\_AND\\_WATCHERS
     * 
     * 
     * *
     * VIEW\\_WORKFLOW\\_READONLY
     * 
     * 
     * *
     * WORKLOG\\_DELETE\\_ALL
     * 
     * 
     * *
     * WORKLOG\\_DELETE\\_OWN
     * 
     * 
     * *
     * WORKLOG\\_EDIT\\_ALL
     * 
     * 
     * *
     * WORKLOG\\_EDIT\\_OWN
     * 
     * 
     * *
     * WORK\\_ISSUE
     */
    @NotNull 
    private String permissions;

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
     * The issue key for the issue.
     */
    @Nullable 
    private String issueKey;

    /**
     * The project key for the project (case sensitive).
     */
    @Nullable 
    private String projectKey;

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
     * Constructs a validated implementation of {@link FindUsersWithAllPermissionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FindUsersWithAllPermissionsOperationSpec(Consumer<FindUsersWithAllPermissionsOperationSpec> spec) {
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
        Objects.requireNonNull(permissions, "permissions is a required parameter!");
    }

}
