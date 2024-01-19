package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Avatar;
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
 * FindUsersForPickerSpec
 * <p>
 * Specification for the FindUsersForPicker operation.
 * <p>
 * Find users for picker
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FindUsersForPickerOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * A query string that is matched against user attributes, such as {@code displayName}, and {@code emailAddress}, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a {@code displayName} of *John Smith* and a user with an {@code emailAddress} of *johnson@example.com*.
     */
    @NotNull 
    private String query;

    /**
     * The maximum number of items to return. The total number of matched users is returned in {@code total}.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * Include the URI to the user's avatar.
     */
    @Nullable 
    private Boolean showAvatar;

    /**
     * This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @Nullable 
    private List<String> exclude;

    /**
     * A list of account IDs to exclude from the search results. This parameter accepts a comma-separated list. Multiple account IDs can also be provided using an ampersand-separated list. For example, {@code excludeAccountIds=5b10a2844c20165700ede21g,5b10a0effa615349cb016cd8&amp;excludeAccountIds=5b10ac8d82e05b22cc7d4ef5}. Cannot be provided with {@code exclude}.
     */
    @Nullable 
    private List<String> excludeAccountIds;

    /**
     */
    @Nullable 
    private String avatarSize;

    /**
     */
    @Nullable 
    private Boolean excludeConnectUsers;

    /**
     * Constructs a validated instance of {@link FindUsersForPickerOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FindUsersForPickerOperationSpec(Consumer<FindUsersForPickerOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link FindUsersForPickerOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param query                A query string that is matched against user attributes, such as {@code displayName}, and {@code emailAddress}, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a {@code displayName} of *John Smith* and a user with an {@code emailAddress} of *johnson@example.com*.
     * @param maxResults           The maximum number of items to return. The total number of matched users is returned in {@code total}.
     * @param showAvatar           Include the URI to the user's avatar.
     * @param exclude              This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param excludeAccountIds    A list of account IDs to exclude from the search results. This parameter accepts a comma-separated list. Multiple account IDs can also be provided using an ampersand-separated list. For example, {@code excludeAccountIds=5b10a2844c20165700ede21g,5b10a0effa615349cb016cd8&amp;excludeAccountIds=5b10ac8d82e05b22cc7d4ef5}. Cannot be provided with {@code exclude}.
     * @param avatarSize           
     * @param excludeConnectUsers  
     */
    @ApiStatus.Internal
    public FindUsersForPickerOperationSpec(String query, Integer maxResults, Boolean showAvatar, List<String> exclude, List<String> excludeAccountIds, String avatarSize, Boolean excludeConnectUsers) {
        this.query = query;
        this.maxResults = maxResults;
        this.showAvatar = showAvatar;
        this.exclude = exclude;
        this.excludeAccountIds = excludeAccountIds;
        this.avatarSize = avatarSize;
        this.excludeConnectUsers = excludeConnectUsers;

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
