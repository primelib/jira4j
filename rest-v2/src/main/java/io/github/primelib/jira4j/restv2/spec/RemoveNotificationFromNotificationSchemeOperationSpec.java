package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Notification;
import io.github.primelib.jira4j.restv2.model.NotificationScheme;
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
 * RemoveNotificationFromNotificationSchemeSpec
 * <p>
 * Specification for the RemoveNotificationFromNotificationScheme operation.
 * <p>
 * Remove notification from notification scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link RemoveNotificationFromNotificationSchemeOperationSpec}.
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
     * Constructs a validated instance of {@link RemoveNotificationFromNotificationSchemeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param notificationSchemeId The ID of the notification scheme.
     * @param notificationId       The ID of the notification.
     */
    @ApiStatus.Internal
    public RemoveNotificationFromNotificationSchemeOperationSpec(String notificationSchemeId, String notificationId) {
        this.notificationSchemeId = notificationSchemeId;
        this.notificationId = notificationId;

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
