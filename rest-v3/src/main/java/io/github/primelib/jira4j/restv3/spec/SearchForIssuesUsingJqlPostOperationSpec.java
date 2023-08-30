package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.SearchRequestBean;
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
 * SearchForIssuesUsingJqlPostSpec
 * <p>
 * Specification for the SearchForIssuesUsingJqlPost operation.
 * <p>
 * Search for issues using JQL (POST)
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchForIssuesUsingJqlPostOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * A JSON object containing the search request.
     */
    @NotNull 
    private SearchRequestBean searchRequestBean;

    /**
     * Constructs a validated instance of {@link SearchForIssuesUsingJqlPostOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SearchForIssuesUsingJqlPostOperationSpec(Consumer<SearchForIssuesUsingJqlPostOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SearchForIssuesUsingJqlPostOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param searchRequestBean    A JSON object containing the search request.
     */
    @ApiStatus.Internal
    public SearchForIssuesUsingJqlPostOperationSpec(SearchRequestBean searchRequestBean) {
        this.searchRequestBean = searchRequestBean;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(searchRequestBean, "searchRequestBean is a required parameter!");
    }
}
