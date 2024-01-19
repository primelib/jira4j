package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Dashboard;
import io.github.primelib.jira4j.restv3.model.PropertyKeys;
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
 * GetDashboardItemPropertyKeysSpec
 * <p>
 * Specification for the GetDashboardItemPropertyKeys operation.
 * <p>
 * Get dashboard item property keys
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetDashboardItemPropertyKeysOperationSpec {
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
     * Constructs a validated instance of {@link GetDashboardItemPropertyKeysOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetDashboardItemPropertyKeysOperationSpec(Consumer<GetDashboardItemPropertyKeysOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetDashboardItemPropertyKeysOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param dashboardId          The ID of the dashboard.
     * @param itemId               The ID of the dashboard item.
     */
    @ApiStatus.Internal
    public GetDashboardItemPropertyKeysOperationSpec(String dashboardId, String itemId) {
        this.dashboardId = dashboardId;
        this.itemId = itemId;

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
    }
}
