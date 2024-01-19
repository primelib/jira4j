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
 * IssueFieldOptionScopeBean
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
@JsonTypeName("IssueFieldOptionScopeBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueFieldOptionScopeBean {

    @JsonProperty("global")
    protected GlobalScopeBean global;

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
     * Constructs a validated instance of {@link IssueFieldOptionScopeBean}.
     *
     * @param spec the specification to process
     */
    public IssueFieldOptionScopeBean(Consumer<IssueFieldOptionScopeBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueFieldOptionScopeBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueFieldOptionScopeBean(Consumer)} instead.
     * @param global global
     * @param projects DEPRECATED
     * @param projects2 Defines the projects in which the option is available and the behavior of the option within each project. Specify one object per project. The behavior of the option in a project context overrides the behavior in the global context.
     */
    @ApiStatus.Internal
    public IssueFieldOptionScopeBean(GlobalScopeBean global, Set<Long> projects, Set<ProjectScopeBean> projects2) {
        this.global = global;
        this.projects = projects;
        this.projects2 = projects2;
    }

}
