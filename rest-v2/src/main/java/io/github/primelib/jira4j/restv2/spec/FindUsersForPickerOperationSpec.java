package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Avatar;
import java.net.URI;
import io.github.primelib.jira4j.restv2.model.User;
import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FindUsersForPickerOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * A query string that is matched against user attributes, such as `displayName`, and `emailAddress`, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a `displayName` of *John Smith* and a user with an `emailAddress` of *johnson@example.com*.
     */
    @NotNull 
    private String query;

    /**
     * The maximum number of items to return. The total number of matched users is returned in `total`.
     */
    @Nullable 
    private Integer maxResults = 50;

    /**
     * Include the URI to the user's avatar.
     */
    @Nullable 
    private Boolean showAvatar = false;

    /**
     * This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @Nullable 
    private List<String> exclude;

    /**
     * A list of account IDs to exclude from the search results. This parameter accepts a comma-separated list. Multiple account IDs can also be provided using an ampersand-separated list. For example, `excludeAccountIds=5b10a2844c20165700ede21g,5b10a0effa615349cb016cd8&amp;excludeAccountIds=5b10ac8d82e05b22cc7d4ef5`. Cannot be provided with `exclude`.
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
    private Boolean excludeConnectUsers = false;

    /**
     * Constructs a validated implementation of {@link FindUsersForPickerOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(query, "query is a required parameter!");
    }

}
