package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RoleActor
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link RoleActor}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RoleActor(Consumer<RoleActor> spec) {
        spec.accept(this);
    }

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
     * The type of role actor.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        GROUP_ROLE_ACTOR("atlassian-group-role-actor"),
        USER_ROLE_ACTOR("atlassian-user-role-actor");

        private final String value;
    }

}
