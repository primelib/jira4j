package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Project;
import io.github.primelib.jira4j.restv2.model.ProjectFeatureState;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * ToggleFeatureForProjectSpec
 * <p>
 * Specification for the ToggleFeatureForProject operation.
 * <p>
 * Set project feature state
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ToggleFeatureForProjectOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID or (case-sensitive) key of the project.
     */
    @NotNull 
    private String projectIdOrKey;

    /**
     * The key of the feature.
     */
    @NotNull 
    private String featureKey;

    /**
     * Details of the feature state change.
     */
    @NotNull 
    private ProjectFeatureState projectFeatureState;

    /**
     * Constructs a validated implementation of {@link ToggleFeatureForProjectOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ToggleFeatureForProjectOperationSpec(Consumer<ToggleFeatureForProjectOperationSpec> spec) {
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
        Objects.requireNonNull(featureKey, "featureKey is a required parameter!");
        Objects.requireNonNull(projectFeatureState, "projectFeatureState is a required parameter!");
    }

}
