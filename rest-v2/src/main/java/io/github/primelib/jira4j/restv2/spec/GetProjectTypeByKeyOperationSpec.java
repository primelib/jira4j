package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Project;
import io.github.primelib.jira4j.restv2.model.ProjectType;
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
 * GetProjectTypeByKeySpec
 * <p>
 * Specification for the GetProjectTypeByKey operation.
 * <p>
 * Get project type by key
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link GetProjectTypeByKeyOperationSpec}.
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
     * Constructs a validated instance of {@link GetProjectTypeByKeyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param projectTypeKey       The key of the project type.
     */
    @ApiStatus.Internal
    public GetProjectTypeByKeyOperationSpec(String projectTypeKey) {
        this.projectTypeKey = projectTypeKey;

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
