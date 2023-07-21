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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RegisteredWebhook
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
    "createdWebhookId",
    "errors"
})
@JsonTypeName("RegisteredWebhook")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RegisteredWebhook {

    /**
     * The ID of the webhook. Returned if the webhook is created.
     */
    @JsonProperty("createdWebhookId")
    protected Long createdWebhookId;

    /**
     * Error messages specifying why the webhook creation failed.
     */
    @JsonProperty("errors")
    protected List<String> errors;

    /**
     * Constructs a validated instance of {@link RegisteredWebhook}.
     *
     * @param spec the specification to process
     */
    public RegisteredWebhook(Consumer<RegisteredWebhook> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RegisteredWebhook}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RegisteredWebhook(Consumer)} instead.
     * @param createdWebhookId The ID of the webhook. Returned if the webhook is created.
     * @param errors Error messages specifying why the webhook creation failed.
     */
    @ApiStatus.Internal
    public RegisteredWebhook(Long createdWebhookId, List<String> errors) {
        this.createdWebhookId = createdWebhookId;
        this.errors = errors;
    }

}
