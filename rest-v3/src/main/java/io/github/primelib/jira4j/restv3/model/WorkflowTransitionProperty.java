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
 * WorkflowTransitionProperty
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
    "id",
    "key",
    "value"
})
@JsonTypeName("WorkflowTransitionProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowTransitionProperty {

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

    /**
     * Constructs a validated instance of {@link WorkflowTransitionProperty}.
     *
     * @param spec the specification to process
     */
    public WorkflowTransitionProperty(Consumer<WorkflowTransitionProperty> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowTransitionProperty}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowTransitionProperty(Consumer)} instead.
     * @param id The ID of the transition property.
     * @param key The key of the transition property. Also known as the name of the transition property.
     * @param value The value of the transition property.
     */
    @ApiStatus.Internal
    public WorkflowTransitionProperty(String id, String key, String value) {
        this.id = id;
        this.key = key;
        this.value = value;
    }

}
