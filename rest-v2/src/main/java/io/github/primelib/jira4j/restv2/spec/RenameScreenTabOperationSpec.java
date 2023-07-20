package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Screen;
import io.github.primelib.jira4j.restv2.model.ScreenableTab;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * RenameScreenTabSpec
 * <p>
 * Specification for the RenameScreenTab operation.
 * <p>
 * Update screen tab
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RenameScreenTabOperationSpec {
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
     */
    @NotNull 
    private ScreenableTab screenableTab;

    /**
     * Constructs a validated implementation of {@link RenameScreenTabOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RenameScreenTabOperationSpec(Consumer<RenameScreenTabOperationSpec> spec) {
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
        Objects.requireNonNull(screenableTab, "screenableTab is a required parameter!");
    }

}
