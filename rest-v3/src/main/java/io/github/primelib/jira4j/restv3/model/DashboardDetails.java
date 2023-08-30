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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DashboardDetails
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
    "description",
    "editPermissions",
    "name",
    "sharePermissions"
})
@JsonTypeName("DashboardDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DashboardDetails {

    /**
     * The description of the dashboard.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The edit permissions for the dashboard.
     */
    @JsonProperty("editPermissions")
    protected List<SharePermission> editPermissions;

    /**
     * The name of the dashboard.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The share permissions for the dashboard.
     */
    @JsonProperty("sharePermissions")
    protected List<SharePermission> sharePermissions;

    /**
     * Constructs a validated instance of {@link DashboardDetails}.
     *
     * @param spec the specification to process
     */
    public DashboardDetails(Consumer<DashboardDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DashboardDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DashboardDetails(Consumer)} instead.
     * @param description The description of the dashboard.
     * @param editPermissions The edit permissions for the dashboard.
     * @param name The name of the dashboard.
     * @param sharePermissions The share permissions for the dashboard.
     */
    @ApiStatus.Internal
    public DashboardDetails(String description, List<SharePermission> editPermissions, String name, List<SharePermission> sharePermissions) {
        this.description = description;
        this.editPermissions = editPermissions;
        this.name = name;
        this.sharePermissions = sharePermissions;
    }

}
