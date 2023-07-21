package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Project;
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
 * GetValidProjectNameSpec
 * <p>
 * Specification for the GetValidProjectName operation.
 * <p>
 * Get valid project name
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link GetValidProjectNameOperationSpec}.
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
     * Constructs a validated instance of {@link GetValidProjectNameOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param name                 The project name.
     */
    @ApiStatus.Internal
    public GetValidProjectNameOperationSpec(String name) {
        this.name = name;

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
