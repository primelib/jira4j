package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.BulkPermissionsRequestBean;
import io.github.primelib.jira4j.restv3.model.Permissions;
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
 * GetBulkPermissionsSpec
 * <p>
 * Specification for the GetBulkPermissions operation.
 * <p>
 * Get bulk permissions
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link GetBulkPermissionsOperationSpec}.
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
     * Constructs a validated instance of {@link GetBulkPermissionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param bulkPermissionsRequestBean Details of the permissions to check.
     */
    @ApiStatus.Internal
    public GetBulkPermissionsOperationSpec(BulkPermissionsRequestBean bulkPermissionsRequestBean) {
        this.bulkPermissionsRequestBean = bulkPermissionsRequestBean;

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
