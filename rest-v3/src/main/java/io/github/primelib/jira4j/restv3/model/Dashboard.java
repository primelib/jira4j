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
 * Dashboard
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "automaticRefreshMs",
    "description",
    "editPermissions",
    "id",
    "isFavourite",
    "isWritable",
    "name",
    "owner",
    "popularity",
    "rank",
    "self",
    "sharePermissions",
    "systemDashboard",
    "view"
})
@JsonTypeName("Dashboard")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Dashboard {

    /**
     * Constructs a validated implementation of {@link Dashboard}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Dashboard(Consumer<Dashboard> spec) {
        spec.accept(this);
    }

    /**
     * The automatic refresh interval for the dashboard in milliseconds.
     */
    @JsonProperty("automaticRefreshMs")
    protected Integer automaticRefreshMs;

    @JsonProperty("description")
    protected String description;

    /**
     * The details of any edit share permissions for the dashboard.
     */
    @JsonProperty("editPermissions")
    protected List<SharePermission> editPermissions;

    /**
     * The ID of the dashboard.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Whether the dashboard is selected as a favorite by the user.
     */
    @JsonProperty("isFavourite")
    protected Boolean isFavourite;

    /**
     * Whether the current user has permission to edit the dashboard.
     */
    @JsonProperty("isWritable")
    protected Boolean isWritable;

    /**
     * The name of the dashboard.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("owner")
    protected DashboardOwner owner;

    /**
     * The number of users who have this dashboard as a favorite.
     */
    @JsonProperty("popularity")
    protected Long popularity;

    /**
     * The rank of this dashboard.
     */
    @JsonProperty("rank")
    protected Integer rank;

    /**
     * The URL of these dashboard details.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * The details of any view share permissions for the dashboard.
     */
    @JsonProperty("sharePermissions")
    protected List<SharePermission> sharePermissions;

    /**
     * Whether the current dashboard is system dashboard.
     */
    @JsonProperty("systemDashboard")
    protected Boolean systemDashboard;

    /**
     * The URL of the dashboard.
     */
    @JsonProperty("view")
    protected String view;


}
