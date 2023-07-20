package io.github.primelib.jira4j.restv3.model;

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
 * WorkflowCapabilities
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "connectRules",
    "editorScope",
    "forgeRules",
    "projectTypes",
    "systemRules",
    "triggerRules"
})
@JsonTypeName("WorkflowCapabilities")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowCapabilities {

    /**
     * Constructs a validated implementation of {@link WorkflowCapabilities}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowCapabilities(Consumer<WorkflowCapabilities> spec) {
        spec.accept(this);
    }

    /**
     * The Connect provided ecosystem rules available.
     */
    @JsonProperty("connectRules")
    protected List<AvailableWorkflowConnectRule> connectRules;

    /**
     * The scope of the workflow capabilities. `GLOBAL` for company-managed projects and `PROJECT` for team-managed projects.
     */
    @JsonProperty("editorScope")
    protected EditorScopeEnum editorScope;

    /**
     * The Forge provided ecosystem rules available.
     */
    @JsonProperty("forgeRules")
    protected List<AvailableWorkflowForgeRule> forgeRules;

    /**
     * The types of projects that this capability set is available for.
     */
    @JsonProperty("projectTypes")
    protected ProjectTypesEnum projectTypes;

    /**
     * The Atlassian provided system rules available.
     */
    @JsonProperty("systemRules")
    protected List<AvailableWorkflowSystemRule> systemRules;

    /**
     * The trigger rules available.
     */
    @JsonProperty("triggerRules")
    protected List<AvailableWorkflowTriggers> triggerRules;


    /**
     * The scope of the workflow capabilities. `GLOBAL` for company-managed projects and `PROJECT` for team-managed projects.
     */
    @AllArgsConstructor
    public enum EditorScopeEnum {
        PROJECT("PROJECT"),
        GLOBAL("GLOBAL");

        private final String value;
    }

    /**
     * The types of projects that this capability set is available for.
     */
    @AllArgsConstructor
    public enum ProjectTypesEnum {
        SOFTWARE("software"),
        SERVICE_DESK("service_desk"),
        PRODUCT_DISCOVERY("product_discovery"),
        BUSINESS("business"),
        UNKNOWN("unknown");

        private final String value;
    }

}
