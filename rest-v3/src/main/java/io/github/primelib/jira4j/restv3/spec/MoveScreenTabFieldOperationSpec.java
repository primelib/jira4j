package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.MoveFieldBean;
import io.github.primelib.jira4j.restv3.model.Screen;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * MoveScreenTabFieldSpec
 * <p>
 * Specification for the MoveScreenTabField operation.
 * <p>
 * Move screen tab field
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MoveScreenTabFieldOperationSpec {
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
     */
    @NotNull 
    private MoveFieldBean moveFieldBean;

    /**
     * Constructs a validated implementation of {@link MoveScreenTabFieldOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MoveScreenTabFieldOperationSpec(Consumer<MoveScreenTabFieldOperationSpec> spec) {
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
        Objects.requireNonNull(moveFieldBean, "moveFieldBean is a required parameter!");
    }

}
