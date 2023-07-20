package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.AuditRecords;
import java.time.OffsetDateTime;
import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
    private Integer offset = 0;

    /**
     * The maximum number of results to return.
     */
    @Nullable 
    private Integer limit = 1000;

    /**
     * The strings to match with audit field content, space separated.
     */
    @Nullable 
    private String filter;

    /**
     * The date and time on or after which returned audit records must have been created. If `to` is provided `from` must be before `to` or no audit records are returned.
     */
    @Nullable 
    private OffsetDateTime from;

    /**
     * The date and time on or before which returned audit results must have been created. If `from` is provided `to` must be after `from` or no audit records are returned.
     */
    @Nullable 
    private OffsetDateTime to;

    /**
     * Constructs a validated implementation of {@link GetAuditRecordsOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }

}
