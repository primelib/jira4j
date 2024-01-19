package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv3.model.TimeTrackingProvider;
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
 * SelectTimeTrackingImplementationSpec
 * <p>
 * Specification for the SelectTimeTrackingImplementation operation.
 * <p>
 * Select time tracking provider
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SelectTimeTrackingImplementationOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private TimeTrackingProvider timeTrackingProvider;

    /**
     * Constructs a validated instance of {@link SelectTimeTrackingImplementationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SelectTimeTrackingImplementationOperationSpec(Consumer<SelectTimeTrackingImplementationOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SelectTimeTrackingImplementationOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param timeTrackingProvider 
     */
    @ApiStatus.Internal
    public SelectTimeTrackingImplementationOperationSpec(TimeTrackingProvider timeTrackingProvider) {
        this.timeTrackingProvider = timeTrackingProvider;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(timeTrackingProvider, "timeTrackingProvider is a required parameter!");
    }
}
