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
 * FindAssignableUsersSpec
 * <p>
 * Specification for the FindAssignableUsers operation.
 * <p>
 * Find users assignable to issues
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FindAssignableUsersOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * A query string that is matched against user attributes, such as `displayName`, and `emailAddress`, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a `displayName` of *John Smith* and a user with an `emailAddress` of *johnson@example.com*. Required, unless `username` or `accountId` is specified.
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
     * A query string that is matched exactly against user `accountId`. Required, unless `query` is specified.
     */
    @Nullable 
    private String accountId;

    /**
     * The project ID or project key (case sensitive). Required, unless `issueKey` is specified.
     */
    @Nullable 
    private String project;

    /**
     * The key of the issue. Required, unless `project` is specified.
     */
    @Nullable 
    private String issueKey;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Integer startAt = 0;

    /**
     * The maximum number of items to return. This operation may return less than the maximum number of items even if more are available. The operation fetches users up to the maximum and then, from the fetched users, returns only the users that can be assigned to the issue.
     */
    @Nullable 
    private Integer maxResults = 50;

    /**
     * The ID of the transition.
     */
    @Nullable 
    private Integer actionDescriptorId;

    /**
     */
    @Nullable 
    private Boolean recommend = false;

    /**
     * Constructs a validated implementation of {@link FindAssignableUsersOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }

}
