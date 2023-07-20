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
 * TimeTrackingDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "originalEstimate",
    "originalEstimateSeconds",
    "remainingEstimate",
    "remainingEstimateSeconds",
    "timeSpent",
    "timeSpentSeconds"
})
@JsonTypeName("TimeTrackingDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TimeTrackingDetails {

    /**
     * Constructs a validated implementation of {@link TimeTrackingDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TimeTrackingDetails(Consumer<TimeTrackingDetails> spec) {
        spec.accept(this);
    }

    /**
     * The original estimate of time needed for this issue in readable format.
     */
    @JsonProperty("originalEstimate")
    protected String originalEstimate;

    /**
     * The original estimate of time needed for this issue in seconds.
     */
    @JsonProperty("originalEstimateSeconds")
    protected Long originalEstimateSeconds;

    /**
     * The remaining estimate of time needed for this issue in readable format.
     */
    @JsonProperty("remainingEstimate")
    protected String remainingEstimate;

    /**
     * The remaining estimate of time needed for this issue in seconds.
     */
    @JsonProperty("remainingEstimateSeconds")
    protected Long remainingEstimateSeconds;

    /**
     * Time worked on this issue in readable format.
     */
    @JsonProperty("timeSpent")
    protected String timeSpent;

    /**
     * Time worked on this issue in seconds.
     */
    @JsonProperty("timeSpentSeconds")
    protected Long timeSpentSeconds;


}
