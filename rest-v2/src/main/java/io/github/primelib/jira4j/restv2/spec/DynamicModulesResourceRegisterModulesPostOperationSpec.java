package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.ConnectModules;
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
 * DynamicModulesResourceRegisterModulesPostSpec
 * <p>
 * Specification for the DynamicModulesResourceRegisterModulesPost operation.
 * <p>
 * Register modules
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DynamicModulesResourceRegisterModulesPostOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private ConnectModules connectModules;

    /**
     * Constructs a validated instance of {@link DynamicModulesResourceRegisterModulesPostOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DynamicModulesResourceRegisterModulesPostOperationSpec(Consumer<DynamicModulesResourceRegisterModulesPostOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DynamicModulesResourceRegisterModulesPostOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param connectModules       
     */
    @ApiStatus.Internal
    public DynamicModulesResourceRegisterModulesPostOperationSpec(ConnectModules connectModules) {
        this.connectModules = connectModules;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(connectModules, "connectModules is a required parameter!");
    }
}
