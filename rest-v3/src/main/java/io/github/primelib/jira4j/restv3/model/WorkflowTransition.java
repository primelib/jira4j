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
 * WorkflowTransition
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
    "id",
    "name"
})
@JsonTypeName("WorkflowTransition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowTransition {

    /**
     * The transition ID.
     */
    @JsonProperty("id")
    protected Integer id;

    /**
     * The transition name.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link WorkflowTransition}.
     *
     * @param spec the specification to process
     */
    public WorkflowTransition(Consumer<WorkflowTransition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowTransition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowTransition(Consumer)} instead.
     * @param id The transition ID.
     * @param name The transition name.
     */
    @ApiStatus.Internal
    public WorkflowTransition(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

}
