package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Dashboard;
import java.util.Set;
import java.net.URI;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * SetDashboardItemPropertySpec
 * <p>
 * Specification for the SetDashboardItemProperty operation.
 * <p>
 * Set dashboard item property
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetDashboardItemPropertyOperationSpec {
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
     * The key of the dashboard item property. The maximum length is 255 characters. For dashboard items with a spec URI and no complete module key, if the provided propertyKey is equal to "config", the request body's JSON must be an object with all keys and values as strings.
     */
    @NotNull 
    private String propertyKey;

    /**
     */
    @NotNull 
    private Object body;

    /**
     * Constructs a validated implementation of {@link SetDashboardItemPropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetDashboardItemPropertyOperationSpec(Consumer<SetDashboardItemPropertyOperationSpec> spec) {
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
        Objects.requireNonNull(body, "body is a required parameter!");
    }

}
