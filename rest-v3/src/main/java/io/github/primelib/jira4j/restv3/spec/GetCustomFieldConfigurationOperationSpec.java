package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.FieldConfiguration;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetCustomFieldConfigurationSpec
 * <p>
 * Specification for the GetCustomFieldConfiguration operation.
 * <p>
 * Get custom field configurations
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetCustomFieldConfigurationOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID or key of the custom field, for example `customfield_10000`.
     */
    @NotNull 
    private String fieldIdOrKey;

    /**
     * The list of configuration IDs. To include multiple configurations, separate IDs with an ampersand: `id=10000&amp;id=10001`. Can't be provided with `fieldContextId`, `issueId`, `projectKeyOrId`, or `issueTypeId`.
     */
    @Nullable 
    private Set<Long> id;

    /**
     * The list of field context IDs. To include multiple field contexts, separate IDs with an ampersand: `fieldContextId=10000&amp;fieldContextId=10001`. Can't be provided with `id`, `issueId`, `projectKeyOrId`, or `issueTypeId`.
     */
    @Nullable 
    private Set<Long> fieldContextId;

    /**
     * The ID of the issue to filter results by. If the issue doesn't exist, an empty list is returned. Can't be provided with `projectKeyOrId`, or `issueTypeId`.
     */
    @Nullable 
    private Long issueId;

    /**
     * The ID or key of the project to filter results by. Must be provided with `issueTypeId`. Can't be provided with `issueId`.
     */
    @Nullable 
    private String projectKeyOrId;

    /**
     * The ID of the issue type to filter results by. Must be provided with `projectKeyOrId`. Can't be provided with `issueId`.
     */
    @Nullable 
    private String issueTypeId;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Long startAt = 0L;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults = 100;

    /**
     * Constructs a validated implementation of {@link GetCustomFieldConfigurationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetCustomFieldConfigurationOperationSpec(Consumer<GetCustomFieldConfigurationOperationSpec> spec) {
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
        Objects.requireNonNull(fieldIdOrKey, "fieldIdOrKey is a required parameter!");
    }

}
