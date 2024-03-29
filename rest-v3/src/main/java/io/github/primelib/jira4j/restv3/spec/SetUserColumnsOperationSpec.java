package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.ColumnRequestBody;
import java.util.Set;
import io.github.primelib.jira4j.restv3.model.User;
import io.github.primelib.jira4j.restv3.model.UserColumnRequestBody;
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
 * SetUserColumnsSpec
 * <p>
 * Specification for the SetUserColumns operation.
 * <p>
 * Set user default columns
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetUserColumnsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of a column to set. To set multiple columns, send multiple {@code columns} parameters.
     */
    @NotNull 
    private UserColumnRequestBody userColumnRequestBody;

    /**
     * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
     */
    @Nullable 
    private String accountId;

    /**
     * Constructs a validated instance of {@link SetUserColumnsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetUserColumnsOperationSpec(Consumer<SetUserColumnsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SetUserColumnsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param userColumnRequestBody The ID of a column to set. To set multiple columns, send multiple {@code columns} parameters.
     * @param accountId            The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
     */
    @ApiStatus.Internal
    public SetUserColumnsOperationSpec(UserColumnRequestBody userColumnRequestBody, String accountId) {
        this.userColumnRequestBody = userColumnRequestBody;
        this.accountId = accountId;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(userColumnRequestBody, "userColumnRequestBody is a required parameter!");
    }
}
