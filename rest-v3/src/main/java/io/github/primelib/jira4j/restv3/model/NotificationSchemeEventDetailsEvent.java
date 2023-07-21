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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NotificationSchemeEventDetailsEvent
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
    "id"
})
@JsonTypeName("NotificationSchemeEventDetails_event")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSchemeEventDetailsEvent {

    /**
     * The ID of the notification scheme event.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Constructs a validated instance of {@link NotificationSchemeEventDetailsEvent}.
     *
     * @param spec the specification to process
     */
    public NotificationSchemeEventDetailsEvent(Consumer<NotificationSchemeEventDetailsEvent> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link NotificationSchemeEventDetailsEvent}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #NotificationSchemeEventDetailsEvent(Consumer)} instead.
     * @param id The ID of the notification scheme event.
     */
    @ApiStatus.Internal
    public NotificationSchemeEventDetailsEvent(String id) {
        this.id = id;
    }

}
