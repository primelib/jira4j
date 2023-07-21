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

import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowRulesSearch
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
    "expand",
    "ruleIds",
    "workflowEntityId"
})
@JsonTypeName("WorkflowRulesSearch")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowRulesSearch {

    /**
     * Use expand to include additional information in the response. This parameter accepts {@code transition} which, for each rule, returns information about the transition the rule is assigned to.
     */
    @JsonProperty("expand")
    protected String expand;

    /**
     * The list of workflow rule IDs.
     */
    @JsonProperty("ruleIds")
    protected List<UUID> ruleIds;

    /**
     * The workflow ID.
     */
    @JsonProperty("workflowEntityId")
    protected UUID workflowEntityId;

    /**
     * Constructs a validated instance of {@link WorkflowRulesSearch}.
     *
     * @param spec the specification to process
     */
    public WorkflowRulesSearch(Consumer<WorkflowRulesSearch> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowRulesSearch}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowRulesSearch(Consumer)} instead.
     * @param expand Use expand to include additional information in the response. This parameter accepts {@code transition} which, for each rule, returns information about the transition the rule is assigned to.
     * @param ruleIds The list of workflow rule IDs.
     * @param workflowEntityId The workflow ID.
     */
    @ApiStatus.Internal
    public WorkflowRulesSearch(String expand, List<UUID> ruleIds, UUID workflowEntityId) {
        this.expand = expand;
        this.ruleIds = ruleIds;
        this.workflowEntityId = workflowEntityId;
    }

}
