package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.SecurityLevel;
import io.github.primelib.jira4j.restv2.model.SecurityScheme;
import io.github.primelib.jira4j.restv2.model.SecuritySchemeMembersRequest;
import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
     * Constructs a validated implementation of {@link AddSecurityLevelMembersOperationSpec}.
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
