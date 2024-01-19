package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.BulkEditShareableEntityRequest;
import io.github.primelib.jira4j.restv3.model.Dashboard;
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
 * BulkEditDashboardsSpec
 * <p>
 * Specification for the BulkEditDashboards operation.
 * <p>
 * Bulk edit dashboards
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkEditDashboardsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The details of dashboards being updated in bulk.
     */
    @NotNull 
    private BulkEditShareableEntityRequest bulkEditShareableEntityRequest;

    /**
     * Constructs a validated instance of {@link BulkEditDashboardsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BulkEditDashboardsOperationSpec(Consumer<BulkEditDashboardsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link BulkEditDashboardsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param bulkEditShareableEntityRequest The details of dashboards being updated in bulk.
     */
    @ApiStatus.Internal
    public BulkEditDashboardsOperationSpec(BulkEditShareableEntityRequest bulkEditShareableEntityRequest) {
        this.bulkEditShareableEntityRequest = bulkEditShareableEntityRequest;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(bulkEditShareableEntityRequest, "bulkEditShareableEntityRequest is a required parameter!");
    }
}
