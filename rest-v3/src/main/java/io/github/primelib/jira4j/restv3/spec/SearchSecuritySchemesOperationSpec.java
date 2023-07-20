package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.SecurityScheme;
import io.github.primelib.jira4j.restv3.model.SecuritySchemes;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * SearchSecuritySchemesSpec
 * <p>
 * Specification for the SearchSecuritySchemes operation.
 * <p>
 * Search issue security schemes
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchSecuritySchemesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private String startAt = "0";

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private String maxResults = "50";

    /**
     * The list of issue security scheme IDs. To include multiple issue security scheme IDs, separate IDs with an ampersand: `id=10000&amp;id=10001`.
     */
    @Nullable 
    private Set<String> id;

    /**
     * The list of project IDs. To include multiple project IDs, separate IDs with an ampersand: `projectId=10000&amp;projectId=10001`.
     */
    @Nullable 
    private Set<String> projectId;

    /**
     * Constructs a validated implementation of {@link SearchSecuritySchemesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SearchSecuritySchemesOperationSpec(Consumer<SearchSecuritySchemesOperationSpec> spec) {
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
    }

}
