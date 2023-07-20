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
 * ProjectDetailsProjectCategory
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "name",
    "self"
})
@JsonTypeName("ProjectDetails_projectCategory")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectDetailsProjectCategory {

    /**
     * Constructs a validated implementation of {@link ProjectDetailsProjectCategory}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectDetailsProjectCategory(Consumer<ProjectDetailsProjectCategory> spec) {
        spec.accept(this);
    }

    /**
     * The name of the project category.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the project category.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The description of the project category.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URL of the project category.
     */
    @JsonProperty("self")
    protected String self;


}
