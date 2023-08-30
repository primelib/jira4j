package io.github.primelib.jira4j.restv2.spec;

import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Notification;
import io.github.primelib.jira4j.restv2.model.NotificationScheme;
import io.github.primelib.jira4j.restv2.model.Project;
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
 * GetNotificationSchemeToProjectMappingsSpec
 * <p>
 * Specification for the GetNotificationSchemeToProjectMappings operation.
 * <p>
 * Get projects using notification schemes paginated
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetNotificationSchemeToProjectMappingsOperationSpec {
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
     * The list of notifications scheme IDs to be filtered out
     */
    @Nullable 
    private Set<String> notificationSchemeId;

    /**
     * The list of project IDs to be filtered out
     */
    @Nullable 
    private Set<String> projectId;

    /**
     * Constructs a validated instance of {@link GetNotificationSchemeToProjectMappingsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetNotificationSchemeToProjectMappingsOperationSpec(Consumer<GetNotificationSchemeToProjectMappingsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetNotificationSchemeToProjectMappingsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param notificationSchemeId The list of notifications scheme IDs to be filtered out
     * @param projectId            The list of project IDs to be filtered out
     */
    @ApiStatus.Internal
    public GetNotificationSchemeToProjectMappingsOperationSpec(String startAt, String maxResults, Set<String> notificationSchemeId, Set<String> projectId) {
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.notificationSchemeId = notificationSchemeId;
        this.projectId = projectId;

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
