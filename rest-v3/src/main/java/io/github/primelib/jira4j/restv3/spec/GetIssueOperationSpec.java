package io.github.primelib.jira4j.restv3.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Project;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetIssueSpec
 * <p>
 * Specification for the GetIssue operation.
 * <p>
 * Get issue
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetIssueOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID or key of the issue.
     */
    @NotNull 
    private String issueIdOrKey;

    /**
     * A list of fields to return for the issue. This parameter accepts a comma-separated list. Use it to retrieve a subset of fields. Allowed values:
     *  *
     * `*all` Returns all fields.
     * *
     * `*navigable` Returns navigable fields.
     * *
     * Any issue field, prefixed with a minus to exclude.
     * Examples:
     *  *
     * `summary,comment` Returns only the summary and comments fields.
     * *
     * `-description` Returns all (default) fields except description.
     * *
     * `*navigable,-comment` Returns all navigable fields except comment.
     * This parameter may be specified multiple times. For example, `fields=field1,field2&amp; fields=field3`.
     * Note: All fields are returned by default. This differs from [Search for issues using JQL (GET)](#api-rest-api-3-search-get) and [Search for issues using JQL (POST)](#api-rest-api-3-search-post) where the default is all navigable fields.
     */
    @Nullable 
    private List<String> fields;

    /**
     * Whether fields in `fields` are referenced by keys rather than IDs. This parameter is useful where fields have been added by a connect app and a field's key may differ from its ID.
     */
    @Nullable 
    private Boolean fieldsByKeys = false;

    /**
     * Use [expand](#expansion) to include additional information about the issues in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * `renderedFields` Returns field values rendered in HTML format.
     * *
     * `names` Returns the display name of each field.
     * *
     * `schema` Returns the schema describing a field type.
     * *
     * `transitions` Returns all possible transitions for the issue.
     * *
     * `editmeta` Returns information about how each field can be edited.
     * *
     * `changelog` Returns a list of recent updates to an issue, sorted by date, starting from the most recent.
     * *
     * `versionedRepresentations` Returns a JSON array for each version of a field's value, with the highest number representing the most recent version. Note: When included in the request, the `fields` parameter is ignored.
     */
    @Nullable 
    private String expand;

    /**
     * A list of issue properties to return for the issue. This parameter accepts a comma-separated list. Allowed values:
     *  *
     * `*all` Returns all issue properties.
     * *
     * Any issue property key, prefixed with a minus to exclude.
     * Examples:
     *  *
     * `*all` Returns all properties.
     * *
     * `*all,-prop1` Returns all properties except `prop1`.
     * *
     * `prop1,prop2` Returns `prop1` and `prop2` properties.
     * This parameter may be specified multiple times. For example, `properties=prop1,prop2&amp; properties=prop3`.
     */
    @Nullable 
    private List<String> properties;

    /**
     * Whether the project in which the issue is created is added to the user's **Recently viewed** project list, as shown under **Projects** in Jira. This also populates the [JQL issues search](#api-rest-api-3-search-get) `lastViewed` field.
     */
    @Nullable 
    private Boolean updateHistory = false;

    /**
     * Constructs a validated implementation of {@link GetIssueOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetIssueOperationSpec(Consumer<GetIssueOperationSpec> spec) {
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
        Objects.requireNonNull(issueIdOrKey, "issueIdOrKey is a required parameter!");
    }

}
