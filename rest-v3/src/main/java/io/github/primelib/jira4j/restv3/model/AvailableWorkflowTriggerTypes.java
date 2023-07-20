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
 * AvailableWorkflowTriggerTypes
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "name",
    "type"
})
@JsonTypeName("AvailableWorkflowTriggerTypes")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AvailableWorkflowTriggerTypes {

    /**
     * Constructs a validated implementation of {@link AvailableWorkflowTriggerTypes}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AvailableWorkflowTriggerTypes(Consumer<AvailableWorkflowTriggerTypes> spec) {
        spec.accept(this);
    }

    /**
     * The description of the trigger rule.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the trigger rule.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The type identifier of trigger rule.
     */
    @JsonProperty("type")
    protected String type;


}
