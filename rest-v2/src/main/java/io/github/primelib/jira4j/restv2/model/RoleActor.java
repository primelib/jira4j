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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RoleActor
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
    "actorGroup",
    "actorUser",
    "avatarUrl",
    "displayName",
    "id",
    "name",
    "type"
})
@JsonTypeName("RoleActor")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RoleActor {

    @JsonProperty("actorGroup")
    protected ProjectRoleGroup actorGroup;

    @JsonProperty("actorUser")
    protected ProjectRoleUser actorUser;

    /**
     * The avatar of the role actor.
     */
    @JsonProperty("avatarUrl")
    protected URI avatarUrl;

    /**
     * The display name of the role actor. For users, depending on the user’s privacy setting, this may return an alternative value for the user's name.
     */
    @JsonProperty("displayName")
    protected String displayName;

    /**
     * The ID of the role actor.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The type of role actor.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link RoleActor}.
     *
     * @param spec the specification to process
     */
    public RoleActor(Consumer<RoleActor> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RoleActor}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RoleActor(Consumer)} instead.
     * @param actorGroup var.name
     * @param actorUser var.name
     * @param avatarUrl The avatar of the role actor.
     * @param displayName The display name of the role actor. For users, depending on the user’s privacy setting, this may return an alternative value for the user's name.
     * @param id The ID of the role actor.
     * @param name This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param type The type of role actor.
     */
    @ApiStatus.Internal
    public RoleActor(ProjectRoleGroup actorGroup, ProjectRoleUser actorUser, URI avatarUrl, String displayName, Long id, String name, TypeEnum type) {
        this.actorGroup = actorGroup;
        this.actorUser = actorUser;
        this.avatarUrl = avatarUrl;
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.type = type;
    }

    /**
     * The type of role actor.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        GROUP_ROLE_ACTOR("atlassian-group-role-actor"),
        USER_ROLE_ACTOR("atlassian-user-role-actor");

        private final String value;
    }

}
