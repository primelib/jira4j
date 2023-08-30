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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowStatusLayout
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
    "x",
    "y"
})
@JsonTypeName("WorkflowStatusLayout")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowStatusLayout {

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

    /**
     * Constructs a validated instance of {@link WorkflowStatusLayout}.
     *
     * @param spec the specification to process
     */
    public WorkflowStatusLayout(Consumer<WorkflowStatusLayout> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowStatusLayout}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowStatusLayout(Consumer)} instead.
     * @param x The x axis location.
     * @param y The y axis location.
     */
    @ApiStatus.Internal
    public WorkflowStatusLayout(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

}
