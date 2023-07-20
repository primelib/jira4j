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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AddNotificationsDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "notificationSchemeEvents"
})
@JsonTypeName("AddNotificationsDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddNotificationsDetails extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link AddNotificationsDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddNotificationsDetails(Consumer<AddNotificationsDetails> spec) {
        spec.accept(this);
    }

    /**
     * The list of notifications which should be added to the notification scheme.
     */
    @JsonProperty("notificationSchemeEvents")
    protected List<NotificationSchemeEventDetails> notificationSchemeEvents = new ArrayList<>();


}
