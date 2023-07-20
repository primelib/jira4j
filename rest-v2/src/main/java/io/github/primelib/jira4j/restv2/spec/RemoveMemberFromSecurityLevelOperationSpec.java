package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.SecurityLevel;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * RemoveMemberFromSecurityLevelSpec
 * <p>
 * Specification for the RemoveMemberFromSecurityLevel operation.
 * <p>
 * Remove member from issue security level
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoveMemberFromSecurityLevelOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the issue security scheme.
     */
    @NotNull 
    private String schemeId;

    /**
     * The ID of the issue security level.
     */
    @NotNull 
    private String levelId;

    /**
     * The ID of the issue security level member to be removed.
     */
    @NotNull 
    private String memberId;

    /**
     * Constructs a validated implementation of {@link RemoveMemberFromSecurityLevelOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoveMemberFromSecurityLevelOperationSpec(Consumer<RemoveMemberFromSecurityLevelOperationSpec> spec) {
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
        Objects.requireNonNull(schemeId, "schemeId is a required parameter!");
        Objects.requireNonNull(levelId, "levelId is a required parameter!");
        Objects.requireNonNull(memberId, "memberId is a required parameter!");
    }

}
