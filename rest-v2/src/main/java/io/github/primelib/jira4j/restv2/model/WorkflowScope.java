package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowScope
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "project",
    "type"
})
@JsonTypeName("WorkflowScope")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowScope {

    /**
     * Constructs a validated implementation of {@link WorkflowScope}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowScope(Consumer<WorkflowScope> spec) {
        spec.accept(this);
    }

    @JsonProperty("project")
    protected ProjectId project;

    /**
     * The scope of the workflow. `GLOBAL` for company-managed projects and `PROJECT` for team-managed projects.
     */
    @JsonProperty("type")
    protected TypeEnum type;


    /**
     * The scope of the workflow. `GLOBAL` for company-managed projects and `PROJECT` for team-managed projects.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        PROJECT("PROJECT"),
        GLOBAL("GLOBAL");

        private final String value;
    }

}
