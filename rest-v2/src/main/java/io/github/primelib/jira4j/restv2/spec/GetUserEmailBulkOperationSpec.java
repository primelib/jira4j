package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv2.model.User;
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
 * GetUserEmailBulkSpec
 * <p>
 * Specification for the GetUserEmailBulk operation.
 * <p>
 * Get user email bulk
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetUserEmailBulkOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The account IDs of the users for which emails are required. An {@code accountId} is an identifier that uniquely identifies the user across all Atlassian products. For example, {@code 5b10ac8d82e05b22cc7d4ef5}. Note, this should be treated as an opaque identifier (that is, do not assume any structure in the value).
     */
    @NotNull 
    private List<String> accountId;

    /**
     * Constructs a validated instance of {@link GetUserEmailBulkOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetUserEmailBulkOperationSpec(Consumer<GetUserEmailBulkOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetUserEmailBulkOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param accountId            The account IDs of the users for which emails are required. An {@code accountId} is an identifier that uniquely identifies the user across all Atlassian products. For example, {@code 5b10ac8d82e05b22cc7d4ef5}. Note, this should be treated as an opaque identifier (that is, do not assume any structure in the value).
     */
    @ApiStatus.Internal
    public GetUserEmailBulkOperationSpec(List<String> accountId) {
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
        Objects.requireNonNull(accountId, "accountId is a required parameter!");
    }
}
