package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.SecurityScheme;
import io.github.primelib.jira4j.restv2.model.SecuritySchemes;
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
 * SearchSecuritySchemesSpec
 * <p>
 * Specification for the SearchSecuritySchemes operation.
 * <p>
 * Search issue security schemes
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    private String startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private String maxResults;

    /**
     * The list of issue security scheme IDs. To include multiple issue security scheme IDs, separate IDs with an ampersand: {@code id=10000&amp;id=10001}.
     */
    @Nullable 
    private Set<String> id;

    /**
     * The list of project IDs. To include multiple project IDs, separate IDs with an ampersand: {@code projectId=10000&amp;projectId=10001}.
     */
    @Nullable 
    private Set<String> projectId;

    /**
     * Constructs a validated instance of {@link SearchSecuritySchemesOperationSpec}.
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
     * Constructs a validated instance of {@link SearchSecuritySchemesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param id                   The list of issue security scheme IDs. To include multiple issue security scheme IDs, separate IDs with an ampersand: {@code id=10000&amp;id=10001}.
     * @param projectId            The list of project IDs. To include multiple project IDs, separate IDs with an ampersand: {@code projectId=10000&amp;projectId=10001}.
     */
    @ApiStatus.Internal
    public SearchSecuritySchemesOperationSpec(String startAt, String maxResults, Set<String> id, Set<String> projectId) {
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.id = id;
        this.projectId = projectId;

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
