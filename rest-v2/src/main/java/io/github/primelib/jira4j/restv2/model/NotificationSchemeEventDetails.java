package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NotificationSchemeEventDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "event",
    "notifications"
})
@JsonTypeName("NotificationSchemeEventDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSchemeEventDetails extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link NotificationSchemeEventDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NotificationSchemeEventDetails(Consumer<NotificationSchemeEventDetails> spec) {
        spec.accept(this);
    }

    @JsonProperty("event")
    protected NotificationSchemeEventDetailsEvent event;

    /**
     * The list of notifications mapped to a specified event.
     */
    @JsonProperty("notifications")
    protected List<NotificationSchemeNotificationDetails> notifications = new ArrayList<>();


}
