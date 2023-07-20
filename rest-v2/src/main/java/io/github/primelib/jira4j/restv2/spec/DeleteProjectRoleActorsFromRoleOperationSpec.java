package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Project;
import io.github.primelib.jira4j.restv2.model.ProjectRole;
import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteProjectRoleActorsFromRoleOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the project role. Use [Get all project roles](#api-rest-api-2-role-get) to get a list of project role IDs.
     */
    @NotNull 
    private Long id;

    /**
     * The user account ID of the user to remove as a default actor.
     */
    @Nullable 
    private String user;

    /**
     * The group ID of the group to be removed as a default actor. This parameter cannot be used with the `group` parameter.
     */
    @Nullable 
    private String groupId;

    /**
     * The group name of the group to be removed as a default actor.This parameter cannot be used with the `groupId` parameter. As a group's name can change, use of `groupId` is recommended.
     */
    @Nullable 
    private String group;

    /**
     * Constructs a validated implementation of {@link DeleteProjectRoleActorsFromRoleOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
    }

}
