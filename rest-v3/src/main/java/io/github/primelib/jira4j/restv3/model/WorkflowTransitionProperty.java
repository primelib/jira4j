package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
 * WorkflowTransitionProperty
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "id",
    "key",
    "value"
})
@JsonTypeName("WorkflowTransitionProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowTransitionProperty extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link WorkflowTransitionProperty}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowTransitionProperty(Consumer<WorkflowTransitionProperty> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the transition property.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The key of the transition property. Also known as the name of the transition property.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The value of the transition property.
     */
    @JsonProperty("value")
    protected String value;


}
