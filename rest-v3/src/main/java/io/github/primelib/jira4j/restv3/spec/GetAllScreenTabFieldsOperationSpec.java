package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Screen;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetAllScreenTabFieldsSpec
 * <p>
 * Specification for the GetAllScreenTabFields operation.
 * <p>
 * Get all screen tab fields
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAllScreenTabFieldsOperationSpec {
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
     * The key of the project.
     */
    @Nullable 
    private String projectKey;

    /**
     * Constructs a validated implementation of {@link GetAllScreenTabFieldsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAllScreenTabFieldsOperationSpec(Consumer<GetAllScreenTabFieldsOperationSpec> spec) {
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
    }

}
