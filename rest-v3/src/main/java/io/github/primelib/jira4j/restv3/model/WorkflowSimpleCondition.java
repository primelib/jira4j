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
 * WorkflowSimpleCondition
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
    "configuration",
    "nodeType",
    "type"
})
@JsonTypeName("WorkflowSimpleCondition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowSimpleCondition {

    /**
     * EXPERIMENTAL. The configuration of the transition rule.
     */
    @JsonProperty("configuration")
    protected Object configuration;

    @JsonProperty("nodeType")
    protected String nodeType;

    /**
     * The type of the transition rule.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link WorkflowSimpleCondition}.
     *
     * @param spec the specification to process
     */
    public WorkflowSimpleCondition(Consumer<WorkflowSimpleCondition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowSimpleCondition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowSimpleCondition(Consumer)} instead.
     * @param configuration EXPERIMENTAL. The configuration of the transition rule.
     * @param nodeType nodeType
     * @param type The type of the transition rule.
     */
    @ApiStatus.Internal
    public WorkflowSimpleCondition(Object configuration, String nodeType, String type) {
        this.configuration = configuration;
        this.nodeType = nodeType;
        this.type = type;
    }

}
