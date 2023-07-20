package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldsIssueType
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "avatarId",
    "description",
    "entityId",
    "hierarchyLevel",
    "iconUrl",
    "id",
    "name",
    "scope",
    "self",
    "subtask"
})
@JsonTypeName("Fields_issueType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldsIssueType {

    /**
     * Constructs a validated implementation of {@link FieldsIssueType}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldsIssueType(Consumer<FieldsIssueType> spec) {
        spec.accept(this);
    }

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


}
