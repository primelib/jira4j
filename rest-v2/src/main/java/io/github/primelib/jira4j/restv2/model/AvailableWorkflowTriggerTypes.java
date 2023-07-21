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
 * AvailableWorkflowTriggerTypes
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
    "description",
    "name",
    "type"
})
@JsonTypeName("AvailableWorkflowTriggerTypes")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AvailableWorkflowTriggerTypes {

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

    /**
     * Constructs a validated instance of {@link AvailableWorkflowTriggerTypes}.
     *
     * @param spec the specification to process
     */
    public AvailableWorkflowTriggerTypes(Consumer<AvailableWorkflowTriggerTypes> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AvailableWorkflowTriggerTypes}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AvailableWorkflowTriggerTypes(Consumer)} instead.
     * @param description The description of the trigger rule.
     * @param name The name of the trigger rule.
     * @param type The type identifier of trigger rule.
     */
    @ApiStatus.Internal
    public AvailableWorkflowTriggerTypes(String description, String name, String type) {
        this.description = description;
        this.name = name;
        this.type = type;
    }

}
