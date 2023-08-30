package io.github.primelib.jira4j.restv3.model;

import java.util.List;
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

import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueTypeIssueCreateMetadata
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
    "avatarId",
    "description",
    "entityId",
    "expand",
    "fields",
    "hierarchyLevel",
    "iconUrl",
    "id",
    "name",
    "scope",
    "self",
    "subtask"
})
@JsonTypeName("IssueTypeIssueCreateMetadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeIssueCreateMetadata {

    /**
     * The ID of the issue type's avatar.
     */
    @JsonProperty("avatarId")
    protected Long avatarId;

    /**
     * The description of the issue type.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Unique ID for next-gen projects.
     */
    @JsonProperty("entityId")
    protected UUID entityId;

    /**
     * Expand options that include additional issue type metadata details in the response.
     */
    @JsonProperty("expand")
    protected String expand;

    /**
     * List of the fields available when creating an issue for the issue type.
     */
    @JsonProperty("fields")
    protected Map<String, FieldMetadata> fields;

    /**
     * Hierarchy level of the issue type.
     */
    @JsonProperty("hierarchyLevel")
    protected Integer hierarchyLevel;

    /**
     * The URL of the issue type's avatar.
     */
    @JsonProperty("iconUrl")
    protected String iconUrl;

    /**
     * The ID of the issue type.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the issue type.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("scope")
    protected IssueTypeDetailsScope scope;

    /**
     * The URL of these issue type details.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * Whether this issue type is used to create subtasks.
     */
    @JsonProperty("subtask")
    protected Boolean subtask;

    /**
     * Constructs a validated instance of {@link IssueTypeIssueCreateMetadata}.
     *
     * @param spec the specification to process
     */
    public IssueTypeIssueCreateMetadata(Consumer<IssueTypeIssueCreateMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeIssueCreateMetadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeIssueCreateMetadata(Consumer)} instead.
     * @param avatarId The ID of the issue type's avatar.
     * @param description The description of the issue type.
     * @param entityId Unique ID for next-gen projects.
     * @param expand Expand options that include additional issue type metadata details in the response.
     * @param fields List of the fields available when creating an issue for the issue type.
     * @param hierarchyLevel Hierarchy level of the issue type.
     * @param iconUrl The URL of the issue type's avatar.
     * @param id The ID of the issue type.
     * @param name The name of the issue type.
     * @param scope scope
     * @param self The URL of these issue type details.
     * @param subtask Whether this issue type is used to create subtasks.
     */
    @ApiStatus.Internal
    public IssueTypeIssueCreateMetadata(Long avatarId, String description, UUID entityId, String expand, Map<String, FieldMetadata> fields, Integer hierarchyLevel, String iconUrl, String id, String name, IssueTypeDetailsScope scope, String self, Boolean subtask) {
        this.avatarId = avatarId;
        this.description = description;
        this.entityId = entityId;
        this.expand = expand;
        this.fields = fields;
        this.hierarchyLevel = hierarchyLevel;
        this.iconUrl = iconUrl;
        this.id = id;
        this.name = name;
        this.scope = scope;
        this.self = self;
        this.subtask = subtask;
    }

}
