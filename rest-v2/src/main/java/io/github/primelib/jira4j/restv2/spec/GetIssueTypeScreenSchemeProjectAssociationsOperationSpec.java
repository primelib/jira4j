package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.IssueTypeScreenSchemeProjectAssociation;
import io.github.primelib.jira4j.restv2.model.Project;
import io.github.primelib.jira4j.restv2.model.Screen;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetIssueTypeScreenSchemeProjectAssociationsSpec
 * <p>
 * Specification for the GetIssueTypeScreenSchemeProjectAssociations operation.
 * <p>
 * Get issue type screen schemes for projects
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetIssueTypeScreenSchemeProjectAssociationsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The list of project IDs. To include multiple projects, separate IDs with ampersand: `projectId=10000&amp;projectId=10001`.
     */
    @NotNull 
    private Set<Long> projectId;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Long startAt = 0L;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults = 50;

    /**
     * Constructs a validated implementation of {@link GetIssueTypeScreenSchemeProjectAssociationsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetIssueTypeScreenSchemeProjectAssociationsOperationSpec(Consumer<GetIssueTypeScreenSchemeProjectAssociationsOperationSpec> spec) {
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
        Objects.requireNonNull(projectId, "projectId is a required parameter!");
    }

}
