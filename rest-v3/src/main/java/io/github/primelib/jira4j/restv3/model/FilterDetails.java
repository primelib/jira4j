package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FilterDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "editPermissions",
    "expand",
    "favourite",
    "favouritedCount",
    "id",
    "jql",
    "name",
    "owner",
    "searchUrl",
    "self",
    "sharePermissions",
    "subscriptions",
    "viewUrl"
})
@JsonTypeName("FilterDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FilterDetails {

    /**
     * Constructs a validated implementation of {@link FilterDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FilterDetails(Consumer<FilterDetails> spec) {
        spec.accept(this);
    }

    /**
     * The description of the filter.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The groups and projects that can edit the filter. This can be specified when updating a filter, but not when creating a filter.
     */
    @JsonProperty("editPermissions")
    protected List<SharePermission> editPermissions;

    /**
     * Expand options that include additional filter details in the response.
     */
    @JsonProperty("expand")
    protected String expand;

    /**
     * Whether the filter is selected as a favorite by any users, not including the filter owner.
     */
    @JsonProperty("favourite")
    protected Boolean favourite;

    /**
     * The count of how many users have selected this filter as a favorite, including the filter owner.
     */
    @JsonProperty("favouritedCount")
    protected Long favouritedCount;

    /**
     * The unique identifier for the filter.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The JQL query for the filter. For example, *project = SSP AND issuetype = Bug*.
     */
    @JsonProperty("jql")
    protected String jql;

    /**
     * The name of the filter.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("owner")
    protected FilterDetailsOwner owner;

    /**
     * A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter's JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql=project+%3D+SSP+AND+issuetype+%3D+Bug*.
     */
    @JsonProperty("searchUrl")
    protected URI searchUrl;

    /**
     * The URL of the filter.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * The groups and projects that the filter is shared with. This can be specified when updating a filter, but not when creating a filter.
     */
    @JsonProperty("sharePermissions")
    protected List<SharePermission> sharePermissions;

    /**
     * The users that are subscribed to the filter.
     */
    @JsonProperty("subscriptions")
    protected List<FilterSubscription> subscriptions;

    /**
     * A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter=10100*.
     */
    @JsonProperty("viewUrl")
    protected URI viewUrl;


}
