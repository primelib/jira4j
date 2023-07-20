package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.ApplicationProperty;
import java.util.Set;
import io.github.primelib.jira4j.restv2.model.SimpleApplicationPropertyBean;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * SetApplicationPropertySpec
 * <p>
 * Specification for the SetApplicationProperty operation.
 * <p>
 * Set application property
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetApplicationPropertyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the application property to update.
     */
    @NotNull 
    private String id;

    /**
     */
    @NotNull 
    private SimpleApplicationPropertyBean simpleApplicationPropertyBean;

    /**
     * Constructs a validated implementation of {@link SetApplicationPropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetApplicationPropertyOperationSpec(Consumer<SetApplicationPropertyOperationSpec> spec) {
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
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(simpleApplicationPropertyBean, "simpleApplicationPropertyBean is a required parameter!");
    }

}
