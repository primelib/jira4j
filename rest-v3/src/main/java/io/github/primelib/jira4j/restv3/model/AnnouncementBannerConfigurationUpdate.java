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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AnnouncementBannerConfigurationUpdate
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
    "isDismissible",
    "isEnabled",
    "message",
    "visibility"
})
@JsonTypeName("AnnouncementBannerConfigurationUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnnouncementBannerConfigurationUpdate {

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
     * Visibility of the announcement banner. Can be public or private.
     */
    @JsonProperty("visibility")
    protected String visibility;

    /**
     * Constructs a validated instance of {@link AnnouncementBannerConfigurationUpdate}.
     *
     * @param spec the specification to process
     */
    public AnnouncementBannerConfigurationUpdate(Consumer<AnnouncementBannerConfigurationUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AnnouncementBannerConfigurationUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AnnouncementBannerConfigurationUpdate(Consumer)} instead.
     * @param isDismissible Flag indicating if the announcement banner can be dismissed by the user.
     * @param isEnabled Flag indicating if the announcement banner is enabled or not.
     * @param message The text on the announcement banner.
     * @param visibility Visibility of the announcement banner. Can be public or private.
     */
    @ApiStatus.Internal
    public AnnouncementBannerConfigurationUpdate(Boolean isDismissible, Boolean isEnabled, String message, String visibility) {
        this.isDismissible = isDismissible;
        this.isEnabled = isEnabled;
        this.message = message;
        this.visibility = visibility;
    }

}
