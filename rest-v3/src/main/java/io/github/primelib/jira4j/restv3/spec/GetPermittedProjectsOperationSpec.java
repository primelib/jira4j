package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Permissions;
import io.github.primelib.jira4j.restv3.model.PermissionsKeysBean;
import io.github.primelib.jira4j.restv3.model.PermittedProjects;
import io.github.primelib.jira4j.restv3.model.Project;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetPermittedProjectsSpec
 * <p>
 * Specification for the GetPermittedProjects operation.
 * <p>
 * Get permitted projects
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPermittedProjectsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private PermissionsKeysBean permissionsKeysBean;

    /**
     * Constructs a validated implementation of {@link GetPermittedProjectsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetPermittedProjectsOperationSpec(Consumer<GetPermittedProjectsOperationSpec> spec) {
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
        Objects.requireNonNull(permissionsKeysBean, "permissionsKeysBean is a required parameter!");
    }

}
