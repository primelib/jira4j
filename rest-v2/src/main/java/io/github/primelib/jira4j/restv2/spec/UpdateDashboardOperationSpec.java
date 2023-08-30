package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Dashboard;
import io.github.primelib.jira4j.restv2.model.DashboardDetails;
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
 * UpdateDashboardSpec
 * <p>
 * Specification for the UpdateDashboard operation.
 * <p>
 * Update dashboard
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateDashboardOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the dashboard to update.
     */
    @NotNull 
    private String id;

    /**
     * Replacement dashboard details.
     */
    @NotNull 
    private DashboardDetails dashboardDetails;

    /**
     * Constructs a validated instance of {@link UpdateDashboardOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateDashboardOperationSpec(Consumer<UpdateDashboardOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateDashboardOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the dashboard to update.
     * @param dashboardDetails     Replacement dashboard details.
     */
    @ApiStatus.Internal
    public UpdateDashboardOperationSpec(String id, DashboardDetails dashboardDetails) {
        this.id = id;
        this.dashboardDetails = dashboardDetails;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(dashboardDetails, "dashboardDetails is a required parameter!");
    }
}
