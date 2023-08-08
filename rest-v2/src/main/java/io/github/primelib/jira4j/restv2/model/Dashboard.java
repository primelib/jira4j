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
 * Dashboard
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

    /**
     * Constructs a validated instance of {@link Dashboard}.
     *
     * @param spec the specification to process
     */
    public Dashboard(Consumer<Dashboard> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Dashboard}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Dashboard(Consumer)} instead.
     * @param automaticRefreshMs The automatic refresh interval for the dashboard in milliseconds.
     * @param description description
     * @param editPermissions The details of any edit share permissions for the dashboard.
     * @param id The ID of the dashboard.
     * @param isFavourite Whether the dashboard is selected as a favorite by the user.
     * @param isWritable Whether the current user has permission to edit the dashboard.
     * @param name The name of the dashboard.
     * @param owner owner
     * @param popularity The number of users who have this dashboard as a favorite.
     * @param rank The rank of this dashboard.
     * @param self The URL of these dashboard details.
     * @param sharePermissions The details of any view share permissions for the dashboard.
     * @param systemDashboard Whether the current dashboard is system dashboard.
     * @param view The URL of the dashboard.
     */
    @ApiStatus.Internal
    public Dashboard(Integer automaticRefreshMs, String description, List<SharePermission> editPermissions, String id, Boolean isFavourite, Boolean isWritable, String name, DashboardOwner owner, Long popularity, Integer rank, URI self, List<SharePermission> sharePermissions, Boolean systemDashboard, String view) {
        this.automaticRefreshMs = automaticRefreshMs;
        this.description = description;
        this.editPermissions = editPermissions;
        this.id = id;
        this.isFavourite = isFavourite;
        this.isWritable = isWritable;
        this.name = name;
        this.owner = owner;
        this.popularity = popularity;
        this.rank = rank;
        this.self = self;
        this.sharePermissions = sharePermissions;
        this.systemDashboard = systemDashboard;
        this.view = view;
    }

}
