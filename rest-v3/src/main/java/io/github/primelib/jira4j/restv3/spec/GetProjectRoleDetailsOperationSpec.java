package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Project;
import io.github.primelib.jira4j.restv3.model.ProjectRole;
import io.github.primelib.jira4j.restv3.model.ProjectRoleDetails;
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
 * GetProjectRoleDetailsSpec
 * <p>
 * Specification for the GetProjectRoleDetails operation.
 * <p>
 * Get project role details
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetProjectRoleDetailsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The project ID or project key (case sensitive).
     */
    @NotNull 
    private String projectIdOrKey;

    /**
     * Whether the roles should be filtered to include only those the user is assigned to.
     */
    @Nullable 
    private Boolean currentMember;

    /**
     */
    @Nullable 
    private Boolean excludeConnectAddons;

    /**
     * Constructs a validated instance of {@link GetProjectRoleDetailsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetProjectRoleDetailsOperationSpec(Consumer<GetProjectRoleDetailsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetProjectRoleDetailsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param projectIdOrKey       The project ID or project key (case sensitive).
     * @param currentMember        Whether the roles should be filtered to include only those the user is assigned to.
     * @param excludeConnectAddons 
     */
    @ApiStatus.Internal
    public GetProjectRoleDetailsOperationSpec(String projectIdOrKey, Boolean currentMember, Boolean excludeConnectAddons) {
        this.projectIdOrKey = projectIdOrKey;
        this.currentMember = currentMember;
        this.excludeConnectAddons = excludeConnectAddons;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(projectIdOrKey, "projectIdOrKey is a required parameter!");
    }
}
