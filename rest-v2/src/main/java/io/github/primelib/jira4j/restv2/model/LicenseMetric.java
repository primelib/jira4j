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
 * LicenseMetric
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
    "value"
})
@JsonTypeName("LicenseMetric")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LicenseMetric {

    /**
     * The key of a specific license metric.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The calculated value of a licence metric linked to the key. An example licence metric is the approximate number of user accounts.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link LicenseMetric}.
     *
     * @param spec the specification to process
     */
    public LicenseMetric(Consumer<LicenseMetric> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LicenseMetric}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LicenseMetric(Consumer)} instead.
     * @param key The key of a specific license metric.
     * @param value The calculated value of a licence metric linked to the key. An example licence metric is the approximate number of user accounts.
     */
    @ApiStatus.Internal
    public LicenseMetric(String key, String value) {
        this.key = key;
        this.value = value;
    }

}
