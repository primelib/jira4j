package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * DeleteActorSpec
 * <p>
 * Specification for the DeleteActor operation.
 * <p>
 * Delete actors from project role
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteActorOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The project ID or project key (case sensitive).
     */
    @NotNull 
    private String projectIdOrKey;

    /**
     * The ID of the project role. Use [Get all project roles](#api-rest-api-2-role-get) to get a list of project role IDs.
     */
    @NotNull 
    private Long id;

    /**
     * The user account ID of the user to remove from the project role.
     */
    @Nullable 
    private String user;

    /**
     * The name of the group to remove from the project role. This parameter cannot be used with the `groupId` parameter. As a group's name can change, use of `groupId` is recommended.
     */
    @Nullable 
    private String group;

    /**
     * The ID of the group to remove from the project role. This parameter cannot be used with the `group` parameter.
     */
    @Nullable 
    private String groupId;

    /**
     * Constructs a validated implementation of {@link DeleteActorOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteActorOperationSpec(Consumer<DeleteActorOperationSpec> spec) {
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
        Objects.requireNonNull(projectIdOrKey, "projectIdOrKey is a required parameter!");
        Objects.requireNonNull(id, "id is a required parameter!");
    }

}
