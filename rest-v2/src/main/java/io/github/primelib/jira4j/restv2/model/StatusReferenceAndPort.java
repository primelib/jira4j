package io.github.primelib.jira4j.restv2.model;

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
 * StatusReferenceAndPort
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "port",
    "statusReference"
})
@JsonTypeName("StatusReferenceAndPort")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusReferenceAndPort {

    /**
     * Constructs a validated implementation of {@link StatusReferenceAndPort}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public StatusReferenceAndPort(Consumer<StatusReferenceAndPort> spec) {
        spec.accept(this);
    }

    /**
     * The port this transition uses to connect to this status.
     */
    @JsonProperty("port")
    protected Integer port;

    /**
     * The reference of this status.
     */
    @JsonProperty("statusReference")
    protected String statusReference;


}
