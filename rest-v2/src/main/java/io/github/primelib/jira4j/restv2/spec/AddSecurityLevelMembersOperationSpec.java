package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.SecurityLevel;
import io.github.primelib.jira4j.restv2.model.SecurityScheme;
import io.github.primelib.jira4j.restv2.model.SecuritySchemeMembersRequest;
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
 * AddSecurityLevelMembersSpec
 * <p>
 * Specification for the AddSecurityLevelMembers operation.
 * <p>
 * Add issue security level members
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddSecurityLevelMembersOperationSpec {
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
     */
    @NotNull 
    private SecuritySchemeMembersRequest securitySchemeMembersRequest;

    /**
     * Constructs a validated instance of {@link AddSecurityLevelMembersOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddSecurityLevelMembersOperationSpec(Consumer<AddSecurityLevelMembersOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link AddSecurityLevelMembersOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param schemeId             The ID of the issue security scheme.
     * @param levelId              The ID of the issue security level.
     * @param securitySchemeMembersRequest 
     */
    @ApiStatus.Internal
    public AddSecurityLevelMembersOperationSpec(String schemeId, String levelId, SecuritySchemeMembersRequest securitySchemeMembersRequest) {
        this.schemeId = schemeId;
        this.levelId = levelId;
        this.securitySchemeMembersRequest = securitySchemeMembersRequest;

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
        Objects.requireNonNull(securitySchemeMembersRequest, "securitySchemeMembersRequest is a required parameter!");
    }
}
