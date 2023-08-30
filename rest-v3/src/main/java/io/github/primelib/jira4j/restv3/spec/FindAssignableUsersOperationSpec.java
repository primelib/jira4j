package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv3.model.User;
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
 * FindAssignableUsersSpec
 * <p>
 * Specification for the FindAssignableUsers operation.
 * <p>
 * Find users assignable to issues
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FindAssignableUsersOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * A query string that is matched against user attributes, such as {@code displayName}, and {@code emailAddress}, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a {@code displayName} of *John Smith* and a user with an {@code emailAddress} of *johnson@example.com*. Required, unless {@code username} or {@code accountId} is specified.
     */
    @Nullable 
    private String query;

    /**
     * The sessionId of this request. SessionId is the same until the assignee is set.
     */
    @Nullable 
    private String sessionId;

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
     * The project ID or project key (case sensitive). Required, unless {@code issueKey} is specified.
     */
    @Nullable 
    private String project;

    /**
     * The key of the issue. Required, unless {@code project} is specified.
     */
    @Nullable 
    private String issueKey;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Integer startAt;

    /**
     * The maximum number of items to return. This operation may return less than the maximum number of items even if more are available. The operation fetches users up to the maximum and then, from the fetched users, returns only the users that can be assigned to the issue.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * The ID of the transition.
     */
    @Nullable 
    private Integer actionDescriptorId;

    /**
     */
    @Nullable 
    private Boolean recommend;

    /**
     * Constructs a validated instance of {@link FindAssignableUsersOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FindAssignableUsersOperationSpec(Consumer<FindAssignableUsersOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link FindAssignableUsersOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param query                A query string that is matched against user attributes, such as {@code displayName}, and {@code emailAddress}, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a {@code displayName} of *John Smith* and a user with an {@code emailAddress} of *johnson@example.com*. Required, unless {@code username} or {@code accountId} is specified.
     * @param sessionId            The sessionId of this request. SessionId is the same until the assignee is set.
     * @param username             This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param accountId            A query string that is matched exactly against user {@code accountId}. Required, unless {@code query} is specified.
     * @param project              The project ID or project key (case sensitive). Required, unless {@code issueKey} is specified.
     * @param issueKey             The key of the issue. Required, unless {@code project} is specified.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return. This operation may return less than the maximum number of items even if more are available. The operation fetches users up to the maximum and then, from the fetched users, returns only the users that can be assigned to the issue.
     * @param actionDescriptorId   The ID of the transition.
     * @param recommend            
     */
    @ApiStatus.Internal
    public FindAssignableUsersOperationSpec(String query, String sessionId, String username, String accountId, String project, String issueKey, Integer startAt, Integer maxResults, Integer actionDescriptorId, Boolean recommend) {
        this.query = query;
        this.sessionId = sessionId;
        this.username = username;
        this.accountId = accountId;
        this.project = project;
        this.issueKey = issueKey;
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.actionDescriptorId = actionDescriptorId;
        this.recommend = recommend;

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
