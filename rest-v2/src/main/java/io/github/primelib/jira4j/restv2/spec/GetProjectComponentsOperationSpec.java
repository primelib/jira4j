package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Project;
import io.github.primelib.jira4j.restv2.model.ProjectComponent;
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
 * GetProjectComponentsSpec
 * <p>
 * Specification for the GetProjectComponents operation.
 * <p>
 * Get project components
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetProjectComponentsOperationSpec {
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
     * The source of the components to return. Can be {@code jira} (default), {@code compass} or {@code auto}. When {@code auto} is specified, the API will return connected Compass components if the project is opted into Compass, otherwise it will return Jira components. Defaults to {@code jira}.
     */
    @Nullable 
    private String componentSource;

    /**
     * Constructs a validated instance of {@link GetProjectComponentsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetProjectComponentsOperationSpec(Consumer<GetProjectComponentsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetProjectComponentsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param projectIdOrKey       The project ID or project key (case sensitive).
     * @param componentSource      The source of the components to return. Can be {@code jira} (default), {@code compass} or {@code auto}. When {@code auto} is specified, the API will return connected Compass components if the project is opted into Compass, otherwise it will return Jira components. Defaults to {@code jira}.
     */
    @ApiStatus.Internal
    public GetProjectComponentsOperationSpec(String projectIdOrKey, String componentSource) {
        this.projectIdOrKey = projectIdOrKey;
        this.componentSource = componentSource;

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
    }
}
