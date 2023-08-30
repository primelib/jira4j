package io.github.primelib.jira4j.restv2.model;

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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Webhook
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
    "events",
    "expirationDate",
    "fieldIdsFilter",
    "id",
    "issuePropertyKeysFilter",
    "jqlFilter"
})
@JsonTypeName("Webhook")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Webhook {

    /**
     * The Jira events that trigger the webhook.
     */
    @JsonProperty("events")
    protected List<EventsEnum> events;

    /**
     * The date after which the webhook is no longer sent. Use [Extend webhook life](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-webhooks/#api-rest-api-3-webhook-refresh-put) to extend the date.
     */
    @JsonProperty("expirationDate")
    protected Long expirationDate;

    /**
     * A list of field IDs. When the issue changelog contains any of the fields, the webhook {@code jira:issue_updated} is sent. If this parameter is not present, the app is notified about all field updates.
     */
    @JsonProperty("fieldIdsFilter")
    protected List<String> fieldIdsFilter;

    /**
     * The ID of the webhook.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * A list of issue property keys. A change of those issue properties triggers the {@code issue_property_set} or {@code issue_property_deleted} webhooks. If this parameter is not present, the app is notified about all issue property updates.
     */
    @JsonProperty("issuePropertyKeysFilter")
    protected List<String> issuePropertyKeysFilter;

    /**
     * The JQL filter that specifies which issues the webhook is sent for.
     */
    @JsonProperty("jqlFilter")
    protected String jqlFilter;

    /**
     * Constructs a validated instance of {@link Webhook}.
     *
     * @param spec the specification to process
     */
    public Webhook(Consumer<Webhook> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Webhook}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Webhook(Consumer)} instead.
     * @param events The Jira events that trigger the webhook.
     * @param expirationDate The date after which the webhook is no longer sent. Use [Extend webhook life](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-webhooks/#api-rest-api-3-webhook-refresh-put) to extend the date.
     * @param fieldIdsFilter A list of field IDs. When the issue changelog contains any of the fields, the webhook {@code jira:issue_updated} is sent. If this parameter is not present, the app is notified about all field updates.
     * @param id The ID of the webhook.
     * @param issuePropertyKeysFilter A list of issue property keys. A change of those issue properties triggers the {@code issue_property_set} or {@code issue_property_deleted} webhooks. If this parameter is not present, the app is notified about all issue property updates.
     * @param jqlFilter The JQL filter that specifies which issues the webhook is sent for.
     */
    @ApiStatus.Internal
    public Webhook(List<EventsEnum> events, Long expirationDate, List<String> fieldIdsFilter, Long id, List<String> issuePropertyKeysFilter, String jqlFilter) {
        this.events = events;
        this.expirationDate = expirationDate;
        this.fieldIdsFilter = fieldIdsFilter;
        this.id = id;
        this.issuePropertyKeysFilter = issuePropertyKeysFilter;
        this.jqlFilter = jqlFilter;
    }

    /**
     * The Jira events that trigger the webhook.
     */
    @AllArgsConstructor
    public enum EventsEnum {
        JIRA_ISSUE_CREATED("jira:issue_created"),
        JIRA_ISSUE_UPDATED("jira:issue_updated"),
        JIRA_ISSUE_DELETED("jira:issue_deleted"),
        COMMENT_CREATED("comment_created"),
        COMMENT_UPDATED("comment_updated"),
        COMMENT_DELETED("comment_deleted"),
        ISSUE_PROPERTY_SET("issue_property_set"),
        ISSUE_PROPERTY_DELETED("issue_property_deleted");

        private static final EventsEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static EventsEnum of(String input) {
            if (input != null) {
                for (EventsEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
