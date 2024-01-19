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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SecuritySchemeWithProjects
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
    "defaultLevel",
    "description",
    "id",
    "name",
    "projectIds",
    "self"
})
@JsonTypeName("SecuritySchemeWithProjects")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SecuritySchemeWithProjects {

    /**
     * The default level ID of the issue security scheme.
     */
    @JsonProperty("defaultLevel")
    protected Long defaultLevel;

    /**
     * The description of the issue security scheme.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the issue security scheme.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The name of the issue security scheme.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The list of project IDs associated with the issue security scheme.
     */
    @JsonProperty("projectIds")
    protected Set<Long> projectIds;

    /**
     * The URL of the issue security scheme.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * Constructs a validated instance of {@link SecuritySchemeWithProjects}.
     *
     * @param spec the specification to process
     */
    public SecuritySchemeWithProjects(Consumer<SecuritySchemeWithProjects> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SecuritySchemeWithProjects}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SecuritySchemeWithProjects(Consumer)} instead.
     * @param defaultLevel The default level ID of the issue security scheme.
     * @param description The description of the issue security scheme.
     * @param id The ID of the issue security scheme.
     * @param name The name of the issue security scheme.
     * @param projectIds The list of project IDs associated with the issue security scheme.
     * @param self The URL of the issue security scheme.
     */
    @ApiStatus.Internal
    public SecuritySchemeWithProjects(Long defaultLevel, String description, Long id, String name, Set<Long> projectIds, String self) {
        this.defaultLevel = defaultLevel;
        this.description = description;
        this.id = id;
        this.name = name;
        this.projectIds = projectIds;
        this.self = self;
    }

}
