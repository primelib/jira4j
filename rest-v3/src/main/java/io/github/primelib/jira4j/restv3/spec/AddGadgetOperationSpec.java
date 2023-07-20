package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Dashboard;
import io.github.primelib.jira4j.restv3.model.DashboardGadget;
import io.github.primelib.jira4j.restv3.model.DashboardGadgetSettings;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * AddGadgetSpec
 * <p>
 * Specification for the AddGadget operation.
 * <p>
 * Add gadget to dashboard
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddGadgetOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the dashboard.
     */
    @NotNull 
    private Long dashboardId;

    /**
     */
    @NotNull 
    private DashboardGadgetSettings dashboardGadgetSettings;

    /**
     * Constructs a validated implementation of {@link AddGadgetOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddGadgetOperationSpec(Consumer<AddGadgetOperationSpec> spec) {
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
        Objects.requireNonNull(dashboardId, "dashboardId is a required parameter!");
        Objects.requireNonNull(dashboardGadgetSettings, "dashboardGadgetSettings is a required parameter!");
    }

}
