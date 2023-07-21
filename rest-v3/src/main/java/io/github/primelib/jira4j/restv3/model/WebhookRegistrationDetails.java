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
 * WebhookRegistrationDetails
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
    "url",
    "webhooks"
})
@JsonTypeName("WebhookRegistrationDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhookRegistrationDetails {

    /**
     * The URL that specifies where to send the webhooks. This URL must use the same base URL as the Connect app. Only a single URL per app is allowed to be registered.
     */
    @JsonProperty("url")
    protected String url;

    /**
     * A list of webhooks.
     */
    @JsonProperty("webhooks")
    protected List<WebhookDetails> webhooks;

    /**
     * Constructs a validated instance of {@link WebhookRegistrationDetails}.
     *
     * @param spec the specification to process
     */
    public WebhookRegistrationDetails(Consumer<WebhookRegistrationDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebhookRegistrationDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebhookRegistrationDetails(Consumer)} instead.
     * @param url The URL that specifies where to send the webhooks. This URL must use the same base URL as the Connect app. Only a single URL per app is allowed to be registered.
     * @param webhooks A list of webhooks.
     */
    @ApiStatus.Internal
    public WebhookRegistrationDetails(String url, List<WebhookDetails> webhooks) {
        this.url = url;
        this.webhooks = webhooks;
    }

}
