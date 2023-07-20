package io.github.primelib.jira4j.restv3.model;

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
 * ProjectCategory
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
@JsonTypeName("ProjectCategory")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectCategory {

    /**
     * Constructs a validated implementation of {@link ProjectCategory}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectCategory(Consumer<ProjectCategory> spec) {
        spec.accept(this);
    }

    /**
     * The description of the project category.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the project category.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the project category. Required on create, optional on update.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URL of the project category.
     */
    @JsonProperty("self")
    protected URI self;


}
