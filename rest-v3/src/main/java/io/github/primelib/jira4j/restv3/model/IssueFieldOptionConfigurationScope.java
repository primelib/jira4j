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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueFieldOptionConfigurationScope
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
    "global",
    "projects",
    "projects2"
})
@JsonTypeName("IssueFieldOptionConfiguration_scope")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueFieldOptionConfigurationScope {

    @JsonProperty("global")
    protected IssueFieldOptionScopeBeanGlobal global;

    /**
     * DEPRECATED
     */
    @JsonProperty("projects")
    protected Set<Long> projects;

    /**
     * Defines the projects in which the option is available and the behavior of the option within each project. Specify one object per project. The behavior of the option in a project context overrides the behavior in the global context.
     */
    @JsonProperty("projects2")
    protected Set<ProjectScopeBean> projects2;

    /**
     * Constructs a validated instance of {@link IssueFieldOptionConfigurationScope}.
     *
     * @param spec the specification to process
     */
    public IssueFieldOptionConfigurationScope(Consumer<IssueFieldOptionConfigurationScope> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueFieldOptionConfigurationScope}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueFieldOptionConfigurationScope(Consumer)} instead.
     * @param global var.name
     * @param projects DEPRECATED
     * @param projects2 Defines the projects in which the option is available and the behavior of the option within each project. Specify one object per project. The behavior of the option in a project context overrides the behavior in the global context.
     */
    @ApiStatus.Internal
    public IssueFieldOptionConfigurationScope(IssueFieldOptionScopeBeanGlobal global, Set<Long> projects, Set<ProjectScopeBean> projects2) {
        this.global = global;
        this.projects = projects;
        this.projects2 = projects2;
    }

}
