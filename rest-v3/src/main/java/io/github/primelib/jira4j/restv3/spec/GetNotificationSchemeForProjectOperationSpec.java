package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Notification;
import io.github.primelib.jira4j.restv3.model.NotificationScheme;
import io.github.primelib.jira4j.restv3.model.Project;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetNotificationSchemeForProjectSpec
 * <p>
 * Specification for the GetNotificationSchemeForProject operation.
 * <p>
 * Get project notification scheme
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetNotificationSchemeForProjectOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The project ID or project key (case sensitive).
     */
    @NotNull 
    private String projectKeyOrId;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * `all` Returns all expandable information
     * *
     * `field` Returns information about any custom fields assigned to receive an event
     * *
     * `group` Returns information about any groups assigned to receive an event
     * *
     * `notificationSchemeEvents` Returns a list of event associations. This list is returned for all expandable information
     * *
     * `projectRole` Returns information about any project roles assigned to receive an event
     * *
     * `user` Returns information about any users assigned to receive an event
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link GetNotificationSchemeForProjectOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetNotificationSchemeForProjectOperationSpec(Consumer<GetNotificationSchemeForProjectOperationSpec> spec) {
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
        Objects.requireNonNull(projectKeyOrId, "projectKeyOrId is a required parameter!");
    }

}
