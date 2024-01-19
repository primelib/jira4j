package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

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
 * GetIssueTypesForProjectSpec
 * <p>
 * Specification for the GetIssueTypesForProject operation.
 * <p>
 * Get issue types for project
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * {@code -1} for Subtask.
     * *
     * {@code 0} for Base.
     * *
     * {@code 1} for Epic.
     */
    @Nullable 
    private Integer level;

    /**
     * Constructs a validated instance of {@link GetIssueTypesForProjectOperationSpec}.
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
     * Constructs a validated instance of {@link GetIssueTypesForProjectOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param projectId            The ID of the project.
     * @param level                The level of the issue type to filter by. Use:   *  {@code -1} for Subtask.  *  {@code 0} for Base.  *  {@code 1} for Epic.
     */
    @ApiStatus.Internal
    public GetIssueTypesForProjectOperationSpec(Long projectId, Integer level) {
        this.projectId = projectId;
        this.level = level;

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
