package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.CreatePriorityDetails;
import io.github.primelib.jira4j.restv2.model.Priority;
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
 * CreatePrioritySpec
 * <p>
 * Specification for the CreatePriority operation.
 * <p>
 * Create priority
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreatePriorityOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private CreatePriorityDetails createPriorityDetails;

    /**
     * Constructs a validated instance of {@link CreatePriorityOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreatePriorityOperationSpec(Consumer<CreatePriorityOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreatePriorityOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param createPriorityDetails 
     */
    @ApiStatus.Internal
    public CreatePriorityOperationSpec(CreatePriorityDetails createPriorityDetails) {
        this.createPriorityDetails = createPriorityDetails;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(createPriorityDetails, "createPriorityDetails is a required parameter!");
    }
}
