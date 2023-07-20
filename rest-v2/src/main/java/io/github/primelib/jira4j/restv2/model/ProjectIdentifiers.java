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
 * ProjectIdentifiers
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "key",
    "self"
})
@JsonTypeName("ProjectIdentifiers")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectIdentifiers {

    /**
     * Constructs a validated implementation of {@link ProjectIdentifiers}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectIdentifiers(Consumer<ProjectIdentifiers> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the created project.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The key of the created project.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The URL of the created project.
     */
    @JsonProperty("self")
    protected URI self;


}
