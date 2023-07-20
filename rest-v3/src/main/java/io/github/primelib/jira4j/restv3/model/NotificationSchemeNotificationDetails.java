package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NotificationSchemeNotificationDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "notificationType",
    "parameter"
})
@JsonTypeName("NotificationSchemeNotificationDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSchemeNotificationDetails extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link NotificationSchemeNotificationDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NotificationSchemeNotificationDetails(Consumer<NotificationSchemeNotificationDetails> spec) {
        spec.accept(this);
    }

    /**
     * The notification type, e.g `CurrentAssignee`, `Group`, `EmailAddress`.
     */
    @JsonProperty("notificationType")
    protected String notificationType;

    /**
     * The value corresponding to the specified notification type.
     */
    @JsonProperty("parameter")
    protected String parameter;


}
