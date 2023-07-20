package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
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
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link ApplicationRole}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ApplicationRole(Consumer<ApplicationRole> spec) {
        spec.accept(this);
    }

    /**
     * The groups that are granted default access for this application role. As a group's name can change, use of `defaultGroupsDetails` is recommended to identify a groups.
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
     * The groups associated with the application role. As a group's name can change, use of `groupDetails` is recommended to identify a groups.
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
     * Indicates if the application role belongs to Jira platform (`jira-core`).
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


}
