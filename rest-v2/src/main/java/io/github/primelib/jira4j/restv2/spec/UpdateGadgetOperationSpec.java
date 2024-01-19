package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Dashboard;
import io.github.primelib.jira4j.restv2.model.DashboardGadget;
import io.github.primelib.jira4j.restv2.model.DashboardGadgetUpdateRequest;
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
 * UpdateGadgetSpec
 * <p>
 * Specification for the UpdateGadget operation.
 * <p>
 * Update gadget on dashboard
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateGadgetOperationSpec {
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
     * The ID of the gadget.
     */
    @NotNull 
    private Long gadgetId;

    /**
     */
    @NotNull 
    private DashboardGadgetUpdateRequest dashboardGadgetUpdateRequest;

    /**
     * Constructs a validated instance of {@link UpdateGadgetOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateGadgetOperationSpec(Consumer<UpdateGadgetOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateGadgetOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param dashboardId          The ID of the dashboard.
     * @param gadgetId             The ID of the gadget.
     * @param dashboardGadgetUpdateRequest 
     */
    @ApiStatus.Internal
    public UpdateGadgetOperationSpec(Long dashboardId, Long gadgetId, DashboardGadgetUpdateRequest dashboardGadgetUpdateRequest) {
        this.dashboardId = dashboardId;
        this.gadgetId = gadgetId;
        this.dashboardGadgetUpdateRequest = dashboardGadgetUpdateRequest;

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
        Objects.requireNonNull(gadgetId, "gadgetId is a required parameter!");
        Objects.requireNonNull(dashboardGadgetUpdateRequest, "dashboardGadgetUpdateRequest is a required parameter!");
    }
}
