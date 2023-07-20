package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Dashboard;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetDashboardItemPropertySpec
 * <p>
 * Specification for the GetDashboardItemProperty operation.
 * <p>
 * Get dashboard item property
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetDashboardItemPropertyOperationSpec {
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
     * Constructs a validated implementation of {@link GetDashboardItemPropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetDashboardItemPropertyOperationSpec(Consumer<GetDashboardItemPropertyOperationSpec> spec) {
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
        Objects.requireNonNull(itemId, "itemId is a required parameter!");
        Objects.requireNonNull(propertyKey, "propertyKey is a required parameter!");
    }

}
