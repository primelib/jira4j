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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChangelogHistoryMetadata
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
    "activityDescription",
    "activityDescriptionKey",
    "actor",
    "cause",
    "description",
    "descriptionKey",
    "emailDescription",
    "emailDescriptionKey",
    "extraData",
    "generator",
    "type"
})
@JsonTypeName("Changelog_historyMetadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangelogHistoryMetadata {

    /**
     * The activity described in the history record.
     */
    @JsonProperty("activityDescription")
    protected String activityDescription;

    /**
     * The key of the activity described in the history record.
     */
    @JsonProperty("activityDescriptionKey")
    protected String activityDescriptionKey;

    @JsonProperty("actor")
    protected HistoryMetadataParticipant actor;

    @JsonProperty("cause")
    protected HistoryMetadataParticipant cause;

    /**
     * The description of the history record.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The description key of the history record.
     */
    @JsonProperty("descriptionKey")
    protected String descriptionKey;

    /**
     * The description of the email address associated the history record.
     */
    @JsonProperty("emailDescription")
    protected String emailDescription;

    /**
     * The description key of the email address associated the history record.
     */
    @JsonProperty("emailDescriptionKey")
    protected String emailDescriptionKey;

    /**
     * Additional arbitrary information about the history record.
     */
    @JsonProperty("extraData")
    protected Map<String, String> extraData;

    @JsonProperty("generator")
    protected HistoryMetadataParticipant generator;

    /**
     * The type of the history record.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link ChangelogHistoryMetadata}.
     *
     * @param spec the specification to process
     */
    public ChangelogHistoryMetadata(Consumer<ChangelogHistoryMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ChangelogHistoryMetadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ChangelogHistoryMetadata(Consumer)} instead.
     * @param activityDescription The activity described in the history record.
     * @param activityDescriptionKey The key of the activity described in the history record.
     * @param actor actor
     * @param cause cause
     * @param description The description of the history record.
     * @param descriptionKey The description key of the history record.
     * @param emailDescription The description of the email address associated the history record.
     * @param emailDescriptionKey The description key of the email address associated the history record.
     * @param extraData Additional arbitrary information about the history record.
     * @param generator generator
     * @param type The type of the history record.
     */
    @ApiStatus.Internal
    public ChangelogHistoryMetadata(String activityDescription, String activityDescriptionKey, HistoryMetadataParticipant actor, HistoryMetadataParticipant cause, String description, String descriptionKey, String emailDescription, String emailDescriptionKey, Map<String, String> extraData, HistoryMetadataParticipant generator, String type) {
        this.activityDescription = activityDescription;
        this.activityDescriptionKey = activityDescriptionKey;
        this.actor = actor;
        this.cause = cause;
        this.description = description;
        this.descriptionKey = descriptionKey;
        this.emailDescription = emailDescription;
        this.emailDescriptionKey = emailDescriptionKey;
        this.extraData = extraData;
        this.generator = generator;
        this.type = type;
    }

}
