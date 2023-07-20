package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.JqlQueriesToParse;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * ParseJqlQueriesSpec
 * <p>
 * Specification for the ParseJqlQueries operation.
 * <p>
 * Parse JQL query
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ParseJqlQueriesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private JqlQueriesToParse jqlQueriesToParse;

    /**
     * How to validate the JQL query and treat the validation results. Validation options include:
     *  *
     * `strict` Returns all errors. If validation fails, the query structure is not returned.
     * *
     * `warn` Returns all errors. If validation fails but the JQL query is correctly formed, the query structure is returned.
     * *
     * `none` No validation is performed. If JQL query is correctly formed, the query structure is returned.
     */
    @Nullable 
    private String validation = "strict";

    /**
     * Constructs a validated implementation of {@link ParseJqlQueriesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ParseJqlQueriesOperationSpec(Consumer<ParseJqlQueriesOperationSpec> spec) {
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
        Objects.requireNonNull(jqlQueriesToParse, "jqlQueriesToParse is a required parameter!");
    }

}
