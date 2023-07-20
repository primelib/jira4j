package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Group;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetGroupSpec
 * <p>
 * Specification for the GetGroup operation.
 * <p>
 * Get group
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetGroupOperationSpec {
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
     * List of fields to expand.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link GetGroupOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetGroupOperationSpec(Consumer<GetGroupOperationSpec> spec) {
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
