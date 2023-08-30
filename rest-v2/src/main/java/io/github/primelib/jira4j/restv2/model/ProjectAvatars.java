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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectAvatars
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
    "custom",
    "system"
})
@JsonTypeName("ProjectAvatars")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectAvatars {

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

    /**
     * Constructs a validated instance of {@link ProjectAvatars}.
     *
     * @param spec the specification to process
     */
    public ProjectAvatars(Consumer<ProjectAvatars> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectAvatars}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectAvatars(Consumer)} instead.
     * @param custom List of avatars added to Jira. These avatars may be deleted.
     * @param system List of avatars included with Jira. These avatars cannot be deleted.
     */
    @ApiStatus.Internal
    public ProjectAvatars(List<Avatar> custom, List<Avatar> system) {
        this.custom = custom;
        this.system = system;
    }

}
