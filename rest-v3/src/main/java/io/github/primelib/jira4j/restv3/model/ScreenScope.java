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
 * ScreenScope
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
@JsonTypeName("Screen_scope")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScreenScope {

    /**
     * Constructs a validated implementation of {@link ScreenScope}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ScreenScope(Consumer<ScreenScope> spec) {
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
