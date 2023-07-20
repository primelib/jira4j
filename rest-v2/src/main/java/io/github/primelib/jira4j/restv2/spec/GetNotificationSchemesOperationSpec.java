package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Notification;
import io.github.primelib.jira4j.restv2.model.NotificationScheme;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetNotificationSchemesSpec
 * <p>
 * Specification for the GetNotificationSchemes operation.
 * <p>
 * Get notification schemes paginated
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetNotificationSchemesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private String startAt = "0";

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private String maxResults = "50";

    /**
     * The list of notification schemes IDs to be filtered by
     */
    @Nullable 
    private Set<String> id;

    /**
     * The list of projects IDs to be filtered by
     */
    @Nullable 
    private Set<String> projectId;

    /**
     * When set to true, returns only the default notification scheme. If you provide project IDs not associated with the default, returns an empty page. The default value is false.
     */
    @Nullable 
    private Boolean onlyDefault = false;

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
     * Constructs a validated implementation of {@link GetNotificationSchemesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetNotificationSchemesOperationSpec(Consumer<GetNotificationSchemesOperationSpec> spec) {
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
