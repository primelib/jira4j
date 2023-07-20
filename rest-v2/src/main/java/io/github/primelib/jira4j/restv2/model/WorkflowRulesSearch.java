package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowRulesSearch
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "expand",
    "ruleIds",
    "workflowEntityId"
})
@JsonTypeName("WorkflowRulesSearch")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowRulesSearch {

    /**
     * Constructs a validated implementation of {@link WorkflowRulesSearch}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowRulesSearch(Consumer<WorkflowRulesSearch> spec) {
        spec.accept(this);
    }

    /**
     * Use expand to include additional information in the response. This parameter accepts `transition` which, for each rule, returns information about the transition the rule is assigned to.
     */
    @JsonProperty("expand")
    protected String expand;

    /**
     * The list of workflow rule IDs.
     */
    @JsonProperty("ruleIds")
    protected List<UUID> ruleIds = new ArrayList<>();

    /**
     * The workflow ID.
     */
    @JsonProperty("workflowEntityId")
    protected UUID workflowEntityId;


}
