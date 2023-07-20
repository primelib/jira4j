package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HistoryMetadataGenerator
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "avatarUrl",
    "displayName",
    "displayNameKey",
    "id",
    "type",
    "url"
})
@JsonTypeName("HistoryMetadata_generator")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HistoryMetadataGenerator {

    /**
     * Constructs a validated implementation of {@link HistoryMetadataGenerator}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public HistoryMetadataGenerator(Consumer<HistoryMetadataGenerator> spec) {
        spec.accept(this);
    }

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


}
