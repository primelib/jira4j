package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.WebhookRegistrationDetails;
import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
     * Constructs a validated implementation of {@link RegisterDynamicWebhooksOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(webhookRegistrationDetails, "webhookRegistrationDetails is a required parameter!");
    }

}
