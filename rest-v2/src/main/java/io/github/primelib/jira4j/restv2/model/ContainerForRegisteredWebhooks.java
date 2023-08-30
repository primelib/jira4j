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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContainerForRegisteredWebhooks
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
    "webhookRegistrationResult"
})
@JsonTypeName("ContainerForRegisteredWebhooks")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContainerForRegisteredWebhooks {

    /**
     * A list of registered webhooks.
     */
    @JsonProperty("webhookRegistrationResult")
    protected List<RegisteredWebhook> webhookRegistrationResult;

    /**
     * Constructs a validated instance of {@link ContainerForRegisteredWebhooks}.
     *
     * @param spec the specification to process
     */
    public ContainerForRegisteredWebhooks(Consumer<ContainerForRegisteredWebhooks> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContainerForRegisteredWebhooks}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContainerForRegisteredWebhooks(Consumer)} instead.
     * @param webhookRegistrationResult A list of registered webhooks.
     */
    @ApiStatus.Internal
    public ContainerForRegisteredWebhooks(List<RegisteredWebhook> webhookRegistrationResult) {
        this.webhookRegistrationResult = webhookRegistrationResult;
    }

}
