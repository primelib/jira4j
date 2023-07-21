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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectIssueCreateMetadata
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

    /**
     * Constructs a validated instance of {@link ProjectIssueCreateMetadata}.
     *
     * @param spec the specification to process
     */
    public ProjectIssueCreateMetadata(Consumer<ProjectIssueCreateMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectIssueCreateMetadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectIssueCreateMetadata(Consumer)} instead.
     * @param avatarUrls var.name
     * @param expand Expand options that include additional project issue create metadata details in the response.
     * @param id The ID of the project.
     * @param issuetypes List of the issue types supported by the project.
     * @param key The key of the project.
     * @param name The name of the project.
     * @param self The URL of the project.
     */
    @ApiStatus.Internal
    public ProjectIssueCreateMetadata(ProjectIssueCreateMetadataAvatarUrls avatarUrls, String expand, String id, List<IssueTypeIssueCreateMetadata> issuetypes, String key, String name, String self) {
        this.avatarUrls = avatarUrls;
        this.expand = expand;
        this.id = id;
        this.issuetypes = issuetypes;
        this.key = key;
        this.name = name;
        this.self = self;
    }

}
