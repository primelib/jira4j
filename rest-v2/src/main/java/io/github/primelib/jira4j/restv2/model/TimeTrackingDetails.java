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
 * TimeTrackingDetails
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

    /**
     * Constructs a validated instance of {@link TimeTrackingDetails}.
     *
     * @param spec the specification to process
     */
    public TimeTrackingDetails(Consumer<TimeTrackingDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TimeTrackingDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TimeTrackingDetails(Consumer)} instead.
     * @param originalEstimate The original estimate of time needed for this issue in readable format.
     * @param originalEstimateSeconds The original estimate of time needed for this issue in seconds.
     * @param remainingEstimate The remaining estimate of time needed for this issue in readable format.
     * @param remainingEstimateSeconds The remaining estimate of time needed for this issue in seconds.
     * @param timeSpent Time worked on this issue in readable format.
     * @param timeSpentSeconds Time worked on this issue in seconds.
     */
    @ApiStatus.Internal
    public TimeTrackingDetails(String originalEstimate, Long originalEstimateSeconds, String remainingEstimate, Long remainingEstimateSeconds, String timeSpent, Long timeSpentSeconds) {
        this.originalEstimate = originalEstimate;
        this.originalEstimateSeconds = originalEstimateSeconds;
        this.remainingEstimate = remainingEstimate;
        this.remainingEstimateSeconds = remainingEstimateSeconds;
        this.timeSpent = timeSpent;
        this.timeSpentSeconds = timeSpentSeconds;
    }

}
