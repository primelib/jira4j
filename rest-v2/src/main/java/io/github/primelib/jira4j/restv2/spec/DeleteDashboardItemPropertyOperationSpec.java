package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Dashboard;
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
 * DeleteDashboardItemPropertySpec
 * <p>
 * Specification for the DeleteDashboardItemProperty operation.
 * <p>
 * Delete dashboard item property
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteDashboardItemPropertyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the dashboard.
     */
    @NotNull 
    private String dashboardId;

    /**
     * The ID of the dashboard item.
     */
    @NotNull 
    private String itemId;

    /**
     * The key of the dashboard item property.
     */
    @NotNull 
    private String propertyKey;

    /**
     * Constructs a validated instance of {@link DeleteDashboardItemPropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteDashboardItemPropertyOperationSpec(Consumer<DeleteDashboardItemPropertyOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteDashboardItemPropertyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param dashboardId          The ID of the dashboard.
     * @param itemId               The ID of the dashboard item.
     * @param propertyKey          The key of the dashboard item property.
     */
    @ApiStatus.Internal
    public DeleteDashboardItemPropertyOperationSpec(String dashboardId, String itemId, String propertyKey) {
        this.dashboardId = dashboardId;
        this.itemId = itemId;
        this.propertyKey = propertyKey;

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
        Objects.requireNonNull(itemId, "itemId is a required parameter!");
        Objects.requireNonNull(propertyKey, "propertyKey is a required parameter!");
    }
}
