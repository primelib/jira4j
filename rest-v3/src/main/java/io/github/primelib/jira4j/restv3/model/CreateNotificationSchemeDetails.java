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
 * CreateNotificationSchemeDetails
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
    "description",
    "name",
    "notificationSchemeEvents"
})
@JsonTypeName("CreateNotificationSchemeDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateNotificationSchemeDetails {

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

    /**
     * Constructs a validated instance of {@link CreateNotificationSchemeDetails}.
     *
     * @param spec the specification to process
     */
    public CreateNotificationSchemeDetails(Consumer<CreateNotificationSchemeDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateNotificationSchemeDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateNotificationSchemeDetails(Consumer)} instead.
     * @param description The description of the notification scheme.
     * @param name The name of the notification scheme. Must be unique (case-insensitive).
     * @param notificationSchemeEvents The list of notifications which should be added to the notification scheme.
     */
    @ApiStatus.Internal
    public CreateNotificationSchemeDetails(String description, String name, List<NotificationSchemeEventDetails> notificationSchemeEvents) {
        this.description = description;
        this.name = name;
        this.notificationSchemeEvents = notificationSchemeEvents;
    }

}
