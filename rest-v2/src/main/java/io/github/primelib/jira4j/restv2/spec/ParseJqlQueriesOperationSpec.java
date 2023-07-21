package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.JqlQueriesToParse;
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
 * ParseJqlQueriesSpec
 * <p>
 * Specification for the ParseJqlQueries operation.
 * <p>
 * Parse JQL query
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * {@code strict} Returns all errors. If validation fails, the query structure is not returned.
     * *
     * {@code warn} Returns all errors. If validation fails but the JQL query is correctly formed, the query structure is returned.
     * *
     * {@code none} No validation is performed. If JQL query is correctly formed, the query structure is returned.
     */
    @Nullable 
    private String validation;

    /**
     * Constructs a validated instance of {@link ParseJqlQueriesOperationSpec}.
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
     * Constructs a validated instance of {@link ParseJqlQueriesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param jqlQueriesToParse    
     * @param validation           How to validate the JQL query and treat the validation results. Validation options include:   *  {@code strict} Returns all errors. If validation fails, the query structure is not returned.  *  {@code warn} Returns all errors. If validation fails but the JQL query is correctly formed, the query structure is returned.  *  {@code none} No validation is performed. If JQL query is correctly formed, the query structure is returned.
     */
    @ApiStatus.Internal
    public ParseJqlQueriesOperationSpec(JqlQueriesToParse jqlQueriesToParse, String validation) {
        this.jqlQueriesToParse = jqlQueriesToParse;
        this.validation = validation;

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
