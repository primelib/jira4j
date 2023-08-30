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
 * OperationMessage
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
    "message",
    "statusCode"
})
@JsonTypeName("OperationMessage")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OperationMessage {

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

    /**
     * Constructs a validated instance of {@link OperationMessage}.
     *
     * @param spec the specification to process
     */
    public OperationMessage(Consumer<OperationMessage> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OperationMessage}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OperationMessage(Consumer)} instead.
     * @param message The human-readable message that describes the result.
     * @param statusCode The status code of the response.
     */
    @ApiStatus.Internal
    public OperationMessage(String message, Integer statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

}
