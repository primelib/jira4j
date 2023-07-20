package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.SecurityLevel;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetSecurityLevelMembersSpec
 * <p>
 * Specification for the GetSecurityLevelMembers operation.
 * <p>
 * Get issue security level members
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetSecurityLevelMembersOperationSpec {
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
     * The list of issue security level member IDs. To include multiple issue security level members separate IDs with an ampersand: `id=10000&amp;id=10001`.
     */
    @Nullable 
    private Set<String> id;

    /**
     * The list of issue security scheme IDs. To include multiple issue security schemes separate IDs with an ampersand: `schemeId=10000&amp;schemeId=10001`.
     */
    @Nullable 
    private Set<String> schemeId;

    /**
     * The list of issue security level IDs. To include multiple issue security levels separate IDs with an ampersand: `levelId=10000&amp;levelId=10001`.
     */
    @Nullable 
    private Set<String> levelId;

    /**
     * Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * `all` Returns all expandable information
     * *
     * `field` Returns information about the custom field granted the permission
     * *
     * `group` Returns information about the group that is granted the permission
     * *
     * `projectRole` Returns information about the project role granted the permission
     * *
     * `user` Returns information about the user who is granted the permission
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link GetSecurityLevelMembersOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetSecurityLevelMembersOperationSpec(Consumer<GetSecurityLevelMembersOperationSpec> spec) {
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
