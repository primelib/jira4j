package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Screen;
import io.github.primelib.jira4j.restv3.model.ScreenableTab;
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
 * RenameScreenTabSpec
 * <p>
 * Specification for the RenameScreenTab operation.
 * <p>
 * Update screen tab
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link RenameScreenTabOperationSpec}.
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
     * Constructs a validated instance of {@link RenameScreenTabOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param screenId             The ID of the screen.
     * @param tabId                The ID of the screen tab.
     * @param screenableTab        
     */
    @ApiStatus.Internal
    public RenameScreenTabOperationSpec(Long screenId, Long tabId, ScreenableTab screenableTab) {
        this.screenId = screenId;
        this.tabId = tabId;
        this.screenableTab = screenableTab;

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
