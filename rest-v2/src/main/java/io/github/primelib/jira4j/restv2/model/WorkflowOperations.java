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
 * WorkflowOperations
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
    "canDelete",
    "canEdit"
})
@JsonTypeName("WorkflowOperations")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowOperations {

    /**
     * Whether the workflow can be deleted.
     */
    @JsonProperty("canDelete")
    protected Boolean canDelete;

    /**
     * Whether the workflow can be updated.
     */
    @JsonProperty("canEdit")
    protected Boolean canEdit;

    /**
     * Constructs a validated instance of {@link WorkflowOperations}.
     *
     * @param spec the specification to process
     */
    public WorkflowOperations(Consumer<WorkflowOperations> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowOperations}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowOperations(Consumer)} instead.
     * @param canDelete Whether the workflow can be deleted.
     * @param canEdit Whether the workflow can be updated.
     */
    @ApiStatus.Internal
    public WorkflowOperations(Boolean canDelete, Boolean canEdit) {
        this.canDelete = canDelete;
        this.canEdit = canEdit;
    }

}
