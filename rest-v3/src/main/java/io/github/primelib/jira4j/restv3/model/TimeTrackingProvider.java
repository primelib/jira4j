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
 * TimeTrackingProvider
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
    "key",
    "name",
    "url"
})
@JsonTypeName("TimeTrackingProvider")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TimeTrackingProvider {

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
     * The URL of the configuration page for the time tracking provider app. For example, *_/example/config/url*. This property is only returned if the {@code adminPageKey} property is set in the module descriptor of the time tracking provider app.
     */
    @JsonProperty("url")
    protected String url;

    /**
     * Constructs a validated instance of {@link TimeTrackingProvider}.
     *
     * @param spec the specification to process
     */
    public TimeTrackingProvider(Consumer<TimeTrackingProvider> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TimeTrackingProvider}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TimeTrackingProvider(Consumer)} instead.
     * @param key The key for the time tracking provider. For example, *JIRA*.
     * @param name The name of the time tracking provider. For example, *JIRA provided time tracking*.
     * @param url The URL of the configuration page for the time tracking provider app. For example, *_/example/config/url*. This property is only returned if the {@code adminPageKey} property is set in the module descriptor of the time tracking provider app.
     */
    @ApiStatus.Internal
    public TimeTrackingProvider(String key, String name, String url) {
        this.key = key;
        this.name = name;
        this.url = url;
    }

}
