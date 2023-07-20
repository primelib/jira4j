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
 * AnnouncementBannerConfigurationUpdate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link AnnouncementBannerConfigurationUpdate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AnnouncementBannerConfigurationUpdate(Consumer<AnnouncementBannerConfigurationUpdate> spec) {
        spec.accept(this);
    }

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


}
