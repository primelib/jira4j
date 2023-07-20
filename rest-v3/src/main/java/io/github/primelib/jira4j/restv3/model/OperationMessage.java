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
 * OperationMessage
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "message",
    "statusCode"
})
@JsonTypeName("OperationMessage")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OperationMessage {

    /**
     * Constructs a validated implementation of {@link OperationMessage}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OperationMessage(Consumer<OperationMessage> spec) {
        spec.accept(this);
    }

    /**
     * The human-readable message that describes the result.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * The status code of the response.
     */
    @JsonProperty("statusCode")
    protected Integer statusCode;


}
