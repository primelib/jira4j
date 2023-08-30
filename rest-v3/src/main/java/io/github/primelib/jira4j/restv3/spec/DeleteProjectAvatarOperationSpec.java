package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Avatar;
import io.github.primelib.jira4j.restv3.model.Project;
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
 * DeleteProjectAvatarSpec
 * <p>
 * Specification for the DeleteProjectAvatar operation.
 * <p>
 * Delete project avatar
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteProjectAvatarOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The project ID or (case-sensitive) key.
     */
    @NotNull 
    private String projectIdOrKey;

    /**
     * The ID of the avatar.
     */
    @NotNull 
    private Long id;

    /**
     * Constructs a validated instance of {@link DeleteProjectAvatarOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteProjectAvatarOperationSpec(Consumer<DeleteProjectAvatarOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteProjectAvatarOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param projectIdOrKey       The project ID or (case-sensitive) key.
     * @param id                   The ID of the avatar.
     */
    @ApiStatus.Internal
    public DeleteProjectAvatarOperationSpec(String projectIdOrKey, Long id) {
        this.projectIdOrKey = projectIdOrKey;
        this.id = id;

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
