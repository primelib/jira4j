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
 * TimeTrackingProvider
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "key",
    "name",
    "url"
})
@JsonTypeName("TimeTrackingProvider")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TimeTrackingProvider {

    /**
     * Constructs a validated implementation of {@link TimeTrackingProvider}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TimeTrackingProvider(Consumer<TimeTrackingProvider> spec) {
        spec.accept(this);
    }

    /**
     * The key for the time tracking provider. For example, *JIRA*.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The name of the time tracking provider. For example, *JIRA provided time tracking*.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URL of the configuration page for the time tracking provider app. For example, *_/example/config/url*. This property is only returned if the `adminPageKey` property is set in the module descriptor of the time tracking provider app.
     */
    @JsonProperty("url")
    protected String url;


}
