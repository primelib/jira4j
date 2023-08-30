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
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PermissionDetails
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
    "editPermissions",
    "sharePermissions"
})
@JsonTypeName("PermissionDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PermissionDetails {

    /**
     * The edit permissions for the shareable entities.
     */
    @JsonProperty("editPermissions")
    protected List<SharePermission> editPermissions;

    /**
     * The share permissions for the shareable entities.
     */
    @JsonProperty("sharePermissions")
    protected List<SharePermission> sharePermissions;

    /**
     * Constructs a validated instance of {@link PermissionDetails}.
     *
     * @param spec the specification to process
     */
    public PermissionDetails(Consumer<PermissionDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PermissionDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PermissionDetails(Consumer)} instead.
     * @param editPermissions The edit permissions for the shareable entities.
     * @param sharePermissions The share permissions for the shareable entities.
     */
    @ApiStatus.Internal
    public PermissionDetails(List<SharePermission> editPermissions, List<SharePermission> sharePermissions) {
        this.editPermissions = editPermissions;
        this.sharePermissions = sharePermissions;
    }

}
