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
 * HistoryMetadataParticipant
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
    "avatarUrl",
    "displayName",
    "displayNameKey",
    "id",
    "type",
    "url"
})
@JsonTypeName("HistoryMetadataParticipant")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HistoryMetadataParticipant {

    /**
     * The URL to an avatar for the user or system associated with a history record.
     */
    @JsonProperty("avatarUrl")
    protected String avatarUrl;

    /**
     * The display name of the user or system associated with a history record.
     */
    @JsonProperty("displayName")
    protected String displayName;

    /**
     * The key of the display name of the user or system associated with a history record.
     */
    @JsonProperty("displayNameKey")
    protected String displayNameKey;

    /**
     * The ID of the user or system associated with a history record.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The type of the user or system associated with a history record.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The URL of the user or system associated with a history record.
     */
    @JsonProperty("url")
    protected String url;

    /**
     * Constructs a validated instance of {@link HistoryMetadataParticipant}.
     *
     * @param spec the specification to process
     */
    public HistoryMetadataParticipant(Consumer<HistoryMetadataParticipant> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link HistoryMetadataParticipant}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #HistoryMetadataParticipant(Consumer)} instead.
     * @param avatarUrl The URL to an avatar for the user or system associated with a history record.
     * @param displayName The display name of the user or system associated with a history record.
     * @param displayNameKey The key of the display name of the user or system associated with a history record.
     * @param id The ID of the user or system associated with a history record.
     * @param type The type of the user or system associated with a history record.
     * @param url The URL of the user or system associated with a history record.
     */
    @ApiStatus.Internal
    public HistoryMetadataParticipant(String avatarUrl, String displayName, String displayNameKey, String id, String type, String url) {
        this.avatarUrl = avatarUrl;
        this.displayName = displayName;
        this.displayNameKey = displayNameKey;
        this.id = id;
        this.type = type;
        this.url = url;
    }

}
