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
 * FailedWebhook
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "body",
    "failureTime",
    "id",
    "url"
})
@JsonTypeName("FailedWebhook")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FailedWebhook {

    /**
     * Constructs a validated implementation of {@link FailedWebhook}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FailedWebhook(Consumer<FailedWebhook> spec) {
        spec.accept(this);
    }

    /**
     * The webhook body.
     */
    @JsonProperty("body")
    protected String body;

    /**
     * The time the webhook was added to the list of failed webhooks (that is, the time of the last failed retry).
     */
    @JsonProperty("failureTime")
    protected Long failureTime;

    /**
     * The webhook ID, as sent in the `X-Atlassian-Webhook-Identifier` header with the webhook.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The original webhook destination.
     */
    @JsonProperty("url")
    protected String url;


}
