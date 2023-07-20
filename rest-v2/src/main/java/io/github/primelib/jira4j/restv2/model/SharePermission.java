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
 * SharePermission
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "group",
    "id",
    "project",
    "role",
    "type",
    "user"
})
@JsonTypeName("SharePermission")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SharePermission {

    /**
     * Constructs a validated implementation of {@link SharePermission}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SharePermission(Consumer<SharePermission> spec) {
        spec.accept(this);
    }

    @JsonProperty("group")
    protected SharePermissionGroup group;

    /**
     * The unique identifier of the share permission.
     */
    @JsonProperty("id")
    protected Long id;

    @JsonProperty("project")
    protected SharePermissionProject project;

    @JsonProperty("role")
    protected SharePermissionRole role;

    /**
     * The type of share permission:
     *  *
     * `user` Shared with a user.
     * *
     * `group` Shared with a group. If set in a request, then specify `sharePermission.group` as well.
     * *
     * `project` Shared with a project. If set in a request, then specify `sharePermission.project` as well.
     * *
     * `projectRole` Share with a project role in a project. This value is not returned in responses. It is used in requests, where it needs to be specify with `projectId` and `projectRoleId`.
     * *
     * `global` Shared globally. If set in a request, no other `sharePermission` properties need to be specified.
     * *
     * `loggedin` Shared with all logged-in users. Note: This value is set in a request by specifying `authenticated` as the `type`.
     * *
     * `project-unknown` Shared with a project that the user does not have access to. Cannot be set in a request.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("user")
    protected SharePermissionUser user;


    /**
     * The type of share permission:
     *  *
     * `user` Shared with a user.
     * *
     * `group` Shared with a group. If set in a request, then specify `sharePermission.group` as well.
     * *
     * `project` Shared with a project. If set in a request, then specify `sharePermission.project` as well.
     * *
     * `projectRole` Share with a project role in a project. This value is not returned in responses. It is used in requests, where it needs to be specify with `projectId` and `projectRoleId`.
     * *
     * `global` Shared globally. If set in a request, no other `sharePermission` properties need to be specified.
     * *
     * `loggedin` Shared with all logged-in users. Note: This value is set in a request by specifying `authenticated` as the `type`.
     * *
     * `project-unknown` Shared with a project that the user does not have access to. Cannot be set in a request.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        USER("user"),
        GROUP("group"),
        PROJECT("project"),
        PROJECTROLE("projectRole"),
        GLOBAL("global"),
        LOGGEDIN("loggedin"),
        AUTHENTICATED("authenticated"),
        PROJECT_UNKNOWN("project-unknown");

        private final String value;
    }

}
