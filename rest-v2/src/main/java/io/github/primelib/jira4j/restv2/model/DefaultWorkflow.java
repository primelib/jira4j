package io.github.primelib.jira4j.restv2.model;

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
 * DefaultWorkflow
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "updateDraftIfNeeded",
    "workflow"
})
@JsonTypeName("DefaultWorkflow")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DefaultWorkflow {

    /**
     * Constructs a validated implementation of {@link DefaultWorkflow}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DefaultWorkflow(Consumer<DefaultWorkflow> spec) {
        spec.accept(this);
    }

    /**
     * Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new default workflow. Defaults to `false`.
     */
    @JsonProperty("updateDraftIfNeeded")
    protected Boolean updateDraftIfNeeded;

    /**
     * The name of the workflow to set as the default workflow.
     */
    @JsonProperty("workflow")
    protected String workflow;


}
