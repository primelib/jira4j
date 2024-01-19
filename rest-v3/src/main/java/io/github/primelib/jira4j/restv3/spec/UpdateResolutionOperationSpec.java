package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Resolution;
import java.util.Set;
import io.github.primelib.jira4j.restv3.model.UpdateResolutionDetails;
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
 * UpdateResolutionSpec
 * <p>
 * Specification for the UpdateResolution operation.
 * <p>
 * Update resolution
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateResolutionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the issue resolution.
     */
    @NotNull 
    private String id;

    /**
     */
    @NotNull 
    private UpdateResolutionDetails updateResolutionDetails;

    /**
     * Constructs a validated instance of {@link UpdateResolutionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateResolutionOperationSpec(Consumer<UpdateResolutionOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateResolutionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the issue resolution.
     * @param updateResolutionDetails 
     */
    @ApiStatus.Internal
    public UpdateResolutionOperationSpec(String id, UpdateResolutionDetails updateResolutionDetails) {
        this.id = id;
        this.updateResolutionDetails = updateResolutionDetails;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(updateResolutionDetails, "updateResolutionDetails is a required parameter!");
    }
}
