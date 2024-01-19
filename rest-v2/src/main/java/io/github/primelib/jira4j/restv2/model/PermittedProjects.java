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
 * PermittedProjects
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
    "projects"
})
@JsonTypeName("PermittedProjects")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PermittedProjects {

    /**
     * A list of projects.
     */
    @JsonProperty("projects")
    protected List<ProjectIdentifierBean> projects;

    /**
     * Constructs a validated instance of {@link PermittedProjects}.
     *
     * @param spec the specification to process
     */
    public PermittedProjects(Consumer<PermittedProjects> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PermittedProjects}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PermittedProjects(Consumer)} instead.
     * @param projects A list of projects.
     */
    @ApiStatus.Internal
    public PermittedProjects(List<ProjectIdentifierBean> projects) {
        this.projects = projects;
    }

}
