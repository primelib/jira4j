package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

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
 * ResetUserColumnsSpec
 * <p>
 * Specification for the ResetUserColumns operation.
 * <p>
 * Reset user default columns
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ResetUserColumnsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
     */
    @Nullable 
    private String accountId;

    /**
     * This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @Nullable 
    private String username;

    /**
     * Constructs a validated instance of {@link ResetUserColumnsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ResetUserColumnsOperationSpec(Consumer<ResetUserColumnsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ResetUserColumnsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param accountId            The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
     * @param username             This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @ApiStatus.Internal
    public ResetUserColumnsOperationSpec(String accountId, String username) {
        this.accountId = accountId;
        this.username = username;

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
