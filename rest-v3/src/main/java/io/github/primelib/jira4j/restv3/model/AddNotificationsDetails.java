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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AddNotificationsDetails
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
    "notificationSchemeEvents"
})
@JsonTypeName("AddNotificationsDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddNotificationsDetails {

    /**
     * The list of notifications which should be added to the notification scheme.
     */
    @JsonProperty("notificationSchemeEvents")
    protected List<NotificationSchemeEventDetails> notificationSchemeEvents;

    /**
     * Constructs a validated instance of {@link AddNotificationsDetails}.
     *
     * @param spec the specification to process
     */
    public AddNotificationsDetails(Consumer<AddNotificationsDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AddNotificationsDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AddNotificationsDetails(Consumer)} instead.
     * @param notificationSchemeEvents The list of notifications which should be added to the notification scheme.
     */
    @ApiStatus.Internal
    public AddNotificationsDetails(List<NotificationSchemeEventDetails> notificationSchemeEvents) {
        this.notificationSchemeEvents = notificationSchemeEvents;
    }

}
