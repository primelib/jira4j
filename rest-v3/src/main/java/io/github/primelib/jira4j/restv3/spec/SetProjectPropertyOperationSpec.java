package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Project;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * SetProjectPropertySpec
 * <p>
 * Specification for the SetProjectProperty operation.
 * <p>
 * Set project property
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetProjectPropertyOperationSpec {
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
     * The key of the project property. The maximum length is 255 characters.
     */
    @NotNull 
    private String propertyKey;

    /**
     */
    @NotNull 
    private Object body;

    /**
     * Constructs a validated implementation of {@link SetProjectPropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetProjectPropertyOperationSpec(Consumer<SetProjectPropertyOperationSpec> spec) {
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
        Objects.requireNonNull(propertyKey, "propertyKey is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }

}
