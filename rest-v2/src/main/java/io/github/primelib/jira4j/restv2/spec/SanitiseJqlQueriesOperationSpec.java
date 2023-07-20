package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.JqlQueriesToSanitize;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * SanitiseJqlQueriesSpec
 * <p>
 * Specification for the SanitiseJqlQueries operation.
 * <p>
 * Sanitize JQL queries
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SanitiseJqlQueriesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private JqlQueriesToSanitize jqlQueriesToSanitize;

    /**
     * Constructs a validated implementation of {@link SanitiseJqlQueriesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SanitiseJqlQueriesOperationSpec(Consumer<SanitiseJqlQueriesOperationSpec> spec) {
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
        Objects.requireNonNull(jqlQueriesToSanitize, "jqlQueriesToSanitize is a required parameter!");
    }

}
