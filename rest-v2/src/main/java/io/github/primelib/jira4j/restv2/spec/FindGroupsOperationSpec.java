package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Group;
import java.util.Set;
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
 * FindGroupsSpec
 * <p>
 * Specification for the FindGroups operation.
 * <p>
 * Find groups
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FindGroupsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This parameter is deprecated, setting it does not affect the results. To find groups containing a particular user, use [Get user groups](#api-rest-api-2-user-groups-get).
     */
    @Nullable 
    private String accountId;

    /**
     * The string to find in group names.
     */
    @Nullable 
    private String query;

    /**
     * As a group's name can change, use of {@code excludeGroupIds} is recommended to identify a group.
     *  A group to exclude from the result. To exclude multiple groups, provide an ampersand-separated list. For example, {@code exclude=group1&amp;exclude=group2}. This parameter cannot be used with the {@code excludeGroupIds} parameter.
     */
    @Nullable 
    private List<String> exclude;

    /**
     * A group ID to exclude from the result. To exclude multiple groups, provide an ampersand-separated list. For example, {@code excludeId=group1-id&amp;excludeId=group2-id}. This parameter cannot be used with the {@code excludeGroups} parameter.
     */
    @Nullable 
    private List<String> excludeId;

    /**
     * The maximum number of groups to return. The maximum number of groups that can be returned is limited by the system property {@code jira.ajax.autocomplete.limit}.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * Whether the search for groups should be case insensitive.
     */
    @Nullable 
    private Boolean caseInsensitive;

    /**
     * This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @Nullable 
    private String userName;

    /**
     * Constructs a validated instance of {@link FindGroupsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FindGroupsOperationSpec(Consumer<FindGroupsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link FindGroupsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param accountId            This parameter is deprecated, setting it does not affect the results. To find groups containing a particular user, use [Get user groups](#api-rest-api-2-user-groups-get).
     * @param query                The string to find in group names.
     * @param exclude              As a group's name can change, use of {@code excludeGroupIds} is recommended to identify a group.   A group to exclude from the result. To exclude multiple groups, provide an ampersand-separated list. For example, {@code exclude=group1&amp;exclude=group2}. This parameter cannot be used with the {@code excludeGroupIds} parameter.
     * @param excludeId            A group ID to exclude from the result. To exclude multiple groups, provide an ampersand-separated list. For example, {@code excludeId=group1-id&amp;excludeId=group2-id}. This parameter cannot be used with the {@code excludeGroups} parameter.
     * @param maxResults           The maximum number of groups to return. The maximum number of groups that can be returned is limited by the system property {@code jira.ajax.autocomplete.limit}.
     * @param caseInsensitive      Whether the search for groups should be case insensitive.
     * @param userName             This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @ApiStatus.Internal
    public FindGroupsOperationSpec(String accountId, String query, List<String> exclude, List<String> excludeId, Integer maxResults, Boolean caseInsensitive, String userName) {
        this.accountId = accountId;
        this.query = query;
        this.exclude = exclude;
        this.excludeId = excludeId;
        this.maxResults = maxResults;
        this.caseInsensitive = caseInsensitive;
        this.userName = userName;

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
