package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectRoleActorsUpdateBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "categorisedActors",
    "id"
})
@JsonTypeName("ProjectRoleActorsUpdateBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectRoleActorsUpdateBean {

    /**
     * Constructs a validated implementation of {@link ProjectRoleActorsUpdateBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectRoleActorsUpdateBean(Consumer<ProjectRoleActorsUpdateBean> spec) {
        spec.accept(this);
    }

    /**
     * The actors to add to the project role.
     * Add groups using:
     *  *
     * `atlassian-group-role-actor` and a list of group names.
     * *
     * `atlassian-group-role-actor-id` and a list of group IDs.
     * As a group's name can change, use of `atlassian-group-role-actor-id` is recommended. For example, `"atlassian-group-role-actor-id":["eef79f81-0b89-4fca-a736-4be531a10869","77f6ab39-e755-4570-a6ae-2d7a8df0bcb8"]`.
     * Add users using `atlassian-user-role-actor` and a list of account IDs. For example, `"atlassian-user-role-actor":["12345678-9abc-def1-2345-6789abcdef12", "abcdef12-3456-789a-bcde-f123456789ab"]`.
     */
    @JsonProperty("categorisedActors")
    protected Map<String, List<String>> categorisedActors = new HashMap<>();

    /**
     * The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
     */
    @JsonProperty("id")
    protected Long id;


}
