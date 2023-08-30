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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SharePermissionInputBean
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
     * The user account ID that the filter is shared with. For a request, specify the {@code accountId} property for the user.
     */
    @JsonProperty("accountId")
    protected String accountId;

    /**
     * The ID of the group, which uniquely identifies the group across all Atlassian products.For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*. Cannot be provided with {@code groupname}.
     */
    @JsonProperty("groupId")
    protected String groupId;

    /**
     * The name of the group to share the filter with. Set {@code type} to {@code group}. Please note that the name of a group is mutable, to reliably identify a group use {@code groupId}.
     */
    @JsonProperty("groupname")
    protected String groupname;

    /**
     * The ID of the project to share the filter with. Set {@code type} to {@code project}.
     */
    @JsonProperty("projectId")
    protected String projectId;

    /**
     * The ID of the project role to share the filter with. Set {@code type} to {@code projectRole} and the {@code projectId} for the project that the role is in.
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
     * {@code user} Share with a user.
     * *
     * {@code group} Share with a group. Specify {@code groupname} as well.
     * *
     * {@code project} Share with a project. Specify {@code projectId} as well.
     * *
     * {@code projectRole} Share with a project role in a project. Specify {@code projectId} and {@code projectRoleId} as well.
     * *
     * {@code global} Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
     * *
     * {@code authenticated} Share with all logged-in users. This shows as {@code loggedin} in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link SharePermissionInputBean}.
     *
     * @param spec the specification to process
     */
    public SharePermissionInputBean(Consumer<SharePermissionInputBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SharePermissionInputBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SharePermissionInputBean(Consumer)} instead.
     * @param accountId The user account ID that the filter is shared with. For a request, specify the {@code accountId} property for the user.
     * @param groupId The ID of the group, which uniquely identifies the group across all Atlassian products.For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*. Cannot be provided with {@code groupname}.
     * @param groupname The name of the group to share the filter with. Set {@code type} to {@code group}. Please note that the name of a group is mutable, to reliably identify a group use {@code groupId}.
     * @param projectId The ID of the project to share the filter with. Set {@code type} to {@code project}.
     * @param projectRoleId The ID of the project role to share the filter with. Set {@code type} to {@code projectRole} and the {@code projectId} for the project that the role is in.
     * @param rights The rights for the share permission.
     * @param type The type of the share permission.Specify the type as follows:   *  {@code user} Share with a user.  *  {@code group} Share with a group. Specify {@code groupname} as well.  *  {@code project} Share with a project. Specify {@code projectId} as well.  *  {@code projectRole} Share with a project role in a project. Specify {@code projectId} and {@code projectRoleId} as well.  *  {@code global} Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  {@code authenticated} Share with all logged-in users. This shows as {@code loggedin} in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
     */
    @ApiStatus.Internal
    public SharePermissionInputBean(String accountId, String groupId, String groupname, String projectId, String projectRoleId, Integer rights, TypeEnum type) {
        this.accountId = accountId;
        this.groupId = groupId;
        this.groupname = groupname;
        this.projectId = projectId;
        this.projectRoleId = projectRoleId;
        this.rights = rights;
        this.type = type;
    }

    /**
     * The type of the share permission.Specify the type as follows:
     *  *
     * {@code user} Share with a user.
     * *
     * {@code group} Share with a group. Specify {@code groupname} as well.
     * *
     * {@code project} Share with a project. Specify {@code projectId} as well.
     * *
     * {@code projectRole} Share with a project role in a project. Specify {@code projectId} and {@code projectRoleId} as well.
     * *
     * {@code global} Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
     * *
     * {@code authenticated} Share with all logged-in users. This shows as {@code loggedin} in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        USER("user"),
        PROJECT("project"),
        GROUP("group"),
        PROJECTROLE("projectRole"),
        GLOBAL("global"),
        AUTHENTICATED("authenticated");

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
