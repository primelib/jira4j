package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectAvatars
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "custom",
    "system"
})
@JsonTypeName("ProjectAvatars")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectAvatars {

    /**
     * Constructs a validated implementation of {@link ProjectAvatars}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectAvatars(Consumer<ProjectAvatars> spec) {
        spec.accept(this);
    }

    /**
     * List of avatars added to Jira. These avatars may be deleted.
     */
    @JsonProperty("custom")
    protected List<Avatar> custom;

    /**
     * List of avatars included with Jira. These avatars cannot be deleted.
     */
    @JsonProperty("system")
    protected List<Avatar> system;


}
