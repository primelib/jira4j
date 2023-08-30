package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Priority;
import java.util.Set;
import io.github.primelib.jira4j.restv3.model.UpdatePriorityDetails;
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
 * UpdatePrioritySpec
 * <p>
 * Specification for the UpdatePriority operation.
 * <p>
 * Update priority
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdatePriorityOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the issue priority.
     */
    @NotNull 
    private String id;

    /**
     */
    @NotNull 
    private UpdatePriorityDetails updatePriorityDetails;

    /**
     * Constructs a validated instance of {@link UpdatePriorityOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdatePriorityOperationSpec(Consumer<UpdatePriorityOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdatePriorityOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the issue priority.
     * @param updatePriorityDetails 
     */
    @ApiStatus.Internal
    public UpdatePriorityOperationSpec(String id, UpdatePriorityDetails updatePriorityDetails) {
        this.id = id;
        this.updatePriorityDetails = updatePriorityDetails;

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
        Objects.requireNonNull(updatePriorityDetails, "updatePriorityDetails is a required parameter!");
    }
}
