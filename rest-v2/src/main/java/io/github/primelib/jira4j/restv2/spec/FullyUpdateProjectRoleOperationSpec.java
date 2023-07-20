package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.CreateUpdateRoleRequestBean;
import io.github.primelib.jira4j.restv2.model.Project;
import io.github.primelib.jira4j.restv2.model.ProjectRole;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * FullyUpdateProjectRoleSpec
 * <p>
 * Specification for the FullyUpdateProjectRole operation.
 * <p>
 * Fully update project role
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FullyUpdateProjectRoleOperationSpec {
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
     */
    @NotNull 
    private CreateUpdateRoleRequestBean createUpdateRoleRequestBean;

    /**
     * Constructs a validated implementation of {@link FullyUpdateProjectRoleOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FullyUpdateProjectRoleOperationSpec(Consumer<FullyUpdateProjectRoleOperationSpec> spec) {
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
        Objects.requireNonNull(createUpdateRoleRequestBean, "createUpdateRoleRequestBean is a required parameter!");
    }

}
