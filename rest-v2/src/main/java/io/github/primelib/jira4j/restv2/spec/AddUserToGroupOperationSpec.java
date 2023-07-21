package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Group;
import java.util.Set;
import io.github.primelib.jira4j.restv2.model.UpdateUserToGroupBean;
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
 * AddUserToGroupSpec
 * <p>
 * Specification for the AddUserToGroup operation.
 * <p>
 * Add user to group
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddUserToGroupOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The user to add to the group.
     */
    @NotNull 
    private UpdateUserToGroupBean updateUserToGroupBean;

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
     * Constructs a validated instance of {@link AddUserToGroupOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddUserToGroupOperationSpec(Consumer<AddUserToGroupOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link AddUserToGroupOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param updateUserToGroupBean The user to add to the group.
     * @param groupname            As a group's name can change, use of {@code groupId} is recommended to identify a group.   The name of the group. This parameter cannot be used with the {@code groupId} parameter.
     * @param groupId              The ID of the group. This parameter cannot be used with the {@code groupName} parameter.
     */
    @ApiStatus.Internal
    public AddUserToGroupOperationSpec(UpdateUserToGroupBean updateUserToGroupBean, String groupname, String groupId) {
        this.updateUserToGroupBean = updateUserToGroupBean;
        this.groupname = groupname;
        this.groupId = groupId;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(updateUserToGroupBean, "updateUserToGroupBean is a required parameter!");
    }
}
