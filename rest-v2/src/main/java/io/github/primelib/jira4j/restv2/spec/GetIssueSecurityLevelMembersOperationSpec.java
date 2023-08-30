package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.SecurityLevel;
import io.github.primelib.jira4j.restv2.model.SecurityScheme;
import io.github.primelib.jira4j.restv2.model.SecuritySchemeId;
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
 * GetIssueSecurityLevelMembersSpec
 * <p>
 * Specification for the GetIssueSecurityLevelMembers operation.
 * <p>
 * Get issue security level members
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetIssueSecurityLevelMembersOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-2-issuesecurityschemes-get) operation to get a list of issue security scheme IDs.
     */
    @NotNull 
    private Long issueSecuritySchemeId;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Long startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * The list of issue security level IDs. To include multiple issue security levels separate IDs with ampersand: {@code issueSecurityLevelId=10000&amp;issueSecurityLevelId=10001}.
     */
    @Nullable 
    private Set<Long> issueSecurityLevelId;

    /**
     * Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * {@code all} Returns all expandable information.
     * *
     * {@code field} Returns information about the custom field granted the permission.
     * *
     * {@code group} Returns information about the group that is granted the permission.
     * *
     * {@code projectRole} Returns information about the project role granted the permission.
     * *
     * {@code user} Returns information about the user who is granted the permission.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link GetIssueSecurityLevelMembersOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetIssueSecurityLevelMembersOperationSpec(Consumer<GetIssueSecurityLevelMembersOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetIssueSecurityLevelMembersOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueSecuritySchemeId The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-2-issuesecurityschemes-get) operation to get a list of issue security scheme IDs.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param issueSecurityLevelId The list of issue security level IDs. To include multiple issue security levels separate IDs with ampersand: {@code issueSecurityLevelId=10000&amp;issueSecurityLevelId=10001}.
     * @param expand               Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code all} Returns all expandable information.  *  {@code field} Returns information about the custom field granted the permission.  *  {@code group} Returns information about the group that is granted the permission.  *  {@code projectRole} Returns information about the project role granted the permission.  *  {@code user} Returns information about the user who is granted the permission.
     */
    @ApiStatus.Internal
    public GetIssueSecurityLevelMembersOperationSpec(Long issueSecuritySchemeId, Long startAt, Integer maxResults, Set<Long> issueSecurityLevelId, String expand) {
        this.issueSecuritySchemeId = issueSecuritySchemeId;
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.issueSecurityLevelId = issueSecurityLevelId;
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
        Objects.requireNonNull(issueSecuritySchemeId, "issueSecuritySchemeId is a required parameter!");
    }
}
