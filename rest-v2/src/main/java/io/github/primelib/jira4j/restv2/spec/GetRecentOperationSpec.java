package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetRecentSpec
 * <p>
 * Specification for the GetRecent operation.
 * <p>
 * Get recent projects
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetRecentOperationSpec {
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
     * `projectKeys` Returns all project keys associated with a project.
     * *
     * `lead` Returns information about the project lead.
     * *
     * `issueTypes` Returns all issue types associated with the project.
     * *
     * `url` Returns the URL associated with the project.
     * *
     * `permissions` Returns the permissions associated with the project.
     * *
     * `insight` EXPERIMENTAL. Returns the insight details of total issue count and last issue update time for the project.
     * *
     * `*` Returns the project with all available expand options.
     */
    @Nullable 
    private String expand;

    /**
     * EXPERIMENTAL. A list of project properties to return for the project. This parameter accepts a comma-separated list. Invalid property names are ignored.
     */
    @Nullable 
    private List<Object> properties;

    /**
     * Constructs a validated implementation of {@link GetRecentOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetRecentOperationSpec(Consumer<GetRecentOperationSpec> spec) {
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
