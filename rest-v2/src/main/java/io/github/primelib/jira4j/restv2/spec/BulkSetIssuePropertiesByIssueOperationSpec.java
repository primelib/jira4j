package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.IssueEntityProperties;
import io.github.primelib.jira4j.restv2.model.MultiIssueEntityProperties;
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
 * BulkSetIssuePropertiesByIssueSpec
 * <p>
 * Specification for the BulkSetIssuePropertiesByIssue operation.
 * <p>
 * Bulk set issue properties by issue
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkSetIssuePropertiesByIssueOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Details of the issue properties to be set or updated. Note that if an issue is not found, it is ignored.
     */
    @NotNull 
    private MultiIssueEntityProperties multiIssueEntityProperties;

    /**
     * Constructs a validated instance of {@link BulkSetIssuePropertiesByIssueOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BulkSetIssuePropertiesByIssueOperationSpec(Consumer<BulkSetIssuePropertiesByIssueOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link BulkSetIssuePropertiesByIssueOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param multiIssueEntityProperties Details of the issue properties to be set or updated. Note that if an issue is not found, it is ignored.
     */
    @ApiStatus.Internal
    public BulkSetIssuePropertiesByIssueOperationSpec(MultiIssueEntityProperties multiIssueEntityProperties) {
        this.multiIssueEntityProperties = multiIssueEntityProperties;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(multiIssueEntityProperties, "multiIssueEntityProperties is a required parameter!");
    }
}
