package io.github.primelib.jira4j.restv3.model;

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
 * StatusScope
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
@JsonTypeName("StatusScope")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusScope {

    /**
     * Constructs a validated implementation of {@link StatusScope}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public StatusScope(Consumer<StatusScope> spec) {
        spec.accept(this);
    }

    @JsonProperty("project")
    protected ProjectId project;

    /**
     * The scope of the status. `GLOBAL` for company-managed projects and `PROJECT` for team-managed projects.
     */
    @JsonProperty("type")
    protected TypeEnum type;


    /**
     * The scope of the status. `GLOBAL` for company-managed projects and `PROJECT` for team-managed projects.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        PROJECT("PROJECT"),
        GLOBAL("GLOBAL");

        private final String value;
    }

}
