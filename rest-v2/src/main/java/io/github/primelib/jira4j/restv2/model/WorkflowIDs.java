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
 * WorkflowIDs
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
    "entityId",
    "name"
})
@JsonTypeName("WorkflowIDs")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowIDs {

    /**
     * The entity ID of the workflow.
     */
    @JsonProperty("entityId")
    protected String entityId;

    /**
     * The name of the workflow.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link WorkflowIDs}.
     *
     * @param spec the specification to process
     */
    public WorkflowIDs(Consumer<WorkflowIDs> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowIDs}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowIDs(Consumer)} instead.
     * @param entityId The entity ID of the workflow.
     * @param name The name of the workflow.
     */
    @ApiStatus.Internal
    public WorkflowIDs(String entityId, String name) {
        this.entityId = entityId;
        this.name = name;
    }

}
