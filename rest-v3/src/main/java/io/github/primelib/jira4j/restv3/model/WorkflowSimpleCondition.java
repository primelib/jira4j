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
 * WorkflowSimpleCondition
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "configuration",
    "nodeType",
    "type"
})
@JsonTypeName("WorkflowSimpleCondition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowSimpleCondition {

    /**
     * Constructs a validated implementation of {@link WorkflowSimpleCondition}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowSimpleCondition(Consumer<WorkflowSimpleCondition> spec) {
        spec.accept(this);
    }

    /**
     * EXPERIMENTAL. The configuration of the transition rule.
     */
    @JsonProperty("configuration")
    protected Object _configuration;

    @JsonProperty("nodeType")
    protected String nodeType;

    /**
     * The type of the transition rule.
     */
    @JsonProperty("type")
    protected String type;


}
