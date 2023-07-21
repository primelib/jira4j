package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Project;
import java.util.Set;
import io.github.primelib.jira4j.restv2.model.UpdateProjectDetails;
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
 * UpdateProjectSpec
 * <p>
 * Specification for the UpdateProject operation.
 * <p>
 * Update project
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateProjectOperationSpec {
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
     * The project details to be updated.
     */
    @NotNull 
    private UpdateProjectDetails updateProjectDetails;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that the project description, issue types, and project lead are included in all responses by default. Expand options include:
     *  *
     * {@code description} The project description.
     * *
     * {@code issueTypes} The issue types associated with the project.
     * *
     * {@code lead} The project lead.
     * *
     * {@code projectKeys} All project keys associated with the project.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link UpdateProjectOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateProjectOperationSpec(Consumer<UpdateProjectOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateProjectOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param projectIdOrKey       The project ID or project key (case sensitive).
     * @param updateProjectDetails The project details to be updated.
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that the project description, issue types, and project lead are included in all responses by default. Expand options include:   *  {@code description} The project description.  *  {@code issueTypes} The issue types associated with the project.  *  {@code lead} The project lead.  *  {@code projectKeys} All project keys associated with the project.
     */
    @ApiStatus.Internal
    public UpdateProjectOperationSpec(String projectIdOrKey, UpdateProjectDetails updateProjectDetails, String expand) {
        this.projectIdOrKey = projectIdOrKey;
        this.updateProjectDetails = updateProjectDetails;
        this.expand = expand;

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
        Objects.requireNonNull(updateProjectDetails, "updateProjectDetails is a required parameter!");
    }
}
