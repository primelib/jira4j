package io.github.primelib.jira4j.restv2.model;

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
 * ProjectRoleDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "admin",
    "default",
    "description",
    "id",
    "name",
    "roleConfigurable",
    "scope",
    "self",
    "translatedName"
})
@JsonTypeName("ProjectRoleDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectRoleDetails {

    /**
     * Constructs a validated implementation of {@link ProjectRoleDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectRoleDetails(Consumer<ProjectRoleDetails> spec) {
        spec.accept(this);
    }

    /**
     * Whether this role is the admin role for the project.
     */
    @JsonProperty("admin")
    protected Boolean admin;

    /**
     * Whether this role is the default role for the project.
     */
    @JsonProperty("default")
    protected Boolean _default;

    /**
     * The description of the project role.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the project role.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The name of the project role.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Whether the roles are configurable for this project.
     */
    @JsonProperty("roleConfigurable")
    protected Boolean roleConfigurable;

    @JsonProperty("scope")
    protected ProjectRoleScope scope;

    /**
     * The URL the project role details.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * The translated name of the project role.
     */
    @JsonProperty("translatedName")
    protected String translatedName;


}
