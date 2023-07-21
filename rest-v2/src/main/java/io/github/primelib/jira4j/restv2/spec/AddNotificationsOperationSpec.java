package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.AddNotificationsDetails;
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
 * AddNotificationsSpec
 * <p>
 * Specification for the AddNotifications operation.
 * <p>
 * Add notifications to notification scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddNotificationsOperationSpec {
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
    private AddNotificationsDetails addNotificationsDetails;

    /**
     * Constructs a validated instance of {@link AddNotificationsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddNotificationsOperationSpec(Consumer<AddNotificationsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link AddNotificationsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the notification scheme.
     * @param addNotificationsDetails 
     */
    @ApiStatus.Internal
    public AddNotificationsOperationSpec(String id, AddNotificationsDetails addNotificationsDetails) {
        this.id = id;
        this.addNotificationsDetails = addNotificationsDetails;

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
        Objects.requireNonNull(addNotificationsDetails, "addNotificationsDetails is a required parameter!");
    }
}
