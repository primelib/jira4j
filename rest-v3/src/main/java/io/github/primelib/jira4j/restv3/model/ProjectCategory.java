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

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectCategory
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
@JsonTypeName("ProjectCategory")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectCategory {

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

    /**
     * Constructs a validated instance of {@link ProjectCategory}.
     *
     * @param spec the specification to process
     */
    public ProjectCategory(Consumer<ProjectCategory> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectCategory}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectCategory(Consumer)} instead.
     * @param description The description of the project category.
     * @param id The ID of the project category.
     * @param name The name of the project category. Required on create, optional on update.
     * @param self The URL of the project category.
     */
    @ApiStatus.Internal
    public ProjectCategory(String description, String id, String name, URI self) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.self = self;
    }

}
