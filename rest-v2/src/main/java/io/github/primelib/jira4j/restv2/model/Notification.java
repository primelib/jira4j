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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Notification
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
    "htmlBody",
    "restrict",
    "subject",
    "textBody",
    "to"
})
@JsonTypeName("Notification")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Notification {

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

    /**
     * Constructs a validated instance of {@link Notification}.
     *
     * @param spec the specification to process
     */
    public Notification(Consumer<Notification> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Notification}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Notification(Consumer)} instead.
     * @param htmlBody The HTML body of the email notification for the issue.
     * @param restrict var.name
     * @param subject The subject of the email notification for the issue. If this is not specified, then the subject is set to the issue key and summary.
     * @param textBody The plain text body of the email notification for the issue.
     * @param to var.name
     */
    @ApiStatus.Internal
    public Notification(String htmlBody, NotificationRestrict restrict, String subject, String textBody, NotificationTo to) {
        this.htmlBody = htmlBody;
        this.restrict = restrict;
        this.subject = subject;
        this.textBody = textBody;
        this.to = to;
    }

}
