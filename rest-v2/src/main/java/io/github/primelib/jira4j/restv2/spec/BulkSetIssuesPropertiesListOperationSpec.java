package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.IssueEntityProperties;
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
 * BulkSetIssuesPropertiesListSpec
 * <p>
 * Specification for the BulkSetIssuesPropertiesList operation.
 * <p>
 * Bulk set issues properties by list
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkSetIssuesPropertiesListOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Issue properties to be set or updated with values.
     */
    @NotNull 
    private IssueEntityProperties issueEntityProperties;

    /**
     * Constructs a validated instance of {@link BulkSetIssuesPropertiesListOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BulkSetIssuesPropertiesListOperationSpec(Consumer<BulkSetIssuesPropertiesListOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link BulkSetIssuesPropertiesListOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueEntityProperties Issue properties to be set or updated with values.
     */
    @ApiStatus.Internal
    public BulkSetIssuesPropertiesListOperationSpec(IssueEntityProperties issueEntityProperties) {
        this.issueEntityProperties = issueEntityProperties;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(issueEntityProperties, "issueEntityProperties is a required parameter!");
    }
}
