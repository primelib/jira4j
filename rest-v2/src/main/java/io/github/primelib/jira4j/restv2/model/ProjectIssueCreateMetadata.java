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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectIssueCreateMetadata
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "avatarUrls",
    "expand",
    "id",
    "issuetypes",
    "key",
    "name",
    "self"
})
@JsonTypeName("ProjectIssueCreateMetadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectIssueCreateMetadata {

    /**
     * Constructs a validated implementation of {@link ProjectIssueCreateMetadata}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectIssueCreateMetadata(Consumer<ProjectIssueCreateMetadata> spec) {
        spec.accept(this);
    }

    @JsonProperty("avatarUrls")
    protected ProjectIssueCreateMetadataAvatarUrls avatarUrls;

    /**
     * Expand options that include additional project issue create metadata details in the response.
     */
    @JsonProperty("expand")
    protected String expand;

    /**
     * The ID of the project.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * List of the issue types supported by the project.
     */
    @JsonProperty("issuetypes")
    protected List<IssueTypeIssueCreateMetadata> issuetypes;

    /**
     * The key of the project.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The name of the project.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URL of the project.
     */
    @JsonProperty("self")
    protected String self;


}
