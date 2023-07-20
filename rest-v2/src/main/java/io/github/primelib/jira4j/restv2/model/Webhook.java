package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Webhook
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link Webhook}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Webhook(Consumer<Webhook> spec) {
        spec.accept(this);
    }

    /**
     * The Jira events that trigger the webhook.
     */
    @JsonProperty("events")
    protected List<EventsEnum> events = new ArrayList<>();

    /**
     * The date after which the webhook is no longer sent. Use [Extend webhook life](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-webhooks/#api-rest-api-3-webhook-refresh-put) to extend the date.
     */
    @JsonProperty("expirationDate")
    protected Long expirationDate;

    /**
     * A list of field IDs. When the issue changelog contains any of the fields, the webhook `jira:issue_updated` is sent. If this parameter is not present, the app is notified about all field updates.
     */
    @JsonProperty("fieldIdsFilter")
    protected List<String> fieldIdsFilter;

    /**
     * The ID of the webhook.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * A list of issue property keys. A change of those issue properties triggers the `issue_property_set` or `issue_property_deleted` webhooks. If this parameter is not present, the app is notified about all issue property updates.
     */
    @JsonProperty("issuePropertyKeysFilter")
    protected List<String> issuePropertyKeysFilter;

    /**
     * The JQL filter that specifies which issues the webhook is sent for.
     */
    @JsonProperty("jqlFilter")
    protected String jqlFilter;


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

        private final String value;
    }

}
