package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectRoleGroup
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "displayName",
    "groupId",
    "name"
})
@JsonTypeName("ProjectRoleGroup")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectRoleGroup {

    /**
     * Constructs a validated implementation of {@link ProjectRoleGroup}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectRoleGroup(Consumer<ProjectRoleGroup> spec) {
        spec.accept(this);
    }

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
     * The name of the group. As a group's name can change, use of `groupId` is recommended to identify the group.
     */
    @JsonProperty("name")
    protected String name;


}
