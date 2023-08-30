package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Notification;
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
 * NotifySpec
 * <p>
 * Specification for the Notify operation.
 * <p>
 * Send notification for issue
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotifyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * ID or key of the issue that the notification is sent for.
     */
    @NotNull 
    private String issueIdOrKey;

    /**
     * The request object for the notification and recipients.
     */
    @NotNull 
    private Notification notification;

    /**
     * Constructs a validated instance of {@link NotifyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NotifyOperationSpec(Consumer<NotifyOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link NotifyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueIdOrKey         ID or key of the issue that the notification is sent for.
     * @param notification         The request object for the notification and recipients.
     */
    @ApiStatus.Internal
    public NotifyOperationSpec(String issueIdOrKey, Notification notification) {
        this.issueIdOrKey = issueIdOrKey;
        this.notification = notification;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(issueIdOrKey, "issueIdOrKey is a required parameter!");
        Objects.requireNonNull(notification, "notification is a required parameter!");
    }
}
