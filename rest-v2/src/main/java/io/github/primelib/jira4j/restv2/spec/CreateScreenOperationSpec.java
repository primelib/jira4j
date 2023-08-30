package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Screen;
import io.github.primelib.jira4j.restv2.model.ScreenDetails;
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
 * CreateScreenSpec
 * <p>
 * Specification for the CreateScreen operation.
 * <p>
 * Create screen
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateScreenOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private ScreenDetails screenDetails;

    /**
     * Constructs a validated instance of {@link CreateScreenOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateScreenOperationSpec(Consumer<CreateScreenOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateScreenOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param screenDetails        
     */
    @ApiStatus.Internal
    public CreateScreenOperationSpec(ScreenDetails screenDetails) {
        this.screenDetails = screenDetails;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(screenDetails, "screenDetails is a required parameter!");
    }
}
