package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Project;
import io.github.primelib.jira4j.restv3.model.ProjectRole;
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
 * DeleteProjectRoleActorsFromRoleSpec
 * <p>
 * Specification for the DeleteProjectRoleActorsFromRole operation.
 * <p>
 * Delete default actors from project role
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteProjectRoleActorsFromRoleOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
     */
    @NotNull 
    private Long id;

    /**
     * The user account ID of the user to remove as a default actor.
     */
    @Nullable 
    private String user;

    /**
     * The group ID of the group to be removed as a default actor. This parameter cannot be used with the {@code group} parameter.
     */
    @Nullable 
    private String groupId;

    /**
     * The group name of the group to be removed as a default actor.This parameter cannot be used with the {@code groupId} parameter. As a group's name can change, use of {@code groupId} is recommended.
     */
    @Nullable 
    private String group;

    /**
     * Constructs a validated instance of {@link DeleteProjectRoleActorsFromRoleOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteProjectRoleActorsFromRoleOperationSpec(Consumer<DeleteProjectRoleActorsFromRoleOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteProjectRoleActorsFromRoleOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
     * @param user                 The user account ID of the user to remove as a default actor.
     * @param groupId              The group ID of the group to be removed as a default actor. This parameter cannot be used with the {@code group} parameter.
     * @param group                The group name of the group to be removed as a default actor.This parameter cannot be used with the {@code groupId} parameter. As a group's name can change, use of {@code groupId} is recommended.
     */
    @ApiStatus.Internal
    public DeleteProjectRoleActorsFromRoleOperationSpec(Long id, String user, String groupId, String group) {
        this.id = id;
        this.user = user;
        this.groupId = groupId;
        this.group = group;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
    }
}
