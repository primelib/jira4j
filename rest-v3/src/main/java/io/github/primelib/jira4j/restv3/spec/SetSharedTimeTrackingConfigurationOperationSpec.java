package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Configuration;
import java.util.Set;
import io.github.primelib.jira4j.restv3.model.TimeTrackingConfiguration;
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
 * SetSharedTimeTrackingConfigurationSpec
 * <p>
 * Specification for the SetSharedTimeTrackingConfiguration operation.
 * <p>
 * Set time tracking settings
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetSharedTimeTrackingConfigurationOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private TimeTrackingConfiguration timeTrackingConfiguration;

    /**
     * Constructs a validated instance of {@link SetSharedTimeTrackingConfigurationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetSharedTimeTrackingConfigurationOperationSpec(Consumer<SetSharedTimeTrackingConfigurationOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SetSharedTimeTrackingConfigurationOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param timeTrackingConfiguration 
     */
    @ApiStatus.Internal
    public SetSharedTimeTrackingConfigurationOperationSpec(TimeTrackingConfiguration timeTrackingConfiguration) {
        this.timeTrackingConfiguration = timeTrackingConfiguration;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(timeTrackingConfiguration, "timeTrackingConfiguration is a required parameter!");
    }
}
