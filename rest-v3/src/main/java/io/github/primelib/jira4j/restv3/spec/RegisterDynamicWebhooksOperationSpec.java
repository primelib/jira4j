package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv3.model.WebhookRegistrationDetails;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * RegisterDynamicWebhooksSpec
 * <p>
 * Specification for the RegisterDynamicWebhooks operation.
 * <p>
 * Register dynamic webhooks
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RegisterDynamicWebhooksOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private WebhookRegistrationDetails webhookRegistrationDetails;

    /**
     * Constructs a validated instance of {@link RegisterDynamicWebhooksOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RegisterDynamicWebhooksOperationSpec(Consumer<RegisterDynamicWebhooksOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link RegisterDynamicWebhooksOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param webhookRegistrationDetails 
     */
    @ApiStatus.Internal
    public RegisterDynamicWebhooksOperationSpec(WebhookRegistrationDetails webhookRegistrationDetails) {
        this.webhookRegistrationDetails = webhookRegistrationDetails;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(webhookRegistrationDetails, "webhookRegistrationDetails is a required parameter!");
    }
}
