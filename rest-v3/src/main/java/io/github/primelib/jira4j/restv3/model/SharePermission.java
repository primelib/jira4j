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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SharePermission
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
     * {@code user} Shared with a user.
     * *
     * {@code group} Shared with a group. If set in a request, then specify {@code sharePermission.group} as well.
     * *
     * {@code project} Shared with a project. If set in a request, then specify {@code sharePermission.project} as well.
     * *
     * {@code projectRole} Share with a project role in a project. This value is not returned in responses. It is used in requests, where it needs to be specify with {@code projectId} and {@code projectRoleId}.
     * *
     * {@code global} Shared globally. If set in a request, no other {@code sharePermission} properties need to be specified.
     * *
     * {@code loggedin} Shared with all logged-in users. Note: This value is set in a request by specifying {@code authenticated} as the {@code type}.
     * *
     * {@code project-unknown} Shared with a project that the user does not have access to. Cannot be set in a request.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("user")
    protected SharePermissionUser user;

    /**
     * Constructs a validated instance of {@link SharePermission}.
     *
     * @param spec the specification to process
     */
    public SharePermission(Consumer<SharePermission> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SharePermission}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SharePermission(Consumer)} instead.
     * @param group group
     * @param id The unique identifier of the share permission.
     * @param project project
     * @param role role
     * @param type The type of share permission:   *  {@code user} Shared with a user.  *  {@code group} Shared with a group. If set in a request, then specify {@code sharePermission.group} as well.  *  {@code project} Shared with a project. If set in a request, then specify {@code sharePermission.project} as well.  *  {@code projectRole} Share with a project role in a project. This value is not returned in responses. It is used in requests, where it needs to be specify with {@code projectId} and {@code projectRoleId}.  *  {@code global} Shared globally. If set in a request, no other {@code sharePermission} properties need to be specified.  *  {@code loggedin} Shared with all logged-in users. Note: This value is set in a request by specifying {@code authenticated} as the {@code type}.  *  {@code project-unknown} Shared with a project that the user does not have access to. Cannot be set in a request.
     * @param user user
     */
    @ApiStatus.Internal
    public SharePermission(SharePermissionGroup group, Long id, SharePermissionProject project, SharePermissionRole role, TypeEnum type, SharePermissionUser user) {
        this.group = group;
        this.id = id;
        this.project = project;
        this.role = role;
        this.type = type;
        this.user = user;
    }

    /**
     * The type of share permission:
     *  *
     * {@code user} Shared with a user.
     * *
     * {@code group} Shared with a group. If set in a request, then specify {@code sharePermission.group} as well.
     * *
     * {@code project} Shared with a project. If set in a request, then specify {@code sharePermission.project} as well.
     * *
     * {@code projectRole} Share with a project role in a project. This value is not returned in responses. It is used in requests, where it needs to be specify with {@code projectId} and {@code projectRoleId}.
     * *
     * {@code global} Shared globally. If set in a request, no other {@code sharePermission} properties need to be specified.
     * *
     * {@code loggedin} Shared with all logged-in users. Note: This value is set in a request by specifying {@code authenticated} as the {@code type}.
     * *
     * {@code project-unknown} Shared with a project that the user does not have access to. Cannot be set in a request.
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

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
