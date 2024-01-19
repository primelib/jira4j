package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Filter;
import io.github.primelib.jira4j.restv3.model.SearchAutoCompleteFilter;
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
 * GetAutoCompletePostSpec
 * <p>
 * Specification for the GetAutoCompletePost operation.
 * <p>
 * Get field reference data (POST)
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAutoCompletePostOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private SearchAutoCompleteFilter searchAutoCompleteFilter;

    /**
     * Constructs a validated instance of {@link GetAutoCompletePostOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAutoCompletePostOperationSpec(Consumer<GetAutoCompletePostOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetAutoCompletePostOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param searchAutoCompleteFilter 
     */
    @ApiStatus.Internal
    public GetAutoCompletePostOperationSpec(SearchAutoCompleteFilter searchAutoCompleteFilter) {
        this.searchAutoCompleteFilter = searchAutoCompleteFilter;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(searchAutoCompleteFilter, "searchAutoCompleteFilter is a required parameter!");
    }
}
