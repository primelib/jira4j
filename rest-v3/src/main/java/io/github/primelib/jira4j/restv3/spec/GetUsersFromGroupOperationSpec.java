package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Group;
import io.github.primelib.jira4j.restv3.model.User;
import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetUsersFromGroupOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * As a group's name can change, use of `groupId` is recommended to identify a group.
     *  The name of the group. This parameter cannot be used with the `groupId` parameter.
     */
    @Nullable 
    private String groupname;

    /**
     * The ID of the group. This parameter cannot be used with the `groupName` parameter.
     */
    @Nullable 
    private String groupId;

    /**
     * Include inactive users.
     */
    @Nullable 
    private Boolean includeInactiveUsers = false;

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
     * Constructs a validated implementation of {@link GetUsersFromGroupOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }

}
