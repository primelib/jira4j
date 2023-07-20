package io.github.primelib.jira4j.restv2.model;

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
 * AnnouncementBannerConfiguration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "hashId",
    "isDismissible",
    "isEnabled",
    "message",
    "visibility"
})
@JsonTypeName("AnnouncementBannerConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnnouncementBannerConfiguration {

    /**
     * Constructs a validated implementation of {@link AnnouncementBannerConfiguration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AnnouncementBannerConfiguration(Consumer<AnnouncementBannerConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Hash of the banner data. The client detects updates by comparing hash IDs.
     */
    @JsonProperty("hashId")
    protected String hashId;

    /**
     * Flag indicating if the announcement banner can be dismissed by the user.
     */
    @JsonProperty("isDismissible")
    protected Boolean isDismissible;

    /**
     * Flag indicating if the announcement banner is enabled or not.
     */
    @JsonProperty("isEnabled")
    protected Boolean isEnabled;

    /**
     * The text on the announcement banner.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * Visibility of the announcement banner.
     */
    @JsonProperty("visibility")
    protected VisibilityEnum visibility;


    /**
     * Visibility of the announcement banner.
     */
    @AllArgsConstructor
    public enum VisibilityEnum {
        PUBLIC("PUBLIC"),
        PRIVATE("PRIVATE");

        private final String value;
    }

}
