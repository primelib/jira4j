package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Project;
import io.github.primelib.jira4j.restv2.model.ProjectCategory;
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
 * CreateProjectCategorySpec
 * <p>
 * Specification for the CreateProjectCategory operation.
 * <p>
 * Create project category
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateProjectCategoryOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private ProjectCategory projectCategory;

    /**
     * Constructs a validated instance of {@link CreateProjectCategoryOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateProjectCategoryOperationSpec(Consumer<CreateProjectCategoryOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateProjectCategoryOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param projectCategory      
     */
    @ApiStatus.Internal
    public CreateProjectCategoryOperationSpec(ProjectCategory projectCategory) {
        this.projectCategory = projectCategory;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(projectCategory, "projectCategory is a required parameter!");
    }
}
