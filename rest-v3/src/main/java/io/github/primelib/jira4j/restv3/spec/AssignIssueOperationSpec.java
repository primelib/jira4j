package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.User;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * AssignIssueSpec
 * <p>
 * Specification for the AssignIssue operation.
 * <p>
 * Assign issue
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssignIssueOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID or key of the issue to be assigned.
     */
    @NotNull 
    private String issueIdOrKey;

    /**
     * The request object with the user that the issue is assigned to.
     */
    @NotNull 
    private User user;

    /**
     * Constructs a validated implementation of {@link AssignIssueOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AssignIssueOperationSpec(Consumer<AssignIssueOperationSpec> spec) {
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
        Objects.requireNonNull(issueIdOrKey, "issueIdOrKey is a required parameter!");
        Objects.requireNonNull(user, "user is a required parameter!");
    }

}
