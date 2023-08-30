package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Permissions;
import java.util.Set;
import java.net.URI;
import io.github.primelib.jira4j.restv2.model.User;
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
 * FindUsersWithAllPermissionsSpec
 * <p>
 * Specification for the FindUsersWithAllPermissions operation.
 * <p>
 * Find users with permissions
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * permission returned by [Get all permissions](#api-rest-api-2-permissions-get).
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
     * A query string that is matched against user attributes, such as {@code displayName} and {@code emailAddress}, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a {@code displayName} of *John Smith* and a user with an {@code emailAddress} of *johnson@example.com*. Required, unless {@code accountId} is specified.
     */
    @Nullable 
    private String query;

    /**
     * This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @Nullable 
    private String username;

    /**
     * A query string that is matched exactly against user {@code accountId}. Required, unless {@code query} is specified.
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
    private Integer startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * Constructs a validated instance of {@link FindUsersWithAllPermissionsOperationSpec}.
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
     * Constructs a validated instance of {@link FindUsersWithAllPermissionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param permissions          A comma separated list of permissions. Permissions can be specified as any:   *  permission returned by [Get all permissions](#api-rest-api-2-permissions-get).  *  custom project permission added by Connect apps.  *  (deprecated) one of the following:           *  ASSIGNABLE\\_USER      *  ASSIGN\\_ISSUE      *  ATTACHMENT\\_DELETE\\_ALL      *  ATTACHMENT\\_DELETE\\_OWN      *  BROWSE      *  CLOSE\\_ISSUE      *  COMMENT\\_DELETE\\_ALL      *  COMMENT\\_DELETE\\_OWN      *  COMMENT\\_EDIT\\_ALL      *  COMMENT\\_EDIT\\_OWN      *  COMMENT\\_ISSUE      *  CREATE\\_ATTACHMENT      *  CREATE\\_ISSUE      *  DELETE\\_ISSUE      *  EDIT\\_ISSUE      *  LINK\\_ISSUE      *  MANAGE\\_WATCHER\\_LIST      *  MODIFY\\_REPORTER      *  MOVE\\_ISSUE      *  PROJECT\\_ADMIN      *  RESOLVE\\_ISSUE      *  SCHEDULE\\_ISSUE      *  SET\\_ISSUE\\_SECURITY      *  TRANSITION\\_ISSUE      *  VIEW\\_VERSION\\_CONTROL      *  VIEW\\_VOTERS\\_AND\\_WATCHERS      *  VIEW\\_WORKFLOW\\_READONLY      *  WORKLOG\\_DELETE\\_ALL      *  WORKLOG\\_DELETE\\_OWN      *  WORKLOG\\_EDIT\\_ALL      *  WORKLOG\\_EDIT\\_OWN      *  WORK\\_ISSUE
     * @param query                A query string that is matched against user attributes, such as {@code displayName} and {@code emailAddress}, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a {@code displayName} of *John Smith* and a user with an {@code emailAddress} of *johnson@example.com*. Required, unless {@code accountId} is specified.
     * @param username             This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param accountId            A query string that is matched exactly against user {@code accountId}. Required, unless {@code query} is specified.
     * @param issueKey             The issue key for the issue.
     * @param projectKey           The project key for the project (case sensitive).
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     */
    @ApiStatus.Internal
    public FindUsersWithAllPermissionsOperationSpec(String permissions, String query, String username, String accountId, String issueKey, String projectKey, Integer startAt, Integer maxResults) {
        this.permissions = permissions;
        this.query = query;
        this.username = username;
        this.accountId = accountId;
        this.issueKey = issueKey;
        this.projectKey = projectKey;
        this.startAt = startAt;
        this.maxResults = maxResults;

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
