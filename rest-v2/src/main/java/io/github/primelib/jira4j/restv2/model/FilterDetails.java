package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
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
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-2-filter-search-get) operation with the filter's JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/2/search?jql=project+%3D+SSP+AND+issuetype+%3D+Bug*.
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

    /**
     * Constructs a validated instance of {@link FilterDetails}.
     *
     * @param spec the specification to process
     */
    public FilterDetails(Consumer<FilterDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FilterDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FilterDetails(Consumer)} instead.
     * @param description The description of the filter.
     * @param editPermissions The groups and projects that can edit the filter. This can be specified when updating a filter, but not when creating a filter.
     * @param expand Expand options that include additional filter details in the response.
     * @param favourite Whether the filter is selected as a favorite by any users, not including the filter owner.
     * @param favouritedCount The count of how many users have selected this filter as a favorite, including the filter owner.
     * @param id The unique identifier for the filter.
     * @param jql The JQL query for the filter. For example, *project = SSP AND issuetype = Bug*.
     * @param name The name of the filter.
     * @param owner var.name
     * @param searchUrl A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-2-filter-search-get) operation with the filter's JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/2/search?jql=project+%3D+SSP+AND+issuetype+%3D+Bug*.
     * @param self The URL of the filter.
     * @param sharePermissions The groups and projects that the filter is shared with. This can be specified when updating a filter, but not when creating a filter.
     * @param subscriptions The users that are subscribed to the filter.
     * @param viewUrl A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter=10100*.
     */
    @ApiStatus.Internal
    public FilterDetails(String description, List<SharePermission> editPermissions, String expand, Boolean favourite, Long favouritedCount, String id, String jql, String name, FilterDetailsOwner owner, URI searchUrl, URI self, List<SharePermission> sharePermissions, List<FilterSubscription> subscriptions, URI viewUrl) {
        this.description = description;
        this.editPermissions = editPermissions;
        this.expand = expand;
        this.favourite = favourite;
        this.favouritedCount = favouritedCount;
        this.id = id;
        this.jql = jql;
        this.name = name;
        this.owner = owner;
        this.searchUrl = searchUrl;
        this.self = self;
        this.sharePermissions = sharePermissions;
        this.subscriptions = subscriptions;
        this.viewUrl = viewUrl;
    }

}
