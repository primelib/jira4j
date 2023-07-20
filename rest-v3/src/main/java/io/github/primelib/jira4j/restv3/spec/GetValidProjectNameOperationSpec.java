package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Project;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetValidProjectNameSpec
 * <p>
 * Specification for the GetValidProjectName operation.
 * <p>
 * Get valid project name
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetValidProjectNameOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The project name.
     */
    @NotNull 
    private String name;

    /**
     * Constructs a validated implementation of {@link GetValidProjectNameOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetValidProjectNameOperationSpec(Consumer<GetValidProjectNameOperationSpec> spec) {
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
        Objects.requireNonNull(name, "name is a required parameter!");
    }

}
