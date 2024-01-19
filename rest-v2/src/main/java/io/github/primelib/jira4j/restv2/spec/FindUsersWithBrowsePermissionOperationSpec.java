package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
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
 * FindUsersWithBrowsePermissionSpec
 * <p>
 * Specification for the FindUsersWithBrowsePermission operation.
 * <p>
 * Find users with browse permission
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FindUsersWithBrowsePermissionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

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
     * The issue key for the issue. Required, unless {@code projectKey} is specified.
     */
    @Nullable 
    private String issueKey;

    /**
     * The project key for the project (case sensitive). Required, unless {@code issueKey} is specified.
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
     * Constructs a validated instance of {@link FindUsersWithBrowsePermissionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FindUsersWithBrowsePermissionOperationSpec(Consumer<FindUsersWithBrowsePermissionOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link FindUsersWithBrowsePermissionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param query                A query string that is matched against user attributes, such as {@code displayName} and {@code emailAddress}, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a {@code displayName} of *John Smith* and a user with an {@code emailAddress} of *johnson@example.com*. Required, unless {@code accountId} is specified.
     * @param username             This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param accountId            A query string that is matched exactly against user {@code accountId}. Required, unless {@code query} is specified.
     * @param issueKey             The issue key for the issue. Required, unless {@code projectKey} is specified.
     * @param projectKey           The project key for the project (case sensitive). Required, unless {@code issueKey} is specified.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     */
    @ApiStatus.Internal
    public FindUsersWithBrowsePermissionOperationSpec(String query, String username, String accountId, String issueKey, String projectKey, Integer startAt, Integer maxResults) {
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
    }
}
