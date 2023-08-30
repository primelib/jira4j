package io.github.primelib.jira4j.restv2.model;

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
 * WorkflowId
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
    "draft",
    "name"
})
@JsonTypeName("WorkflowId")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowId {

    /**
     * Whether the workflow is in the draft state.
     */
    @JsonProperty("draft")
    protected Boolean draft;

    /**
     * The name of the workflow.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link WorkflowId}.
     *
     * @param spec the specification to process
     */
    public WorkflowId(Consumer<WorkflowId> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowId}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowId(Consumer)} instead.
     * @param draft Whether the workflow is in the draft state.
     * @param name The name of the workflow.
     */
    @ApiStatus.Internal
    public WorkflowId(Boolean draft, String name) {
        this.draft = draft;
        this.name = name;
    }

}
