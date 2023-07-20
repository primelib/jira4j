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
 * FieldsTimetracking
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
@JsonTypeName("Fields_timetracking")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldsTimetracking {

    /**
     * Constructs a validated implementation of {@link FieldsTimetracking}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldsTimetracking(Consumer<FieldsTimetracking> spec) {
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
