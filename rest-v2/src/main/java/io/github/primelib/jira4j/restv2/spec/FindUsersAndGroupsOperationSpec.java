package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Avatar;
import io.github.primelib.jira4j.restv2.model.Group;
import io.github.primelib.jira4j.restv2.model.User;
import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
    private Integer maxResults = 50;

    /**
     * Whether the user avatar should be returned. If an invalid value is provided, the default value is used.
     */
    @Nullable 
    private Boolean showAvatar = false;

    /**
     * The custom field ID of the field this request is for.
     */
    @Nullable 
    private String fieldId;

    /**
     * The ID of a project that returned users and groups must have permission to view. To include multiple projects, provide an ampersand-separated list. For example, `projectId=10000&amp;projectId=10001`. This parameter is only used when `fieldId` is present.
     */
    @Nullable 
    private List<String> projectId;

    /**
     * The ID of an issue type that returned users and groups must have permission to view. To include multiple issue types, provide an ampersand-separated list. For example, `issueTypeId=10000&amp;issueTypeId=10001`. Special values, such as `-1` (all standard issue types) and `-2` (all subtask issue types), are supported. This parameter is only used when `fieldId` is present.
     */
    @Nullable 
    private List<String> issueTypeId;

    /**
     * The size of the avatar to return. If an invalid value is provided, the default value is used.
     */
    @Nullable 
    private String avatarSize = "xsmall";

    /**
     * Whether the search for groups should be case insensitive.
     */
    @Nullable 
    private Boolean caseInsensitive = false;

    /**
     * Whether Connect app users and groups should be excluded from the search results. If an invalid value is provided, the default value is used.
     */
    @Nullable 
    private Boolean excludeConnectAddons = false;

    /**
     * Constructs a validated implementation of {@link FindUsersAndGroupsOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(query, "query is a required parameter!");
    }

}
