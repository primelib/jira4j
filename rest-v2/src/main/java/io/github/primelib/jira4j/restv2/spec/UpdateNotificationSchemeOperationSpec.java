package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Notification;
import io.github.primelib.jira4j.restv2.model.NotificationScheme;
import java.util.Set;
import io.github.primelib.jira4j.restv2.model.UpdateNotificationSchemeDetails;
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
 * UpdateNotificationSchemeSpec
 * <p>
 * Specification for the UpdateNotificationScheme operation.
 * <p>
 * Update notification scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateNotificationSchemeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the notification scheme.
     */
    @NotNull 
    private String id;

    /**
     */
    @NotNull 
    private UpdateNotificationSchemeDetails updateNotificationSchemeDetails;

    /**
     * Constructs a validated instance of {@link UpdateNotificationSchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateNotificationSchemeOperationSpec(Consumer<UpdateNotificationSchemeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateNotificationSchemeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the notification scheme.
     * @param updateNotificationSchemeDetails 
     */
    @ApiStatus.Internal
    public UpdateNotificationSchemeOperationSpec(String id, UpdateNotificationSchemeDetails updateNotificationSchemeDetails) {
        this.id = id;
        this.updateNotificationSchemeDetails = updateNotificationSchemeDetails;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(updateNotificationSchemeDetails, "updateNotificationSchemeDetails is a required parameter!");
    }
}
