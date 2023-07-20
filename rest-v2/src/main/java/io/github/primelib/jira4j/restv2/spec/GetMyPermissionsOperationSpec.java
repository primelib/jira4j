package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Permissions;
import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetMyPermissionsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of project. Ignored if `projectId` is provided.
     */
    @Nullable 
    private String projectKey;

    /**
     * The ID of project.
     */
    @Nullable 
    private String projectId;

    /**
     * The key of the issue. Ignored if `issueId` is provided.
     */
    @Nullable 
    private String issueKey;

    /**
     * The ID of the issue.
     */
    @Nullable 
    private String issueId;

    /**
     * A list of permission keys. (Required) This parameter accepts a comma-separated list. To get the list of available permissions, use [Get all permissions](#api-rest-api-2-permissions-get).
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
     * Constructs a validated implementation of {@link GetMyPermissionsOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }

}
