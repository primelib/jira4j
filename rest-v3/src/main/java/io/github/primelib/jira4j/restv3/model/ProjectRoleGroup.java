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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectRoleGroup
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
    "displayName",
    "groupId",
    "name"
})
@JsonTypeName("ProjectRoleGroup")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectRoleGroup {

    /**
     * The display name of the group.
     */
    @JsonProperty("displayName")
    protected String displayName;

    /**
     * The ID of the group.
     */
    @JsonProperty("groupId")
    protected String groupId;

    /**
     * The name of the group. As a group's name can change, use of {@code groupId} is recommended to identify the group.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link ProjectRoleGroup}.
     *
     * @param spec the specification to process
     */
    public ProjectRoleGroup(Consumer<ProjectRoleGroup> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectRoleGroup}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectRoleGroup(Consumer)} instead.
     * @param displayName The display name of the group.
     * @param groupId The ID of the group.
     * @param name The name of the group. As a group's name can change, use of {@code groupId} is recommended to identify the group.
     */
    @ApiStatus.Internal
    public ProjectRoleGroup(String displayName, String groupId, String name) {
        this.displayName = displayName;
        this.groupId = groupId;
        this.name = name;
    }

}
