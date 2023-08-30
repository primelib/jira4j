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
 * WebhooksExpirationDate
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
    "expirationDate"
})
@JsonTypeName("WebhooksExpirationDate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhooksExpirationDate {

    /**
     * The expiration date of all the refreshed webhooks.
     */
    @JsonProperty("expirationDate")
    protected Long expirationDate;

    /**
     * Constructs a validated instance of {@link WebhooksExpirationDate}.
     *
     * @param spec the specification to process
     */
    public WebhooksExpirationDate(Consumer<WebhooksExpirationDate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebhooksExpirationDate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebhooksExpirationDate(Consumer)} instead.
     * @param expirationDate The expiration date of all the refreshed webhooks.
     */
    @ApiStatus.Internal
    public WebhooksExpirationDate(Long expirationDate) {
        this.expirationDate = expirationDate;
    }

}
