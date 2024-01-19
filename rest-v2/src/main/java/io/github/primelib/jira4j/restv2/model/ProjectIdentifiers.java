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

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectIdentifiers
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
    "id",
    "key",
    "self"
})
@JsonTypeName("ProjectIdentifiers")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectIdentifiers {

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

    /**
     * Constructs a validated instance of {@link ProjectIdentifiers}.
     *
     * @param spec the specification to process
     */
    public ProjectIdentifiers(Consumer<ProjectIdentifiers> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectIdentifiers}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectIdentifiers(Consumer)} instead.
     * @param id The ID of the created project.
     * @param key The key of the created project.
     * @param self The URL of the created project.
     */
    @ApiStatus.Internal
    public ProjectIdentifiers(Long id, String key, URI self) {
        this.id = id;
        this.key = key;
        this.self = self;
    }

}
