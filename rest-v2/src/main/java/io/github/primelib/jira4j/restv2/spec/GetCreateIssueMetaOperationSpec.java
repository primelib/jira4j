package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

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
 * GetCreateIssueMetaSpec
 * <p>
 * Specification for the GetCreateIssueMeta operation.
 * <p>
 * Get create issue metadata
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetCreateIssueMetaOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * List of project IDs. This parameter accepts a comma-separated list. Multiple project IDs can also be provided using an ampersand-separated list. For example, {@code projectIds=10000,10001&amp;projectIds=10020,10021}. This parameter may be provided with {@code projectKeys}.
     */
    @Nullable 
    private List<String> projectIds;

    /**
     * List of project keys. This parameter accepts a comma-separated list. Multiple project keys can also be provided using an ampersand-separated list. For example, {@code projectKeys=proj1,proj2&amp;projectKeys=proj3}. This parameter may be provided with {@code projectIds}.
     */
    @Nullable 
    private List<String> projectKeys;

    /**
     * List of issue type IDs. This parameter accepts a comma-separated list. Multiple issue type IDs can also be provided using an ampersand-separated list. For example, {@code issuetypeIds=10000,10001&amp;issuetypeIds=10020,10021}. This parameter may be provided with {@code issuetypeNames}.
     */
    @Nullable 
    private List<String> issuetypeIds;

    /**
     * List of issue type names. This parameter accepts a comma-separated list. Multiple issue type names can also be provided using an ampersand-separated list. For example, {@code issuetypeNames=name1,name2&amp;issuetypeNames=name3}. This parameter may be provided with {@code issuetypeIds}.
     */
    @Nullable 
    private List<String> issuetypeNames;

    /**
     * Use [expand](#expansion) to include additional information about issue metadata in the response. This parameter accepts {@code projects.issuetypes.fields}, which returns information about the fields in the issue creation screen for each issue type. Fields hidden from the screen are not returned. Use the information to populate the {@code fields} and {@code update} fields in [Create issue](#api-rest-api-2-issue-post) and [Create issues](#api-rest-api-2-issue-bulk-post).
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link GetCreateIssueMetaOperationSpec}.
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
     * Constructs a validated instance of {@link GetCreateIssueMetaOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param projectIds           List of project IDs. This parameter accepts a comma-separated list. Multiple project IDs can also be provided using an ampersand-separated list. For example, {@code projectIds=10000,10001&amp;projectIds=10020,10021}. This parameter may be provided with {@code projectKeys}.
     * @param projectKeys          List of project keys. This parameter accepts a comma-separated list. Multiple project keys can also be provided using an ampersand-separated list. For example, {@code projectKeys=proj1,proj2&amp;projectKeys=proj3}. This parameter may be provided with {@code projectIds}.
     * @param issuetypeIds         List of issue type IDs. This parameter accepts a comma-separated list. Multiple issue type IDs can also be provided using an ampersand-separated list. For example, {@code issuetypeIds=10000,10001&amp;issuetypeIds=10020,10021}. This parameter may be provided with {@code issuetypeNames}.
     * @param issuetypeNames       List of issue type names. This parameter accepts a comma-separated list. Multiple issue type names can also be provided using an ampersand-separated list. For example, {@code issuetypeNames=name1,name2&amp;issuetypeNames=name3}. This parameter may be provided with {@code issuetypeIds}.
     * @param expand               Use [expand](#expansion) to include additional information about issue metadata in the response. This parameter accepts {@code projects.issuetypes.fields}, which returns information about the fields in the issue creation screen for each issue type. Fields hidden from the screen are not returned. Use the information to populate the {@code fields} and {@code update} fields in [Create issue](#api-rest-api-2-issue-post) and [Create issues](#api-rest-api-2-issue-bulk-post).
     */
    @ApiStatus.Internal
    public GetCreateIssueMetaOperationSpec(List<String> projectIds, List<String> projectKeys, List<String> issuetypeIds, List<String> issuetypeNames, String expand) {
        this.projectIds = projectIds;
        this.projectKeys = projectKeys;
        this.issuetypeIds = issuetypeIds;
        this.issuetypeNames = issuetypeNames;
        this.expand = expand;

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
