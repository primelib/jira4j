package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Project;
import io.github.primelib.jira4j.restv3.model.ProjectType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetProjectTypeByKeySpec
 * <p>
 * Specification for the GetProjectTypeByKey operation.
 * <p>
 * Get project type by key
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetProjectTypeByKeyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the project type.
     */
    @NotNull 
    private String projectTypeKey;

    /**
     * Constructs a validated implementation of {@link GetProjectTypeByKeyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetProjectTypeByKeyOperationSpec(Consumer<GetProjectTypeByKeyOperationSpec> spec) {
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
        Objects.requireNonNull(projectTypeKey, "projectTypeKey is a required parameter!");
    }

}
