package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Group;
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
 * RemoveGroupSpec
 * <p>
 * Specification for the RemoveGroup operation.
 * <p>
 * Remove group
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoveGroupOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @Nullable 
    private String groupname;

    /**
     * The ID of the group. This parameter cannot be used with the {@code groupname} parameter.
     */
    @Nullable 
    private String groupId;

    /**
     * As a group's name can change, use of {@code swapGroupId} is recommended to identify a group.
     *  The group to transfer restrictions to. Only comments and worklogs are transferred. If restrictions are not transferred, comments and worklogs are inaccessible after the deletion. This parameter cannot be used with the {@code swapGroupId} parameter.
     */
    @Nullable 
    private String swapGroup;

    /**
     * The ID of the group to transfer restrictions to. Only comments and worklogs are transferred. If restrictions are not transferred, comments and worklogs are inaccessible after the deletion. This parameter cannot be used with the {@code swapGroup} parameter.
     */
    @Nullable 
    private String swapGroupId;

    /**
     * Constructs a validated instance of {@link RemoveGroupOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoveGroupOperationSpec(Consumer<RemoveGroupOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link RemoveGroupOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param groupname            
     * @param groupId              The ID of the group. This parameter cannot be used with the {@code groupname} parameter.
     * @param swapGroup            As a group's name can change, use of {@code swapGroupId} is recommended to identify a group.   The group to transfer restrictions to. Only comments and worklogs are transferred. If restrictions are not transferred, comments and worklogs are inaccessible after the deletion. This parameter cannot be used with the {@code swapGroupId} parameter.
     * @param swapGroupId          The ID of the group to transfer restrictions to. Only comments and worklogs are transferred. If restrictions are not transferred, comments and worklogs are inaccessible after the deletion. This parameter cannot be used with the {@code swapGroup} parameter.
     */
    @ApiStatus.Internal
    public RemoveGroupOperationSpec(String groupname, String groupId, String swapGroup, String swapGroupId) {
        this.groupname = groupname;
        this.groupId = groupId;
        this.swapGroup = swapGroup;
        this.swapGroupId = swapGroupId;

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
