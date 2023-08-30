package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Group;
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
 * RemoveUserFromGroupSpec
 * <p>
 * Specification for the RemoveUserFromGroup operation.
 * <p>
 * Remove user from group
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoveUserFromGroupOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
     */
    @NotNull 
    private String accountId;

    /**
     * As a group's name can change, use of {@code groupId} is recommended to identify a group.
     *  The name of the group. This parameter cannot be used with the {@code groupId} parameter.
     */
    @Nullable 
    private String groupname;

    /**
     * The ID of the group. This parameter cannot be used with the {@code groupName} parameter.
     */
    @Nullable 
    private String groupId;

    /**
     * This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @Nullable 
    private String username;

    /**
     * Constructs a validated instance of {@link RemoveUserFromGroupOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoveUserFromGroupOperationSpec(Consumer<RemoveUserFromGroupOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link RemoveUserFromGroupOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param accountId            The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
     * @param groupname            As a group's name can change, use of {@code groupId} is recommended to identify a group.   The name of the group. This parameter cannot be used with the {@code groupId} parameter.
     * @param groupId              The ID of the group. This parameter cannot be used with the {@code groupName} parameter.
     * @param username             This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @ApiStatus.Internal
    public RemoveUserFromGroupOperationSpec(String accountId, String groupname, String groupId, String username) {
        this.accountId = accountId;
        this.groupname = groupname;
        this.groupId = groupId;
        this.username = username;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(accountId, "accountId is a required parameter!");
    }
}
