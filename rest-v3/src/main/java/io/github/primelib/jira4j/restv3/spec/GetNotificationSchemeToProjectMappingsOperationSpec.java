package io.github.primelib.jira4j.restv3.spec;

import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Notification;
import io.github.primelib.jira4j.restv3.model.NotificationScheme;
import io.github.primelib.jira4j.restv3.model.Project;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
    private String startAt = "0";

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private String maxResults = "50";

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
     * Constructs a validated implementation of {@link GetNotificationSchemeToProjectMappingsOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }

}
