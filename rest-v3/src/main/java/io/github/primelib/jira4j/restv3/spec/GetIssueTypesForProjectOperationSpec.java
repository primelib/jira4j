package io.github.primelib.jira4j.restv3.spec;

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
 * GetIssueTypesForProjectSpec
 * <p>
 * Specification for the GetIssueTypesForProject operation.
 * <p>
 * Get issue types for project
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetIssueTypesForProjectOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the project.
     */
    @NotNull 
    private Long projectId;

    /**
     * The level of the issue type to filter by. Use:
     *  *
     * `-1` for Subtask.
     * *
     * `0` for Base.
     * *
     * `1` for Epic.
     */
    @Nullable 
    private Integer level;

    /**
     * Constructs a validated implementation of {@link GetIssueTypesForProjectOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetIssueTypesForProjectOperationSpec(Consumer<GetIssueTypesForProjectOperationSpec> spec) {
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
        Objects.requireNonNull(projectId, "projectId is a required parameter!");
    }

}
