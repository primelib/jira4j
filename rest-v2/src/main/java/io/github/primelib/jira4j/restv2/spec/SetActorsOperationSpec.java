package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Project;
import io.github.primelib.jira4j.restv2.model.ProjectRole;
import io.github.primelib.jira4j.restv2.model.ProjectRoleActorsUpdateBean;
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
 * SetActorsSpec
 * <p>
 * Specification for the SetActors operation.
 * <p>
 * Set actors for project role
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetActorsOperationSpec {
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
     * The groups or users to associate with the project role for this project. Provide the user account ID, group name, or group ID. As a group's name can change, use of group ID is recommended.
     */
    @NotNull 
    private ProjectRoleActorsUpdateBean projectRoleActorsUpdateBean;

    /**
     * Constructs a validated instance of {@link SetActorsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetActorsOperationSpec(Consumer<SetActorsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SetActorsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param projectIdOrKey       The project ID or project key (case sensitive).
     * @param id                   The ID of the project role. Use [Get all project roles](#api-rest-api-2-role-get) to get a list of project role IDs.
     * @param projectRoleActorsUpdateBean The groups or users to associate with the project role for this project. Provide the user account ID, group name, or group ID. As a group's name can change, use of group ID is recommended.
     */
    @ApiStatus.Internal
    public SetActorsOperationSpec(String projectIdOrKey, Long id, ProjectRoleActorsUpdateBean projectRoleActorsUpdateBean) {
        this.projectIdOrKey = projectIdOrKey;
        this.id = id;
        this.projectRoleActorsUpdateBean = projectRoleActorsUpdateBean;

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
        Objects.requireNonNull(projectRoleActorsUpdateBean, "projectRoleActorsUpdateBean is a required parameter!");
    }
}
