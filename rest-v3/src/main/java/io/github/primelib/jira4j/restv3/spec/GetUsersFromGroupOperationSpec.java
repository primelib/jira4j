package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Group;
import java.util.Set;
import io.github.primelib.jira4j.restv3.model.User;
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
 * GetUsersFromGroupSpec
 * <p>
 * Specification for the GetUsersFromGroup operation.
 * <p>
 * Get users from group
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetUsersFromGroupOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * As a group's name can change, use of {@code groupId} is recommended to identify a group.
     *  The name of the group. This parameter cannot be used with the {@code groupId} parameter.
     */
    @Nullable 
    private String groupname;

    /**
     * The ID of the group. This parameter cannot be used with the {@code groupName} parameter.
     */
    @Nullable 
    private String groupId;

    /**
     * Include inactive users.
     */
    @Nullable 
    private Boolean includeInactiveUsers;

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
     * Constructs a validated instance of {@link GetUsersFromGroupOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetUsersFromGroupOperationSpec(Consumer<GetUsersFromGroupOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetUsersFromGroupOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param groupname            As a group's name can change, use of {@code groupId} is recommended to identify a group.   The name of the group. This parameter cannot be used with the {@code groupId} parameter.
     * @param groupId              The ID of the group. This parameter cannot be used with the {@code groupName} parameter.
     * @param includeInactiveUsers Include inactive users.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     */
    @ApiStatus.Internal
    public GetUsersFromGroupOperationSpec(String groupname, String groupId, Boolean includeInactiveUsers, Long startAt, Integer maxResults) {
        this.groupname = groupname;
        this.groupId = groupId;
        this.includeInactiveUsers = includeInactiveUsers;
        this.startAt = startAt;
        this.maxResults = maxResults;

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
