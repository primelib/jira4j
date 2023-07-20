package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.BulkPermissionsRequestBean;
import io.github.primelib.jira4j.restv3.model.Permissions;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetBulkPermissionsSpec
 * <p>
 * Specification for the GetBulkPermissions operation.
 * <p>
 * Get bulk permissions
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBulkPermissionsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Details of the permissions to check.
     */
    @NotNull 
    private BulkPermissionsRequestBean bulkPermissionsRequestBean;

    /**
     * Constructs a validated implementation of {@link GetBulkPermissionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetBulkPermissionsOperationSpec(Consumer<GetBulkPermissionsOperationSpec> spec) {
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
        Objects.requireNonNull(bulkPermissionsRequestBean, "bulkPermissionsRequestBean is a required parameter!");
    }

}
