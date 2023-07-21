package io.github.primelib.jira4j.restv3.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Avatar;
import io.github.primelib.jira4j.restv3.model.Group;
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
 * FindUsersAndGroupsSpec
 * <p>
 * Specification for the FindUsersAndGroups operation.
 * <p>
 * Find users and groups
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FindUsersAndGroupsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The search string.
     */
    @NotNull 
    private String query;

    /**
     * The maximum number of items to return in each list.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * Whether the user avatar should be returned. If an invalid value is provided, the default value is used.
     */
    @Nullable 
    private Boolean showAvatar;

    /**
     * The custom field ID of the field this request is for.
     */
    @Nullable 
    private String fieldId;

    /**
     * The ID of a project that returned users and groups must have permission to view. To include multiple projects, provide an ampersand-separated list. For example, {@code projectId=10000&amp;projectId=10001}. This parameter is only used when {@code fieldId} is present.
     */
    @Nullable 
    private List<String> projectId;

    /**
     * The ID of an issue type that returned users and groups must have permission to view. To include multiple issue types, provide an ampersand-separated list. For example, {@code issueTypeId=10000&amp;issueTypeId=10001}. Special values, such as {@code -1} (all standard issue types) and {@code -2} (all subtask issue types), are supported. This parameter is only used when {@code fieldId} is present.
     */
    @Nullable 
    private List<String> issueTypeId;

    /**
     * The size of the avatar to return. If an invalid value is provided, the default value is used.
     */
    @Nullable 
    private String avatarSize;

    /**
     * Whether the search for groups should be case insensitive.
     */
    @Nullable 
    private Boolean caseInsensitive;

    /**
     * Whether Connect app users and groups should be excluded from the search results. If an invalid value is provided, the default value is used.
     */
    @Nullable 
    private Boolean excludeConnectAddons;

    /**
     * Constructs a validated instance of {@link FindUsersAndGroupsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FindUsersAndGroupsOperationSpec(Consumer<FindUsersAndGroupsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link FindUsersAndGroupsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param query                The search string.
     * @param maxResults           The maximum number of items to return in each list.
     * @param showAvatar           Whether the user avatar should be returned. If an invalid value is provided, the default value is used.
     * @param fieldId              The custom field ID of the field this request is for.
     * @param projectId            The ID of a project that returned users and groups must have permission to view. To include multiple projects, provide an ampersand-separated list. For example, {@code projectId=10000&amp;projectId=10001}. This parameter is only used when {@code fieldId} is present.
     * @param issueTypeId          The ID of an issue type that returned users and groups must have permission to view. To include multiple issue types, provide an ampersand-separated list. For example, {@code issueTypeId=10000&amp;issueTypeId=10001}. Special values, such as {@code -1} (all standard issue types) and {@code -2} (all subtask issue types), are supported. This parameter is only used when {@code fieldId} is present.
     * @param avatarSize           The size of the avatar to return. If an invalid value is provided, the default value is used.
     * @param caseInsensitive      Whether the search for groups should be case insensitive.
     * @param excludeConnectAddons Whether Connect app users and groups should be excluded from the search results. If an invalid value is provided, the default value is used.
     */
    @ApiStatus.Internal
    public FindUsersAndGroupsOperationSpec(String query, Integer maxResults, Boolean showAvatar, String fieldId, List<String> projectId, List<String> issueTypeId, String avatarSize, Boolean caseInsensitive, Boolean excludeConnectAddons) {
        this.query = query;
        this.maxResults = maxResults;
        this.showAvatar = showAvatar;
        this.fieldId = fieldId;
        this.projectId = projectId;
        this.issueTypeId = issueTypeId;
        this.avatarSize = avatarSize;
        this.caseInsensitive = caseInsensitive;
        this.excludeConnectAddons = excludeConnectAddons;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(query, "query is a required parameter!");
    }
}
