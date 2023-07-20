package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Notification;
import io.github.primelib.jira4j.restv3.model.NotificationScheme;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * RemoveNotificationFromNotificationSchemeSpec
 * <p>
 * Specification for the RemoveNotificationFromNotificationScheme operation.
 * <p>
 * Remove notification from notification scheme
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoveNotificationFromNotificationSchemeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the notification scheme.
     */
    @NotNull 
    private String notificationSchemeId;

    /**
     * The ID of the notification.
     */
    @NotNull 
    private String notificationId;

    /**
     * Constructs a validated implementation of {@link RemoveNotificationFromNotificationSchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoveNotificationFromNotificationSchemeOperationSpec(Consumer<RemoveNotificationFromNotificationSchemeOperationSpec> spec) {
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
        Objects.requireNonNull(notificationSchemeId, "notificationSchemeId is a required parameter!");
        Objects.requireNonNull(notificationId, "notificationId is a required parameter!");
    }

}
