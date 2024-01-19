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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * BulkEditShareableEntityRequest
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
    "action",
    "changeOwnerDetails",
    "entityIds",
    "extendAdminPermissions",
    "permissionDetails"
})
@JsonTypeName("BulkEditShareableEntityRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkEditShareableEntityRequest {

    /**
     * Allowed action for bulk edit shareable entity
     */
    @JsonProperty("action")
    protected ActionEnum action;

    @JsonProperty("changeOwnerDetails")
    protected BulkChangeOwnerDetails changeOwnerDetails;

    /**
     * The id list of shareable entities to be changed.
     */
    @JsonProperty("entityIds")
    protected Set<Long> entityIds;

    /**
     * Whether the actions are executed by users with Administer Jira global permission.
     */
    @JsonProperty("extendAdminPermissions")
    protected Boolean extendAdminPermissions;

    @JsonProperty("permissionDetails")
    protected PermissionDetails permissionDetails;

    /**
     * Constructs a validated instance of {@link BulkEditShareableEntityRequest}.
     *
     * @param spec the specification to process
     */
    public BulkEditShareableEntityRequest(Consumer<BulkEditShareableEntityRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BulkEditShareableEntityRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BulkEditShareableEntityRequest(Consumer)} instead.
     * @param action Allowed action for bulk edit shareable entity
     * @param changeOwnerDetails changeOwnerDetails
     * @param entityIds The id list of shareable entities to be changed.
     * @param extendAdminPermissions Whether the actions are executed by users with Administer Jira global permission.
     * @param permissionDetails permissionDetails
     */
    @ApiStatus.Internal
    public BulkEditShareableEntityRequest(ActionEnum action, BulkChangeOwnerDetails changeOwnerDetails, Set<Long> entityIds, Boolean extendAdminPermissions, PermissionDetails permissionDetails) {
        this.action = action;
        this.changeOwnerDetails = changeOwnerDetails;
        this.entityIds = entityIds;
        this.extendAdminPermissions = extendAdminPermissions;
        this.permissionDetails = permissionDetails;
    }

    /**
     * Allowed action for bulk edit shareable entity
     */
    @AllArgsConstructor
    public enum ActionEnum {
        CHANGEOWNER("changeOwner"),
        CHANGEPERMISSION("changePermission"),
        ADDPERMISSION("addPermission"),
        REMOVEPERMISSION("removePermission");

        private static final ActionEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ActionEnum of(String input) {
            if (input != null) {
                for (ActionEnum v : VALUES) {
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
