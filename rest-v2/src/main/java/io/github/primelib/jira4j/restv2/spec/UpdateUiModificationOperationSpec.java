package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv2.model.UpdateUiModificationDetails;
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
 * UpdateUiModificationSpec
 * <p>
 * Specification for the UpdateUiModification operation.
 * <p>
 * Update UI modification
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateUiModificationOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the UI modification.
     */
    @NotNull 
    private String uiModificationId;

    /**
     * Details of the UI modification.
     */
    @NotNull 
    private UpdateUiModificationDetails updateUiModificationDetails;

    /**
     * Constructs a validated instance of {@link UpdateUiModificationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateUiModificationOperationSpec(Consumer<UpdateUiModificationOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateUiModificationOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param uiModificationId     The ID of the UI modification.
     * @param updateUiModificationDetails Details of the UI modification.
     */
    @ApiStatus.Internal
    public UpdateUiModificationOperationSpec(String uiModificationId, UpdateUiModificationDetails updateUiModificationDetails) {
        this.uiModificationId = uiModificationId;
        this.updateUiModificationDetails = updateUiModificationDetails;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(uiModificationId, "uiModificationId is a required parameter!");
        Objects.requireNonNull(updateUiModificationDetails, "updateUiModificationDetails is a required parameter!");
    }
}
