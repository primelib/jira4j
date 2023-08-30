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
 * DefaultWorkflow
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
    "updateDraftIfNeeded",
    "workflow"
})
@JsonTypeName("DefaultWorkflow")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DefaultWorkflow {

    /**
     * Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new default workflow. Defaults to {@code false}.
     */
    @JsonProperty("updateDraftIfNeeded")
    protected Boolean updateDraftIfNeeded;

    /**
     * The name of the workflow to set as the default workflow.
     */
    @JsonProperty("workflow")
    protected String workflow;

    /**
     * Constructs a validated instance of {@link DefaultWorkflow}.
     *
     * @param spec the specification to process
     */
    public DefaultWorkflow(Consumer<DefaultWorkflow> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DefaultWorkflow}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DefaultWorkflow(Consumer)} instead.
     * @param updateDraftIfNeeded Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new default workflow. Defaults to {@code false}.
     * @param workflow The name of the workflow to set as the default workflow.
     */
    @ApiStatus.Internal
    public DefaultWorkflow(Boolean updateDraftIfNeeded, String workflow) {
        this.updateDraftIfNeeded = updateDraftIfNeeded;
        this.workflow = workflow;
    }

}
