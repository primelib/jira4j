package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWorkflowTransitionRule
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "configuration",
    "type"
})
@JsonTypeName("CreateWorkflowTransitionRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateWorkflowTransitionRule {

    /**
     * Constructs a validated implementation of {@link CreateWorkflowTransitionRule}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateWorkflowTransitionRule(Consumer<CreateWorkflowTransitionRule> spec) {
        spec.accept(this);
    }

    /**
     * EXPERIMENTAL. The configuration of the transition rule.
     */
    @JsonProperty("configuration")
    protected Map<String, Object> _configuration = new HashMap<>();

    /**
     * The type of the transition rule.
     */
    @JsonProperty("type")
    protected String type;


}
