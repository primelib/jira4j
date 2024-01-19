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
 * FailedWebhook
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
    "body",
    "failureTime",
    "id",
    "url"
})
@JsonTypeName("FailedWebhook")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FailedWebhook {

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
     * The webhook ID, as sent in the {@code X-Atlassian-Webhook-Identifier} header with the webhook.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The original webhook destination.
     */
    @JsonProperty("url")
    protected String url;

    /**
     * Constructs a validated instance of {@link FailedWebhook}.
     *
     * @param spec the specification to process
     */
    public FailedWebhook(Consumer<FailedWebhook> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FailedWebhook}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FailedWebhook(Consumer)} instead.
     * @param body The webhook body.
     * @param failureTime The time the webhook was added to the list of failed webhooks (that is, the time of the last failed retry).
     * @param id The webhook ID, as sent in the {@code X-Atlassian-Webhook-Identifier} header with the webhook.
     * @param url The original webhook destination.
     */
    @ApiStatus.Internal
    public FailedWebhook(String body, Long failureTime, String id, String url) {
        this.body = body;
        this.failureTime = failureTime;
        this.id = id;
        this.url = url;
    }

}
