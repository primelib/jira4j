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
 * ProjectRoleScope
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
@JsonTypeName("ProjectRole_scope")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectRoleScope {

    /**
     * Constructs a validated implementation of {@link ProjectRoleScope}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectRoleScope(Consumer<ProjectRoleScope> spec) {
        spec.accept(this);
    }

    @JsonProperty("project")
    protected ScopeProject project;

    /**
     * The type of scope.
     */
    @JsonProperty("type")
    protected TypeEnum type;


    /**
     * The type of scope.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        PROJECT("PROJECT"),
        TEMPLATE("TEMPLATE");

        private final String value;
    }

}
