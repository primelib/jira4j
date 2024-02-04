package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.AuditRecords;
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
 * GetAuditRecordsSpec
 * <p>
 * Specification for the GetAuditRecords operation.
 * <p>
 * Get audit records
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAuditRecordsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The number of records to skip before returning the first result.
     */
    @Nullable 
    private Integer offset;

    /**
     * The maximum number of results to return.
     */
    @Nullable 
    private Integer limit;

    /**
     * The strings to match with audit field content, space separated.
     */
    @Nullable 
    private String filter;

    /**
     * The date and time on or after which returned audit records must have been created. If {@code to} is provided {@code from} must be before {@code to} or no audit records are returned.
     */
    @Nullable 
    private String from;

    /**
     * The date and time on or before which returned audit results must have been created. If {@code from} is provided {@code to} must be after {@code from} or no audit records are returned.
     */
    @Nullable 
    private String to;

    /**
     * Constructs a validated instance of {@link GetAuditRecordsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAuditRecordsOperationSpec(Consumer<GetAuditRecordsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetAuditRecordsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param offset               The number of records to skip before returning the first result.
     * @param limit                The maximum number of results to return.
     * @param filter               The strings to match with audit field content, space separated.
     * @param from                 The date and time on or after which returned audit records must have been created. If {@code to} is provided {@code from} must be before {@code to} or no audit records are returned.
     * @param to                   The date and time on or before which returned audit results must have been created. If {@code from} is provided {@code to} must be after {@code from} or no audit records are returned.
     */
    @ApiStatus.Internal
    public GetAuditRecordsOperationSpec(Integer offset, Integer limit, String filter, String from, String to) {
        this.offset = offset;
        this.limit = limit;
        this.filter = filter;
        this.from = from;
        this.to = to;

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
