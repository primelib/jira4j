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
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
    private Long startAt = 0L;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults = 50;

    /**
     * The list of issue security level IDs. To include multiple issue security levels separate IDs with ampersand: `issueSecurityLevelId=10000&amp;issueSecurityLevelId=10001`.
     */
    @Nullable 
    private Set<Long> issueSecurityLevelId;

    /**
     * Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * `all` Returns all expandable information.
     * *
     * `field` Returns information about the custom field granted the permission.
     * *
     * `group` Returns information about the group that is granted the permission.
     * *
     * `projectRole` Returns information about the project role granted the permission.
     * *
     * `user` Returns information about the user who is granted the permission.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link GetIssueSecurityLevelMembersOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(issueSecuritySchemeId, "issueSecuritySchemeId is a required parameter!");
    }

}
