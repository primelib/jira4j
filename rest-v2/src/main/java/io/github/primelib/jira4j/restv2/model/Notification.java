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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Notification
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "htmlBody",
    "restrict",
    "subject",
    "textBody",
    "to"
})
@JsonTypeName("Notification")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Notification extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link Notification}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Notification(Consumer<Notification> spec) {
        spec.accept(this);
    }

    /**
     * The HTML body of the email notification for the issue.
     */
    @JsonProperty("htmlBody")
    protected String htmlBody;

    @JsonProperty("restrict")
    protected NotificationRestrict restrict;

    /**
     * The subject of the email notification for the issue. If this is not specified, then the subject is set to the issue key and summary.
     */
    @JsonProperty("subject")
    protected String subject;

    /**
     * The plain text body of the email notification for the issue.
     */
    @JsonProperty("textBody")
    protected String textBody;

    @JsonProperty("to")
    protected NotificationTo to;


}
