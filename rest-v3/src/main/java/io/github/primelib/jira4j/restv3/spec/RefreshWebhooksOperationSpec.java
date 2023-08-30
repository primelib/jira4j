package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.ContainerForWebhookIDs;
import java.util.Set;
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
 * RefreshWebhooksSpec
 * <p>
 * Specification for the RefreshWebhooks operation.
 * <p>
 * Extend webhook life
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RefreshWebhooksOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private ContainerForWebhookIDs containerForWebhookIDs;

    /**
     * Constructs a validated instance of {@link RefreshWebhooksOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RefreshWebhooksOperationSpec(Consumer<RefreshWebhooksOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link RefreshWebhooksOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param containerForWebhookIDs 
     */
    @ApiStatus.Internal
    public RefreshWebhooksOperationSpec(ContainerForWebhookIDs containerForWebhookIDs) {
        this.containerForWebhookIDs = containerForWebhookIDs;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(containerForWebhookIDs, "containerForWebhookIDs is a required parameter!");
    }
}
