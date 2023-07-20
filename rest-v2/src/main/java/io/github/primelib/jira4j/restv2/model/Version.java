package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
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
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link Version}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Version(Consumer<Version> spec) {
        spec.accept(this);
    }

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
     * `operations` Returns the list of operations available for this version.
     * *
     * `issuesstatus` Returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.
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
     * If the expand option `operations` is used, returns the list of operations available for this version.
     */
    @JsonProperty("operations")
    protected List<SimpleLink> operations;

    /**
     * Indicates that the version is overdue.
     */
    @JsonProperty("overdue")
    protected Boolean overdue;

    /**
     * Deprecated. Use `projectId`.
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


}
