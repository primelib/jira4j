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

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectRoleActorsUpdateBean
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
    "categorisedActors",
    "id"
})
@JsonTypeName("ProjectRoleActorsUpdateBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectRoleActorsUpdateBean {

    /**
     * The actors to add to the project role.
     * Add groups using:
     *  *
     * {@code atlassian-group-role-actor} and a list of group names.
     * *
     * {@code atlassian-group-role-actor-id} and a list of group IDs.
     * As a group's name can change, use of {@code atlassian-group-role-actor-id} is recommended. For example, {@code "atlassian-group-role-actor-id":["eef79f81-0b89-4fca-a736-4be531a10869","77f6ab39-e755-4570-a6ae-2d7a8df0bcb8"]}.
     * Add users using {@code atlassian-user-role-actor} and a list of account IDs. For example, {@code "atlassian-user-role-actor":["12345678-9abc-def1-2345-6789abcdef12", "abcdef12-3456-789a-bcde-f123456789ab"]}.
     */
    @JsonProperty("categorisedActors")
    protected Map<String, List<String>> categorisedActors;

    /**
     * The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * Constructs a validated instance of {@link ProjectRoleActorsUpdateBean}.
     *
     * @param spec the specification to process
     */
    public ProjectRoleActorsUpdateBean(Consumer<ProjectRoleActorsUpdateBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectRoleActorsUpdateBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectRoleActorsUpdateBean(Consumer)} instead.
     * @param categorisedActors The actors to add to the project role.  Add groups using:   *  {@code atlassian-group-role-actor} and a list of group names.  *  {@code atlassian-group-role-actor-id} and a list of group IDs.  As a group's name can change, use of {@code atlassian-group-role-actor-id} is recommended. For example, {@code "atlassian-group-role-actor-id":["eef79f81-0b89-4fca-a736-4be531a10869","77f6ab39-e755-4570-a6ae-2d7a8df0bcb8"]}.  Add users using {@code atlassian-user-role-actor} and a list of account IDs. For example, {@code "atlassian-user-role-actor":["12345678-9abc-def1-2345-6789abcdef12", "abcdef12-3456-789a-bcde-f123456789ab"]}.
     * @param id The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
     */
    @ApiStatus.Internal
    public ProjectRoleActorsUpdateBean(Map<String, List<String>> categorisedActors, Long id) {
        this.categorisedActors = categorisedActors;
        this.id = id;
    }

}
