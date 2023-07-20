package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Project;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetAllProjectsSpec
 * <p>
 * Specification for the GetAllProjects operation.
 * <p>
 * Get all projects
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAllProjectsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:
     *  *
     * `description` Returns the project description.
     * *
     * `issueTypes` Returns all issue types associated with the project.
     * *
     * `lead` Returns information about the project lead.
     * *
     * `projectKeys` Returns all project keys associated with the project.
     */
    @Nullable 
    private String expand;

    /**
     * Returns the user's most recently accessed projects. You may specify the number of results to return up to a maximum of 20. If access is anonymous, then the recently accessed projects are based on the current HTTP session.
     */
    @Nullable 
    private Integer recent;

    /**
     * A list of project properties to return for the project. This parameter accepts a comma-separated list.
     */
    @Nullable 
    private List<String> properties;

    /**
     * Constructs a validated implementation of {@link GetAllProjectsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAllProjectsOperationSpec(Consumer<GetAllProjectsOperationSpec> spec) {
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
    }

}
