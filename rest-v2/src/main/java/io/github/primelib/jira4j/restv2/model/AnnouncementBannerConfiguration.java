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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AnnouncementBannerConfiguration
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
     * Constructs a validated instance of {@link AnnouncementBannerConfiguration}.
     *
     * @param spec the specification to process
     */
    public AnnouncementBannerConfiguration(Consumer<AnnouncementBannerConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AnnouncementBannerConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AnnouncementBannerConfiguration(Consumer)} instead.
     * @param hashId Hash of the banner data. The client detects updates by comparing hash IDs.
     * @param isDismissible Flag indicating if the announcement banner can be dismissed by the user.
     * @param isEnabled Flag indicating if the announcement banner is enabled or not.
     * @param message The text on the announcement banner.
     * @param visibility Visibility of the announcement banner.
     */
    @ApiStatus.Internal
    public AnnouncementBannerConfiguration(String hashId, Boolean isDismissible, Boolean isEnabled, String message, VisibilityEnum visibility) {
        this.hashId = hashId;
        this.isDismissible = isDismissible;
        this.isEnabled = isEnabled;
        this.message = message;
        this.visibility = visibility;
    }

    /**
     * Visibility of the announcement banner.
     */
    @AllArgsConstructor
    public enum VisibilityEnum {
        PUBLIC("PUBLIC"),
        PRIVATE("PRIVATE");

        private static final VisibilityEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static VisibilityEnum of(String input) {
            if (input != null) {
                for (VisibilityEnum v : VALUES) {
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
