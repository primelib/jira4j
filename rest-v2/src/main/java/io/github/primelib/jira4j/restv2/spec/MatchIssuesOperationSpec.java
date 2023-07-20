package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.IssuesAndJQLQueries;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * MatchIssuesSpec
 * <p>
 * Specification for the MatchIssues operation.
 * <p>
 * Check issues against JQL
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MatchIssuesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private IssuesAndJQLQueries issuesAndJQLQueries;

    /**
     * Constructs a validated implementation of {@link MatchIssuesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MatchIssuesOperationSpec(Consumer<MatchIssuesOperationSpec> spec) {
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
        Objects.requireNonNull(issuesAndJQLQueries, "issuesAndJQLQueries is a required parameter!");
    }

}
