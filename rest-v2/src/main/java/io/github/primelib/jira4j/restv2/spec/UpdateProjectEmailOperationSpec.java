package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Project;
import io.github.primelib.jira4j.restv2.model.ProjectEmailAddress;
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
 * UpdateProjectEmailSpec
 * <p>
 * Specification for the UpdateProjectEmail operation.
 * <p>
 * Set project's sender email
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateProjectEmailOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The project ID.
     */
    @NotNull 
    private Long projectId;

    /**
     * The project's sender email address to be set.
     */
    @NotNull 
    private ProjectEmailAddress projectEmailAddress;

    /**
     * Constructs a validated instance of {@link UpdateProjectEmailOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateProjectEmailOperationSpec(Consumer<UpdateProjectEmailOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateProjectEmailOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param projectId            The project ID.
     * @param projectEmailAddress  The project's sender email address to be set.
     */
    @ApiStatus.Internal
    public UpdateProjectEmailOperationSpec(Long projectId, ProjectEmailAddress projectEmailAddress) {
        this.projectId = projectId;
        this.projectEmailAddress = projectEmailAddress;

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
        Objects.requireNonNull(projectEmailAddress, "projectEmailAddress is a required parameter!");
    }
}
