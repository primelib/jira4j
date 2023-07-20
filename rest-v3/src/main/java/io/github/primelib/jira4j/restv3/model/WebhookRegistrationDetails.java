package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookRegistrationDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "url",
    "webhooks"
})
@JsonTypeName("WebhookRegistrationDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhookRegistrationDetails {

    /**
     * Constructs a validated implementation of {@link WebhookRegistrationDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebhookRegistrationDetails(Consumer<WebhookRegistrationDetails> spec) {
        spec.accept(this);
    }

    /**
     * The URL that specifies where to send the webhooks. This URL must use the same base URL as the Connect app. Only a single URL per app is allowed to be registered.
     */
    @JsonProperty("url")
    protected String url;

    /**
     * A list of webhooks.
     */
    @JsonProperty("webhooks")
    protected List<WebhookDetails> webhooks = new ArrayList<>();


}
