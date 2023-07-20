package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Scope
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "project",
    "type"
})
@JsonTypeName("Scope")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Scope extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link Scope}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Scope(Consumer<Scope> spec) {
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
