package io.github.primelib.jira4j.restv2.spec;

import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Group;
import io.github.primelib.jira4j.restv2.model.User;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * AddUserToGroupSpec
 * <p>
 * Specification for the AddUserToGroup operation.
 * <p>
 * Add user to group
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddUserToGroupOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The user to add to the group.
     */
    @NotNull 
    private Map<String, Object> requestBody;

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
     * Constructs a validated implementation of {@link AddUserToGroupOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddUserToGroupOperationSpec(Consumer<AddUserToGroupOperationSpec> spec) {
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
        Objects.requireNonNull(requestBody, "requestBody is a required parameter!");
    }

}
