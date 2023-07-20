package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueFieldOptionScopeBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "global",
    "projects",
    "projects2"
})
@JsonTypeName("IssueFieldOptionScopeBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueFieldOptionScopeBean {

    /**
     * Constructs a validated implementation of {@link IssueFieldOptionScopeBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueFieldOptionScopeBean(Consumer<IssueFieldOptionScopeBean> spec) {
        spec.accept(this);
    }

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


}
