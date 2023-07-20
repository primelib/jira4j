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
 * WorkflowLayout
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "x",
    "y"
})
@JsonTypeName("WorkflowLayout")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowLayout {

    /**
     * Constructs a validated implementation of {@link WorkflowLayout}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowLayout(Consumer<WorkflowLayout> spec) {
        spec.accept(this);
    }

    /**
     * The x axis location.
     */
    @JsonProperty("x")
    protected Double x;

    /**
     * The y axis location.
     */
    @JsonProperty("y")
    protected Double y;


}
