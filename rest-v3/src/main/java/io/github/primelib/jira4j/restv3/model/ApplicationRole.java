package io.github.primelib.jira4j.restv3.model;

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

import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApplicationRole
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
    "defaultGroups",
    "defaultGroupsDetails",
    "defined",
    "groupDetails",
    "groups",
    "hasUnlimitedSeats",
    "key",
    "name",
    "numberOfSeats",
    "platform",
    "remainingSeats",
    "selectedByDefault",
    "userCount",
    "userCountDescription"
})
@JsonTypeName("ApplicationRole")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ApplicationRole {

    /**
     * The groups that are granted default access for this application role. As a group's name can change, use of {@code defaultGroupsDetails} is recommended to identify a groups.
     */
    @JsonProperty("defaultGroups")
    protected Set<String> defaultGroups;

    /**
     * The groups that are granted default access for this application role.
     */
    @JsonProperty("defaultGroupsDetails")
    protected List<GroupName> defaultGroupsDetails;

    /**
     * Deprecated.
     */
    @JsonProperty("defined")
    protected Boolean defined;

    /**
     * The groups associated with the application role.
     */
    @JsonProperty("groupDetails")
    protected List<GroupName> groupDetails;

    /**
     * The groups associated with the application role. As a group's name can change, use of {@code groupDetails} is recommended to identify a groups.
     */
    @JsonProperty("groups")
    protected Set<String> groups;

    @JsonProperty("hasUnlimitedSeats")
    protected Boolean hasUnlimitedSeats;

    /**
     * The key of the application role.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The display name of the application role.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The maximum count of users on your license.
     */
    @JsonProperty("numberOfSeats")
    protected Integer numberOfSeats;

    /**
     * Indicates if the application role belongs to Jira platform ({@code jira-core}).
     */
    @JsonProperty("platform")
    protected Boolean platform;

    /**
     * The count of users remaining on your license.
     */
    @JsonProperty("remainingSeats")
    protected Integer remainingSeats;

    /**
     * Determines whether this application role should be selected by default on user creation.
     */
    @JsonProperty("selectedByDefault")
    protected Boolean selectedByDefault;

    /**
     * The number of users counting against your license.
     */
    @JsonProperty("userCount")
    protected Integer userCount;

    /**
     * The [type of users](https://confluence.atlassian.com/x/lRW3Ng) being counted against your license.
     */
    @JsonProperty("userCountDescription")
    protected String userCountDescription;

    /**
     * Constructs a validated instance of {@link ApplicationRole}.
     *
     * @param spec the specification to process
     */
    public ApplicationRole(Consumer<ApplicationRole> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ApplicationRole}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ApplicationRole(Consumer)} instead.
     * @param defaultGroups The groups that are granted default access for this application role. As a group's name can change, use of {@code defaultGroupsDetails} is recommended to identify a groups.
     * @param defaultGroupsDetails The groups that are granted default access for this application role.
     * @param defined Deprecated.
     * @param groupDetails The groups associated with the application role.
     * @param groups The groups associated with the application role. As a group's name can change, use of {@code groupDetails} is recommended to identify a groups.
     * @param hasUnlimitedSeats hasUnlimitedSeats
     * @param key The key of the application role.
     * @param name The display name of the application role.
     * @param numberOfSeats The maximum count of users on your license.
     * @param platform Indicates if the application role belongs to Jira platform ({@code jira-core}).
     * @param remainingSeats The count of users remaining on your license.
     * @param selectedByDefault Determines whether this application role should be selected by default on user creation.
     * @param userCount The number of users counting against your license.
     * @param userCountDescription The [type of users](https://confluence.atlassian.com/x/lRW3Ng) being counted against your license.
     */
    @ApiStatus.Internal
    public ApplicationRole(Set<String> defaultGroups, List<GroupName> defaultGroupsDetails, Boolean defined, List<GroupName> groupDetails, Set<String> groups, Boolean hasUnlimitedSeats, String key, String name, Integer numberOfSeats, Boolean platform, Integer remainingSeats, Boolean selectedByDefault, Integer userCount, String userCountDescription) {
        this.defaultGroups = defaultGroups;
        this.defaultGroupsDetails = defaultGroupsDetails;
        this.defined = defined;
        this.groupDetails = groupDetails;
        this.groups = groups;
        this.hasUnlimitedSeats = hasUnlimitedSeats;
        this.key = key;
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.platform = platform;
        this.remainingSeats = remainingSeats;
        this.selectedByDefault = selectedByDefault;
        this.userCount = userCount;
        this.userCountDescription = userCountDescription;
    }

}
