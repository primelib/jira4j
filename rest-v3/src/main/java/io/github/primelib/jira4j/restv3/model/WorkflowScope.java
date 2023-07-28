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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * WorkflowScope
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
    "project",
    "type"
})
@JsonTypeName("WorkflowScope")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowScope {

    @JsonProperty("project")
    protected ProjectId project;

    /**
     * The scope of the workflow. {@code GLOBAL} for company-managed projects and {@code PROJECT} for team-managed projects.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link WorkflowScope}.
     *
     * @param spec the specification to process
     */
    public WorkflowScope(Consumer<WorkflowScope> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowScope}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowScope(Consumer)} instead.
     * @param project var.name
     * @param type The scope of the workflow. {@code GLOBAL} for company-managed projects and {@code PROJECT} for team-managed projects.
     */
    @ApiStatus.Internal
    public WorkflowScope(ProjectId project, TypeEnum type) {
        this.project = project;
        this.type = type;
    }

    /**
     * The scope of the workflow. {@code GLOBAL} for company-managed projects and {@code PROJECT} for team-managed projects.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        PROJECT("PROJECT"),
        GLOBAL("GLOBAL");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
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
