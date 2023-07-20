package io.github.primelib.jira4j.restv3.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetCreateIssueMetaSpec
 * <p>
 * Specification for the GetCreateIssueMeta operation.
 * <p>
 * Get create issue metadata
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetCreateIssueMetaOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * List of project IDs. This parameter accepts a comma-separated list. Multiple project IDs can also be provided using an ampersand-separated list. For example, `projectIds=10000,10001&amp;projectIds=10020,10021`. This parameter may be provided with `projectKeys`.
     */
    @Nullable 
    private List<String> projectIds;

    /**
     * List of project keys. This parameter accepts a comma-separated list. Multiple project keys can also be provided using an ampersand-separated list. For example, `projectKeys=proj1,proj2&amp;projectKeys=proj3`. This parameter may be provided with `projectIds`.
     */
    @Nullable 
    private List<String> projectKeys;

    /**
     * List of issue type IDs. This parameter accepts a comma-separated list. Multiple issue type IDs can also be provided using an ampersand-separated list. For example, `issuetypeIds=10000,10001&amp;issuetypeIds=10020,10021`. This parameter may be provided with `issuetypeNames`.
     */
    @Nullable 
    private List<String> issuetypeIds;

    /**
     * List of issue type names. This parameter accepts a comma-separated list. Multiple issue type names can also be provided using an ampersand-separated list. For example, `issuetypeNames=name1,name2&amp;issuetypeNames=name3`. This parameter may be provided with `issuetypeIds`.
     */
    @Nullable 
    private List<String> issuetypeNames;

    /**
     * Use [expand](#expansion) to include additional information about issue metadata in the response. This parameter accepts `projects.issuetypes.fields`, which returns information about the fields in the issue creation screen for each issue type. Fields hidden from the screen are not returned. Use the information to populate the `fields` and `update` fields in [Create issue](#api-rest-api-3-issue-post) and [Create issues](#api-rest-api-3-issue-bulk-post).
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link GetCreateIssueMetaOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetCreateIssueMetaOperationSpec(Consumer<GetCreateIssueMetaOperationSpec> spec) {
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
