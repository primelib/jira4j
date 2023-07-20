package io.github.primelib.jira4j.restv3.model;

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
 * SharePermissionInputBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "accountId",
    "groupId",
    "groupname",
    "projectId",
    "projectRoleId",
    "rights",
    "type"
})
@JsonTypeName("SharePermissionInputBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SharePermissionInputBean {

    /**
     * Constructs a validated implementation of {@link SharePermissionInputBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SharePermissionInputBean(Consumer<SharePermissionInputBean> spec) {
        spec.accept(this);
    }

    /**
     * The user account ID that the filter is shared with. For a request, specify the `accountId` property for the user.
     */
    @JsonProperty("accountId")
    protected String accountId;

    /**
     * The ID of the group, which uniquely identifies the group across all Atlassian products.For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*. Cannot be provided with `groupname`.
     */
    @JsonProperty("groupId")
    protected String groupId;

    /**
     * The name of the group to share the filter with. Set `type` to `group`. Please note that the name of a group is mutable, to reliably identify a group use `groupId`.
     */
    @JsonProperty("groupname")
    protected String groupname;

    /**
     * The ID of the project to share the filter with. Set `type` to `project`.
     */
    @JsonProperty("projectId")
    protected String projectId;

    /**
     * The ID of the project role to share the filter with. Set `type` to `projectRole` and the `projectId` for the project that the role is in.
     */
    @JsonProperty("projectRoleId")
    protected String projectRoleId;

    /**
     * The rights for the share permission.
     */
    @JsonProperty("rights")
    protected Integer rights;

    /**
     * The type of the share permission.Specify the type as follows:
     *  *
     * `user` Share with a user.
     * *
     * `group` Share with a group. Specify `groupname` as well.
     * *
     * `project` Share with a project. Specify `projectId` as well.
     * *
     * `projectRole` Share with a project role in a project. Specify `projectId` and `projectRoleId` as well.
     * *
     * `global` Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
     * *
     * `authenticated` Share with all logged-in users. This shows as `loggedin` in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
     */
    @JsonProperty("type")
    protected TypeEnum type;


    /**
     * The type of the share permission.Specify the type as follows:
     *  *
     * `user` Share with a user.
     * *
     * `group` Share with a group. Specify `groupname` as well.
     * *
     * `project` Share with a project. Specify `projectId` as well.
     * *
     * `projectRole` Share with a project role in a project. Specify `projectId` and `projectRoleId` as well.
     * *
     * `global` Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
     * *
     * `authenticated` Share with all logged-in users. This shows as `loggedin` in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        USER("user"),
        PROJECT("project"),
        GROUP("group"),
        PROJECTROLE("projectRole"),
        GLOBAL("global"),
        AUTHENTICATED("authenticated");

        private final String value;
    }

}
