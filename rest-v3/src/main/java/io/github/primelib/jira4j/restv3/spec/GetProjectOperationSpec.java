package io.github.primelib.jira4j.restv3.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Project;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetProjectSpec
 * <p>
 * Specification for the GetProject operation.
 * <p>
 * Get project
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetProjectOperationSpec {
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
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that the project description, issue types, and project lead are included in all responses by default. Expand options include:
     *  *
     * `description` The project description.
     * *
     * `issueTypes` The issue types associated with the project.
     * *
     * `lead` The project lead.
     * *
     * `projectKeys` All project keys associated with the project.
     * *
     * `issueTypeHierarchy` The project issue type hierarchy.
     */
    @Nullable 
    private String expand;

    /**
     * A list of project properties to return for the project. This parameter accepts a comma-separated list.
     */
    @Nullable 
    private List<String> properties;

    /**
     * Constructs a validated implementation of {@link GetProjectOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetProjectOperationSpec(Consumer<GetProjectOperationSpec> spec) {
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
    }

}
