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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * WorkflowCapabilities
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
     * The Connect provided ecosystem rules available.
     */
    @JsonProperty("connectRules")
    protected List<AvailableWorkflowConnectRule> connectRules;

    /**
     * The scope of the workflow capabilities. {@code GLOBAL} for company-managed projects and {@code PROJECT} for team-managed projects.
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
     * Constructs a validated instance of {@link WorkflowCapabilities}.
     *
     * @param spec the specification to process
     */
    public WorkflowCapabilities(Consumer<WorkflowCapabilities> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowCapabilities}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowCapabilities(Consumer)} instead.
     * @param connectRules The Connect provided ecosystem rules available.
     * @param editorScope The scope of the workflow capabilities. {@code GLOBAL} for company-managed projects and {@code PROJECT} for team-managed projects.
     * @param forgeRules The Forge provided ecosystem rules available.
     * @param projectTypes The types of projects that this capability set is available for.
     * @param systemRules The Atlassian provided system rules available.
     * @param triggerRules The trigger rules available.
     */
    @ApiStatus.Internal
    public WorkflowCapabilities(List<AvailableWorkflowConnectRule> connectRules, EditorScopeEnum editorScope, List<AvailableWorkflowForgeRule> forgeRules, ProjectTypesEnum projectTypes, List<AvailableWorkflowSystemRule> systemRules, List<AvailableWorkflowTriggers> triggerRules) {
        this.connectRules = connectRules;
        this.editorScope = editorScope;
        this.forgeRules = forgeRules;
        this.projectTypes = projectTypes;
        this.systemRules = systemRules;
        this.triggerRules = triggerRules;
    }

    /**
     * The scope of the workflow capabilities. {@code GLOBAL} for company-managed projects and {@code PROJECT} for team-managed projects.
     */
    @AllArgsConstructor
    public enum EditorScopeEnum {
        PROJECT("PROJECT"),
        GLOBAL("GLOBAL");

        private static final EditorScopeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static EditorScopeEnum of(String input) {
            if (input != null) {
                for (EditorScopeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
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

        private static final ProjectTypesEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ProjectTypesEnum of(String input) {
            if (input != null) {
                for (ProjectTypesEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
