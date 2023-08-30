package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Resolution;
import java.util.Set;
import io.github.primelib.jira4j.restv2.model.SetDefaultResolutionRequest;
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
 * SetDefaultResolutionSpec
 * <p>
 * Specification for the SetDefaultResolution operation.
 * <p>
 * Set default resolution
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetDefaultResolutionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private SetDefaultResolutionRequest setDefaultResolutionRequest;

    /**
     * Constructs a validated instance of {@link SetDefaultResolutionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetDefaultResolutionOperationSpec(Consumer<SetDefaultResolutionOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SetDefaultResolutionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param setDefaultResolutionRequest 
     */
    @ApiStatus.Internal
    public SetDefaultResolutionOperationSpec(SetDefaultResolutionRequest setDefaultResolutionRequest) {
        this.setDefaultResolutionRequest = setDefaultResolutionRequest;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(setDefaultResolutionRequest, "setDefaultResolutionRequest is a required parameter!");
    }
}
