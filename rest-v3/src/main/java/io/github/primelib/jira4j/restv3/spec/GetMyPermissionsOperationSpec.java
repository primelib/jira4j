package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Configuration;
import io.github.primelib.jira4j.restv3.model.Permissions;
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
 * GetMyPermissionsSpec
 * <p>
 * Specification for the GetMyPermissions operation.
 * <p>
 * Get my permissions
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetMyPermissionsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of project. Ignored if {@code projectId} is provided.
     */
    @Nullable 
    private String projectKey;

    /**
     * The ID of project.
     */
    @Nullable 
    private String projectId;

    /**
     * The key of the issue. Ignored if {@code issueId} is provided.
     */
    @Nullable 
    private String issueKey;

    /**
     * The ID of the issue.
     */
    @Nullable 
    private String issueId;

    /**
     * A list of permission keys. (Required) This parameter accepts a comma-separated list. To get the list of available permissions, use [Get all permissions](#api-rest-api-3-permissions-get).
     */
    @Nullable 
    private String permissions;

    /**
     */
    @Nullable 
    private String projectUuid;

    /**
     */
    @Nullable 
    private String projectConfigurationUuid;

    /**
     * The ID of the comment.
     */
    @Nullable 
    private String commentId;

    /**
     * Constructs a validated instance of {@link GetMyPermissionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetMyPermissionsOperationSpec(Consumer<GetMyPermissionsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetMyPermissionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param projectKey           The key of project. Ignored if {@code projectId} is provided.
     * @param projectId            The ID of project.
     * @param issueKey             The key of the issue. Ignored if {@code issueId} is provided.
     * @param issueId              The ID of the issue.
     * @param permissions          A list of permission keys. (Required) This parameter accepts a comma-separated list. To get the list of available permissions, use [Get all permissions](#api-rest-api-3-permissions-get).
     * @param projectUuid          
     * @param projectConfigurationUuid 
     * @param commentId            The ID of the comment.
     */
    @ApiStatus.Internal
    public GetMyPermissionsOperationSpec(String projectKey, String projectId, String issueKey, String issueId, String permissions, String projectUuid, String projectConfigurationUuid, String commentId) {
        this.projectKey = projectKey;
        this.projectId = projectId;
        this.issueKey = issueKey;
        this.issueId = issueId;
        this.permissions = permissions;
        this.projectUuid = projectUuid;
        this.projectConfigurationUuid = projectConfigurationUuid;
        this.commentId = commentId;

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
