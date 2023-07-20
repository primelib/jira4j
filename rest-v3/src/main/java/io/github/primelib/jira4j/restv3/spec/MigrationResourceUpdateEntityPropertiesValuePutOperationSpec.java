package io.github.primelib.jira4j.restv3.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.EntityProperty;
import io.github.primelib.jira4j.restv3.model.EntityPropertyDetails;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * MigrationResourceUpdateEntityPropertiesValuePutSpec
 * <p>
 * Specification for the MigrationResourceUpdateEntityPropertiesValuePut operation.
 * <p>
 * Bulk update entity properties
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MigrationResourceUpdateEntityPropertiesValuePutOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The app migration transfer ID.
     */
    @NotNull 
    private UUID atlassianTransferId;

    /**
     * The type indicating the object that contains the entity properties.
     */
    @NotNull 
    private String entityType;

    /**
     */
    @NotNull 
    private List<EntityPropertyDetails> entityPropertyDetails;

    /**
     * Constructs a validated implementation of {@link MigrationResourceUpdateEntityPropertiesValuePutOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MigrationResourceUpdateEntityPropertiesValuePutOperationSpec(Consumer<MigrationResourceUpdateEntityPropertiesValuePutOperationSpec> spec) {
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
        Objects.requireNonNull(atlassianTransferId, "atlassianTransferId is a required parameter!");
        Objects.requireNonNull(entityType, "entityType is a required parameter!");
        Objects.requireNonNull(entityPropertyDetails, "entityPropertyDetails is a required parameter!");
    }

}
