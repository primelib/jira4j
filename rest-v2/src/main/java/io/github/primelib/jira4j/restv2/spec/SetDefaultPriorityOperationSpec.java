package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Priority;
import java.util.Set;
import io.github.primelib.jira4j.restv2.model.SetDefaultPriorityRequest;
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
 * SetDefaultPrioritySpec
 * <p>
 * Specification for the SetDefaultPriority operation.
 * <p>
 * Set default priority
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetDefaultPriorityOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private SetDefaultPriorityRequest setDefaultPriorityRequest;

    /**
     * Constructs a validated instance of {@link SetDefaultPriorityOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetDefaultPriorityOperationSpec(Consumer<SetDefaultPriorityOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SetDefaultPriorityOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param setDefaultPriorityRequest 
     */
    @ApiStatus.Internal
    public SetDefaultPriorityOperationSpec(SetDefaultPriorityRequest setDefaultPriorityRequest) {
        this.setDefaultPriorityRequest = setDefaultPriorityRequest;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(setDefaultPriorityRequest, "setDefaultPriorityRequest is a required parameter!");
    }
}
