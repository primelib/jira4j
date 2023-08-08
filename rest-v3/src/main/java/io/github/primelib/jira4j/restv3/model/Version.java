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

import java.net.URI;
import java.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Version
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
    "archived",
    "description",
    "expand",
    "id",
    "issuesStatusForFixVersion",
    "moveUnfixedIssuesTo",
    "name",
    "operations",
    "overdue",
    "project",
    "projectId",
    "releaseDate",
    "released",
    "self",
    "startDate",
    "userReleaseDate",
    "userStartDate"
})
@JsonTypeName("Version")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Version {

    /**
     * Indicates that the version is archived. Optional when creating or updating a version.
     */
    @JsonProperty("archived")
    protected Boolean archived;

    /**
     * The description of the version. Optional when creating or updating a version.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Use [expand](em&amp;gt;#expansion) to include additional information about version in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * {@code operations} Returns the list of operations available for this version.
     * *
     * {@code issuesstatus} Returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.
     * Optional for create and update.
     */
    @JsonProperty("expand")
    protected String expand;

    /**
     * The ID of the version.
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("issuesStatusForFixVersion")
    protected VersionIssuesStatusForFixVersion issuesStatusForFixVersion;

    /**
     * The URL of the self link to the version to which all unfixed issues are moved when a version is released. Not applicable when creating a version. Optional when updating a version.
     */
    @JsonProperty("moveUnfixedIssuesTo")
    protected URI moveUnfixedIssuesTo;

    /**
     * The unique name of the version. Required when creating a version. Optional when updating a version. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * If the expand option {@code operations} is used, returns the list of operations available for this version.
     */
    @JsonProperty("operations")
    protected List<SimpleLink> operations;

    /**
     * Indicates that the version is overdue.
     */
    @JsonProperty("overdue")
    protected Boolean overdue;

    /**
     * Deprecated. Use {@code projectId}.
     */
    @JsonProperty("project")
    protected String project;

    /**
     * The ID of the project to which this version is attached. Required when creating a version. Not applicable when updating a version.
     */
    @JsonProperty("projectId")
    protected Long projectId;

    /**
     * The release date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.
     */
    @JsonProperty("releaseDate")
    protected LocalDate releaseDate;

    /**
     * Indicates that the version is released. If the version is released a request to release again is ignored. Not applicable when creating a version. Optional when updating a version.
     */
    @JsonProperty("released")
    protected Boolean released;

    /**
     * The URL of the version.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * The start date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.
     */
    @JsonProperty("startDate")
    protected LocalDate startDate;

    /**
     * The date on which work on this version is expected to finish, expressed in the instance's *Day/Month/Year Format* date format.
     */
    @JsonProperty("userReleaseDate")
    protected String userReleaseDate;

    /**
     * The date on which work on this version is expected to start, expressed in the instance's *Day/Month/Year Format* date format.
     */
    @JsonProperty("userStartDate")
    protected String userStartDate;

    /**
     * Constructs a validated instance of {@link Version}.
     *
     * @param spec the specification to process
     */
    public Version(Consumer<Version> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Version}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Version(Consumer)} instead.
     * @param archived Indicates that the version is archived. Optional when creating or updating a version.
     * @param description The description of the version. Optional when creating or updating a version.
     * @param expand Use [expand](em&amp;gt;#expansion) to include additional information about version in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code operations} Returns the list of operations available for this version.  *  {@code issuesstatus} Returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.  Optional for create and update.
     * @param id The ID of the version.
     * @param issuesStatusForFixVersion issuesStatusForFixVersion
     * @param moveUnfixedIssuesTo The URL of the self link to the version to which all unfixed issues are moved when a version is released. Not applicable when creating a version. Optional when updating a version.
     * @param name The unique name of the version. Required when creating a version. Optional when updating a version. The maximum length is 255 characters.
     * @param operations If the expand option {@code operations} is used, returns the list of operations available for this version.
     * @param overdue Indicates that the version is overdue.
     * @param project Deprecated. Use {@code projectId}.
     * @param projectId The ID of the project to which this version is attached. Required when creating a version. Not applicable when updating a version.
     * @param releaseDate The release date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.
     * @param released Indicates that the version is released. If the version is released a request to release again is ignored. Not applicable when creating a version. Optional when updating a version.
     * @param self The URL of the version.
     * @param startDate The start date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.
     * @param userReleaseDate The date on which work on this version is expected to finish, expressed in the instance's *Day/Month/Year Format* date format.
     * @param userStartDate The date on which work on this version is expected to start, expressed in the instance's *Day/Month/Year Format* date format.
     */
    @ApiStatus.Internal
    public Version(Boolean archived, String description, String expand, String id, VersionIssuesStatusForFixVersion issuesStatusForFixVersion, URI moveUnfixedIssuesTo, String name, List<SimpleLink> operations, Boolean overdue, String project, Long projectId, LocalDate releaseDate, Boolean released, URI self, LocalDate startDate, String userReleaseDate, String userStartDate) {
        this.archived = archived;
        this.description = description;
        this.expand = expand;
        this.id = id;
        this.issuesStatusForFixVersion = issuesStatusForFixVersion;
        this.moveUnfixedIssuesTo = moveUnfixedIssuesTo;
        this.name = name;
        this.operations = operations;
        this.overdue = overdue;
        this.project = project;
        this.projectId = projectId;
        this.releaseDate = releaseDate;
        this.released = released;
        this.self = self;
        this.startDate = startDate;
        this.userReleaseDate = userReleaseDate;
        this.userStartDate = userStartDate;
    }

}
