package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
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
 * IssueUpdateDetailsHistoryMetadata
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
@JsonTypeName("IssueUpdateDetails_historyMetadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueUpdateDetailsHistoryMetadata {

    /**
     * Constructs a validated implementation of {@link IssueUpdateDetailsHistoryMetadata}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueUpdateDetailsHistoryMetadata(Consumer<IssueUpdateDetailsHistoryMetadata> spec) {
        spec.accept(this);
    }

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
    protected HistoryMetadataActor actor;

    @JsonProperty("cause")
    protected HistoryMetadataCause cause;

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
    protected Map<String, String> extraData = new HashMap<>();

    @JsonProperty("generator")
    protected HistoryMetadataGenerator generator;

    /**
     * The type of the history record.
     */
    @JsonProperty("type")
    protected String type;


}
