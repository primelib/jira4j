package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.CreateUiModificationDetails;
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
 * CreateUiModificationSpec
 * <p>
 * Specification for the CreateUiModification operation.
 * <p>
 * Create UI modification
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateUiModificationOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Details of the UI modification.
     */
    @NotNull 
    private CreateUiModificationDetails createUiModificationDetails;

    /**
     * Constructs a validated instance of {@link CreateUiModificationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateUiModificationOperationSpec(Consumer<CreateUiModificationOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateUiModificationOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param createUiModificationDetails Details of the UI modification.
     */
    @ApiStatus.Internal
    public CreateUiModificationOperationSpec(CreateUiModificationDetails createUiModificationDetails) {
        this.createUiModificationDetails = createUiModificationDetails;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(createUiModificationDetails, "createUiModificationDetails is a required parameter!");
    }
}
