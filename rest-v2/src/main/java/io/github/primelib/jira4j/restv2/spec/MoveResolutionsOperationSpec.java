package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.ReorderIssueResolutionsRequest;
import io.github.primelib.jira4j.restv2.model.Resolution;
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
 * MoveResolutionsSpec
 * <p>
 * Specification for the MoveResolutions operation.
 * <p>
 * Move resolutions
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MoveResolutionsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private ReorderIssueResolutionsRequest reorderIssueResolutionsRequest;

    /**
     * Constructs a validated instance of {@link MoveResolutionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MoveResolutionsOperationSpec(Consumer<MoveResolutionsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link MoveResolutionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param reorderIssueResolutionsRequest 
     */
    @ApiStatus.Internal
    public MoveResolutionsOperationSpec(ReorderIssueResolutionsRequest reorderIssueResolutionsRequest) {
        this.reorderIssueResolutionsRequest = reorderIssueResolutionsRequest;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(reorderIssueResolutionsRequest, "reorderIssueResolutionsRequest is a required parameter!");
    }
}
