package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DashboardDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link DashboardDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DashboardDetails(Consumer<DashboardDetails> spec) {
        spec.accept(this);
    }

    /**
     * The description of the dashboard.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The edit permissions for the dashboard.
     */
    @JsonProperty("editPermissions")
    protected List<SharePermission> editPermissions = new ArrayList<>();

    /**
     * The name of the dashboard.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The share permissions for the dashboard.
     */
    @JsonProperty("sharePermissions")
    protected List<SharePermission> sharePermissions = new ArrayList<>();


}
