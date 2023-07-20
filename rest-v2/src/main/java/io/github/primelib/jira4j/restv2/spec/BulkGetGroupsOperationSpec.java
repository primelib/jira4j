package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Group;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * BulkGetGroupsSpec
 * <p>
 * Specification for the BulkGetGroups operation.
 * <p>
 * Bulk get groups
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkGetGroupsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

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
     * The ID of a group. To specify multiple IDs, pass multiple `groupId` parameters. For example, `groupId=5b10a2844c20165700ede21g&amp;groupId=5b10ac8d82e05b22cc7d4ef5`.
     */
    @Nullable 
    private Set<String> groupId;

    /**
     * The name of a group. To specify multiple names, pass multiple `groupName` parameters. For example, `groupName=administrators&amp;groupName=jira-software-users`.
     */
    @Nullable 
    private Set<String> groupName;

    /**
     * The access level of a group. Valid values: 'site-admin', 'admin', 'user'.
     */
    @Nullable 
    private String accessType;

    /**
     * The application key of the product user groups to search for. Valid values: 'jira-servicedesk', 'jira-software', 'jira-product-discovery', 'jira-core'.
     */
    @Nullable 
    private String applicationKey;

    /**
     * Constructs a validated implementation of {@link BulkGetGroupsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BulkGetGroupsOperationSpec(Consumer<BulkGetGroupsOperationSpec> spec) {
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
