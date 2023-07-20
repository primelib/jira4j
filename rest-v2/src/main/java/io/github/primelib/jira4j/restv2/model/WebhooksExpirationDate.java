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
 * WebhooksExpirationDate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "expirationDate"
})
@JsonTypeName("WebhooksExpirationDate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhooksExpirationDate {

    /**
     * Constructs a validated implementation of {@link WebhooksExpirationDate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebhooksExpirationDate(Consumer<WebhooksExpirationDate> spec) {
        spec.accept(this);
    }

    /**
     * The expiration date of all the refreshed webhooks.
     */
    @JsonProperty("expirationDate")
    protected Long expirationDate;


}
