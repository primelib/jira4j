package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Notification;
import io.github.primelib.jira4j.restv3.model.NotificationScheme;
import io.github.primelib.jira4j.restv3.model.Project;
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
 * GetNotificationSchemeForProjectSpec
 * <p>
 * Specification for the GetNotificationSchemeForProject operation.
 * <p>
 * Get project notification scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * {@code all} Returns all expandable information
     * *
     * {@code field} Returns information about any custom fields assigned to receive an event
     * *
     * {@code group} Returns information about any groups assigned to receive an event
     * *
     * {@code notificationSchemeEvents} Returns a list of event associations. This list is returned for all expandable information
     * *
     * {@code projectRole} Returns information about any project roles assigned to receive an event
     * *
     * {@code user} Returns information about any users assigned to receive an event
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link GetNotificationSchemeForProjectOperationSpec}.
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
     * Constructs a validated instance of {@link GetNotificationSchemeForProjectOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param projectKeyOrId       The project ID or project key (case sensitive).
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code all} Returns all expandable information  *  {@code field} Returns information about any custom fields assigned to receive an event  *  {@code group} Returns information about any groups assigned to receive an event  *  {@code notificationSchemeEvents} Returns a list of event associations. This list is returned for all expandable information  *  {@code projectRole} Returns information about any project roles assigned to receive an event  *  {@code user} Returns information about any users assigned to receive an event
     */
    @ApiStatus.Internal
    public GetNotificationSchemeForProjectOperationSpec(String projectKeyOrId, String expand) {
        this.projectKeyOrId = projectKeyOrId;
        this.expand = expand;

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
