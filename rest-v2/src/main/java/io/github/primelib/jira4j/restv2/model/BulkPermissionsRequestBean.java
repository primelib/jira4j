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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BulkPermissionsRequestBean
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
    "globalPermissions",
    "projectPermissions"
})
@JsonTypeName("BulkPermissionsRequestBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkPermissionsRequestBean {

    /**
     * The account ID of a user.
     */
    @JsonProperty("accountId")
    protected String accountId;

    /**
     * Global permissions to look up.
     */
    @JsonProperty("globalPermissions")
    protected Set<String> globalPermissions;

    /**
     * Project permissions with associated projects and issues to look up.
     */
    @JsonProperty("projectPermissions")
    protected Set<BulkProjectPermissions> projectPermissions;

    /**
     * Constructs a validated instance of {@link BulkPermissionsRequestBean}.
     *
     * @param spec the specification to process
     */
    public BulkPermissionsRequestBean(Consumer<BulkPermissionsRequestBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BulkPermissionsRequestBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BulkPermissionsRequestBean(Consumer)} instead.
     * @param accountId The account ID of a user.
     * @param globalPermissions Global permissions to look up.
     * @param projectPermissions Project permissions with associated projects and issues to look up.
     */
    @ApiStatus.Internal
    public BulkPermissionsRequestBean(String accountId, Set<String> globalPermissions, Set<BulkProjectPermissions> projectPermissions) {
        this.accountId = accountId;
        this.globalPermissions = globalPermissions;
        this.projectPermissions = projectPermissions;
    }

}
