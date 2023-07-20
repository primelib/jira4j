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
 * LicenseMetric
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "key",
    "value"
})
@JsonTypeName("LicenseMetric")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LicenseMetric {

    /**
     * Constructs a validated implementation of {@link LicenseMetric}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public LicenseMetric(Consumer<LicenseMetric> spec) {
        spec.accept(this);
    }

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


}
