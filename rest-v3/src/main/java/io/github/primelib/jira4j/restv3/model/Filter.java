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
 * Filter
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "editPermissions",
    "favourite",
    "favouritedCount",
    "id",
    "jql",
    "name",
    "owner",
    "searchUrl",
    "self",
    "sharePermissions",
    "sharedUsers",
    "subscriptions",
    "viewUrl"
})
@JsonTypeName("Filter")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Filter {

    /**
     * Constructs a validated implementation of {@link Filter}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Filter(Consumer<Filter> spec) {
        spec.accept(this);
    }

    /**
     * A description of the filter.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The groups and projects that can edit the filter.
     */
    @JsonProperty("editPermissions")
    protected List<SharePermission> editPermissions;

    /**
     * Whether the filter is selected as a favorite.
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
     * The name of the filter. Must be unique.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("owner")
    protected FilterOwner owner;

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
     * The groups and projects that the filter is shared with.
     */
    @JsonProperty("sharePermissions")
    protected List<SharePermission> sharePermissions;

    @JsonProperty("sharedUsers")
    protected FilterSharedUsers sharedUsers;

    @JsonProperty("subscriptions")
    protected FilterSubscriptions subscriptions;

    /**
     * A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter=10100*.
     */
    @JsonProperty("viewUrl")
    protected URI viewUrl;


}
