package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Dashboard;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetAllDashboardsSpec
 * <p>
 * Specification for the GetAllDashboards operation.
 * <p>
 * Get all dashboards
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAllDashboardsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The filter applied to the list of dashboards. Valid values are:
     *  *
     * `favourite` Returns dashboards the user has marked as favorite.
     * *
     * `my` Returns dashboards owned by the user.
     */
    @Nullable 
    private String filter;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Integer startAt = 0;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults = 20;

    /**
     * Constructs a validated implementation of {@link GetAllDashboardsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAllDashboardsOperationSpec(Consumer<GetAllDashboardsOperationSpec> spec) {
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
    }

}
