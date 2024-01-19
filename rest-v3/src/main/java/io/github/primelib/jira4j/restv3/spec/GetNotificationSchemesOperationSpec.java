package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Notification;
import io.github.primelib.jira4j.restv3.model.NotificationScheme;
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
 * GetNotificationSchemesSpec
 * <p>
 * Specification for the GetNotificationSchemes operation.
 * <p>
 * Get notification schemes paginated
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    private String startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private String maxResults;

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
    private Boolean onlyDefault;

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
     * Constructs a validated instance of {@link GetNotificationSchemesOperationSpec}.
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
     * Constructs a validated instance of {@link GetNotificationSchemesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param id                   The list of notification schemes IDs to be filtered by
     * @param projectId            The list of projects IDs to be filtered by
     * @param onlyDefault          When set to true, returns only the default notification scheme. If you provide project IDs not associated with the default, returns an empty page. The default value is false.
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code all} Returns all expandable information  *  {@code field} Returns information about any custom fields assigned to receive an event  *  {@code group} Returns information about any groups assigned to receive an event  *  {@code notificationSchemeEvents} Returns a list of event associations. This list is returned for all expandable information  *  {@code projectRole} Returns information about any project roles assigned to receive an event  *  {@code user} Returns information about any users assigned to receive an event
     */
    @ApiStatus.Internal
    public GetNotificationSchemesOperationSpec(String startAt, String maxResults, Set<String> id, Set<String> projectId, Boolean onlyDefault, String expand) {
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.id = id;
        this.projectId = projectId;
        this.onlyDefault = onlyDefault;
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
    }
}
