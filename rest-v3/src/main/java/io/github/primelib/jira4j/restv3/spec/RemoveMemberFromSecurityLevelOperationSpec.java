package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.SecurityLevel;
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
 * RemoveMemberFromSecurityLevelSpec
 * <p>
 * Specification for the RemoveMemberFromSecurityLevel operation.
 * <p>
 * Remove member from issue security level
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link RemoveMemberFromSecurityLevelOperationSpec}.
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
     * Constructs a validated instance of {@link RemoveMemberFromSecurityLevelOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param schemeId             The ID of the issue security scheme.
     * @param levelId              The ID of the issue security level.
     * @param memberId             The ID of the issue security level member to be removed.
     */
    @ApiStatus.Internal
    public RemoveMemberFromSecurityLevelOperationSpec(String schemeId, String levelId, String memberId) {
        this.schemeId = schemeId;
        this.levelId = levelId;
        this.memberId = memberId;

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
