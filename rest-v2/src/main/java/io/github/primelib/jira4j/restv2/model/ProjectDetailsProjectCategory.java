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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectDetailsProjectCategory
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
    "id",
    "name",
    "self"
})
@JsonTypeName("ProjectDetails_projectCategory")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectDetailsProjectCategory {

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

    /**
     * Constructs a validated instance of {@link ProjectDetailsProjectCategory}.
     *
     * @param spec the specification to process
     */
    public ProjectDetailsProjectCategory(Consumer<ProjectDetailsProjectCategory> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectDetailsProjectCategory}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectDetailsProjectCategory(Consumer)} instead.
     * @param description The name of the project category.
     * @param id The ID of the project category.
     * @param name The description of the project category.
     * @param self The URL of the project category.
     */
    @ApiStatus.Internal
    public ProjectDetailsProjectCategory(String description, String id, String name, String self) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.self = self;
    }

}
