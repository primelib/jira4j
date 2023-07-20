package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Screen;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * RemoveScreenTabFieldSpec
 * <p>
 * Specification for the RemoveScreenTabField operation.
 * <p>
 * Remove screen tab field
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoveScreenTabFieldOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the screen.
     */
    @NotNull 
    private Long screenId;

    /**
     * The ID of the screen tab.
     */
    @NotNull 
    private Long tabId;

    /**
     * The ID of the field.
     */
    @NotNull 
    private String id;

    /**
     * Constructs a validated implementation of {@link RemoveScreenTabFieldOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoveScreenTabFieldOperationSpec(Consumer<RemoveScreenTabFieldOperationSpec> spec) {
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
        Objects.requireNonNull(screenId, "screenId is a required parameter!");
        Objects.requireNonNull(tabId, "tabId is a required parameter!");
        Objects.requireNonNull(id, "id is a required parameter!");
    }

}
