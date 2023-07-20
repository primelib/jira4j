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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateNotificationSchemeDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "description",
    "name",
    "notificationSchemeEvents"
})
@JsonTypeName("CreateNotificationSchemeDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateNotificationSchemeDetails extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link CreateNotificationSchemeDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateNotificationSchemeDetails(Consumer<CreateNotificationSchemeDetails> spec) {
        spec.accept(this);
    }

    /**
     * The description of the notification scheme.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the notification scheme. Must be unique (case-insensitive).
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The list of notifications which should be added to the notification scheme.
     */
    @JsonProperty("notificationSchemeEvents")
    protected List<NotificationSchemeEventDetails> notificationSchemeEvents;


}
