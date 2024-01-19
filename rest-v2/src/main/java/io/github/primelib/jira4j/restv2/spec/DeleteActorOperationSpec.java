package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

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
 * DeleteActorSpec
 * <p>
 * Specification for the DeleteActor operation.
 * <p>
 * Delete actors from project role
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * The name of the group to remove from the project role. This parameter cannot be used with the {@code groupId} parameter. As a group's name can change, use of {@code groupId} is recommended.
     */
    @Nullable 
    private String group;

    /**
     * The ID of the group to remove from the project role. This parameter cannot be used with the {@code group} parameter.
     */
    @Nullable 
    private String groupId;

    /**
     * Constructs a validated instance of {@link DeleteActorOperationSpec}.
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
     * Constructs a validated instance of {@link DeleteActorOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param projectIdOrKey       The project ID or project key (case sensitive).
     * @param id                   The ID of the project role. Use [Get all project roles](#api-rest-api-2-role-get) to get a list of project role IDs.
     * @param user                 The user account ID of the user to remove from the project role.
     * @param group                The name of the group to remove from the project role. This parameter cannot be used with the {@code groupId} parameter. As a group's name can change, use of {@code groupId} is recommended.
     * @param groupId              The ID of the group to remove from the project role. This parameter cannot be used with the {@code group} parameter.
     */
    @ApiStatus.Internal
    public DeleteActorOperationSpec(String projectIdOrKey, Long id, String user, String group, String groupId) {
        this.projectIdOrKey = projectIdOrKey;
        this.id = id;
        this.user = user;
        this.group = group;
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
        Objects.requireNonNull(projectIdOrKey, "projectIdOrKey is a required parameter!");
        Objects.requireNonNull(id, "id is a required parameter!");
    }
}
