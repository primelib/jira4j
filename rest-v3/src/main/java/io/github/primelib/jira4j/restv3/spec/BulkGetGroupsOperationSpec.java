package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Group;
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
 * BulkGetGroupsSpec
 * <p>
 * Specification for the BulkGetGroups operation.
 * <p>
 * Bulk get groups
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    private Long startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * The ID of a group. To specify multiple IDs, pass multiple {@code groupId} parameters. For example, {@code groupId=5b10a2844c20165700ede21g&amp;groupId=5b10ac8d82e05b22cc7d4ef5}.
     */
    @Nullable 
    private Set<String> groupId;

    /**
     * The name of a group. To specify multiple names, pass multiple {@code groupName} parameters. For example, {@code groupName=administrators&amp;groupName=jira-software-users}.
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
     * Constructs a validated instance of {@link BulkGetGroupsOperationSpec}.
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
     * Constructs a validated instance of {@link BulkGetGroupsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param groupId              The ID of a group. To specify multiple IDs, pass multiple {@code groupId} parameters. For example, {@code groupId=5b10a2844c20165700ede21g&amp;groupId=5b10ac8d82e05b22cc7d4ef5}.
     * @param groupName            The name of a group. To specify multiple names, pass multiple {@code groupName} parameters. For example, {@code groupName=administrators&amp;groupName=jira-software-users}.
     * @param accessType           The access level of a group. Valid values: 'site-admin', 'admin', 'user'.
     * @param applicationKey       The application key of the product user groups to search for. Valid values: 'jira-servicedesk', 'jira-software', 'jira-product-discovery', 'jira-core'.
     */
    @ApiStatus.Internal
    public BulkGetGroupsOperationSpec(Long startAt, Integer maxResults, Set<String> groupId, Set<String> groupName, String accessType, String applicationKey) {
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.groupId = groupId;
        this.groupName = groupName;
        this.accessType = accessType;
        this.applicationKey = applicationKey;

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
