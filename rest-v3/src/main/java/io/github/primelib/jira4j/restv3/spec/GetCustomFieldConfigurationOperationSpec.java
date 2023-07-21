package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Configuration;
import io.github.primelib.jira4j.restv3.model.FieldConfiguration;
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
 * GetCustomFieldConfigurationSpec
 * <p>
 * Specification for the GetCustomFieldConfiguration operation.
 * <p>
 * Get custom field configurations
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetCustomFieldConfigurationOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID or key of the custom field, for example {@code customfield_10000}.
     */
    @NotNull 
    private String fieldIdOrKey;

    /**
     * The list of configuration IDs. To include multiple configurations, separate IDs with an ampersand: {@code id=10000&amp;id=10001}. Can't be provided with {@code fieldContextId}, {@code issueId}, {@code projectKeyOrId}, or {@code issueTypeId}.
     */
    @Nullable 
    private Set<Long> id;

    /**
     * The list of field context IDs. To include multiple field contexts, separate IDs with an ampersand: {@code fieldContextId=10000&amp;fieldContextId=10001}. Can't be provided with {@code id}, {@code issueId}, {@code projectKeyOrId}, or {@code issueTypeId}.
     */
    @Nullable 
    private Set<Long> fieldContextId;

    /**
     * The ID of the issue to filter results by. If the issue doesn't exist, an empty list is returned. Can't be provided with {@code projectKeyOrId}, or {@code issueTypeId}.
     */
    @Nullable 
    private Long issueId;

    /**
     * The ID or key of the project to filter results by. Must be provided with {@code issueTypeId}. Can't be provided with {@code issueId}.
     */
    @Nullable 
    private String projectKeyOrId;

    /**
     * The ID of the issue type to filter results by. Must be provided with {@code projectKeyOrId}. Can't be provided with {@code issueId}.
     */
    @Nullable 
    private String issueTypeId;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Long startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * Constructs a validated instance of {@link GetCustomFieldConfigurationOperationSpec}.
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
     * Constructs a validated instance of {@link GetCustomFieldConfigurationOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param fieldIdOrKey         The ID or key of the custom field, for example {@code customfield_10000}.
     * @param id                   The list of configuration IDs. To include multiple configurations, separate IDs with an ampersand: {@code id=10000&amp;id=10001}. Can't be provided with {@code fieldContextId}, {@code issueId}, {@code projectKeyOrId}, or {@code issueTypeId}.
     * @param fieldContextId       The list of field context IDs. To include multiple field contexts, separate IDs with an ampersand: {@code fieldContextId=10000&amp;fieldContextId=10001}. Can't be provided with {@code id}, {@code issueId}, {@code projectKeyOrId}, or {@code issueTypeId}.
     * @param issueId              The ID of the issue to filter results by. If the issue doesn't exist, an empty list is returned. Can't be provided with {@code projectKeyOrId}, or {@code issueTypeId}.
     * @param projectKeyOrId       The ID or key of the project to filter results by. Must be provided with {@code issueTypeId}. Can't be provided with {@code issueId}.
     * @param issueTypeId          The ID of the issue type to filter results by. Must be provided with {@code projectKeyOrId}. Can't be provided with {@code issueId}.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     */
    @ApiStatus.Internal
    public GetCustomFieldConfigurationOperationSpec(String fieldIdOrKey, Set<Long> id, Set<Long> fieldContextId, Long issueId, String projectKeyOrId, String issueTypeId, Long startAt, Integer maxResults) {
        this.fieldIdOrKey = fieldIdOrKey;
        this.id = id;
        this.fieldContextId = fieldContextId;
        this.issueId = issueId;
        this.projectKeyOrId = projectKeyOrId;
        this.issueTypeId = issueTypeId;
        this.startAt = startAt;
        this.maxResults = maxResults;

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
