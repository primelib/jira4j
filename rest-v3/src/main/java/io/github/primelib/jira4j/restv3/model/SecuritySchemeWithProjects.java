package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SecuritySchemeWithProjects
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
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
public class SecuritySchemeWithProjects extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link SecuritySchemeWithProjects}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SecuritySchemeWithProjects(Consumer<SecuritySchemeWithProjects> spec) {
        spec.accept(this);
    }

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


}
