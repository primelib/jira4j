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
 * WorkflowStatusAndPort
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
    "port",
    "statusReference"
})
@JsonTypeName("WorkflowStatusAndPort")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowStatusAndPort {

    /**
     * The port the transition is connected to this status.
     */
    @JsonProperty("port")
    protected Integer port;

    /**
     * The reference of this status.
     */
    @JsonProperty("statusReference")
    protected String statusReference;

    /**
     * Constructs a validated instance of {@link WorkflowStatusAndPort}.
     *
     * @param spec the specification to process
     */
    public WorkflowStatusAndPort(Consumer<WorkflowStatusAndPort> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowStatusAndPort}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowStatusAndPort(Consumer)} instead.
     * @param port The port the transition is connected to this status.
     * @param statusReference The reference of this status.
     */
    @ApiStatus.Internal
    public WorkflowStatusAndPort(Integer port, String statusReference) {
        this.port = port;
        this.statusReference = statusReference;
    }

}
