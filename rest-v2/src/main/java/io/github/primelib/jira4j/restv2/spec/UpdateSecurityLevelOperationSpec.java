package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.SecurityLevel;
import java.util.Set;
import io.github.primelib.jira4j.restv2.model.UpdateIssueSecurityLevelDetails;
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
 * UpdateSecurityLevelSpec
 * <p>
 * Specification for the UpdateSecurityLevel operation.
 * <p>
 * Update issue security level
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateSecurityLevelOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the issue security scheme level belongs to.
     */
    @NotNull 
    private String schemeId;

    /**
     * The ID of the issue security level to update.
     */
    @NotNull 
    private String levelId;

    /**
     */
    @NotNull 
    private UpdateIssueSecurityLevelDetails updateIssueSecurityLevelDetails;

    /**
     * Constructs a validated instance of {@link UpdateSecurityLevelOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateSecurityLevelOperationSpec(Consumer<UpdateSecurityLevelOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateSecurityLevelOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param schemeId             The ID of the issue security scheme level belongs to.
     * @param levelId              The ID of the issue security level to update.
     * @param updateIssueSecurityLevelDetails 
     */
    @ApiStatus.Internal
    public UpdateSecurityLevelOperationSpec(String schemeId, String levelId, UpdateIssueSecurityLevelDetails updateIssueSecurityLevelDetails) {
        this.schemeId = schemeId;
        this.levelId = levelId;
        this.updateIssueSecurityLevelDetails = updateIssueSecurityLevelDetails;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(schemeId, "schemeId is a required parameter!");
        Objects.requireNonNull(levelId, "levelId is a required parameter!");
        Objects.requireNonNull(updateIssueSecurityLevelDetails, "updateIssueSecurityLevelDetails is a required parameter!");
    }
}
