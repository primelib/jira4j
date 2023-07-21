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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TimeTrackingConfiguration
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
    "defaultUnit",
    "timeFormat",
    "workingDaysPerWeek",
    "workingHoursPerDay"
})
@JsonTypeName("TimeTrackingConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TimeTrackingConfiguration {

    /**
     * The default unit of time applied to logged time.
     */
    @JsonProperty("defaultUnit")
    protected DefaultUnitEnum defaultUnit;

    /**
     * The format that will appear on an issue's *Time Spent* field.
     */
    @JsonProperty("timeFormat")
    protected TimeFormatEnum timeFormat;

    /**
     * The number of days in a working week.
     */
    @JsonProperty("workingDaysPerWeek")
    protected Double workingDaysPerWeek;

    /**
     * The number of hours in a working day.
     */
    @JsonProperty("workingHoursPerDay")
    protected Double workingHoursPerDay;

    /**
     * Constructs a validated instance of {@link TimeTrackingConfiguration}.
     *
     * @param spec the specification to process
     */
    public TimeTrackingConfiguration(Consumer<TimeTrackingConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TimeTrackingConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TimeTrackingConfiguration(Consumer)} instead.
     * @param defaultUnit The default unit of time applied to logged time.
     * @param timeFormat The format that will appear on an issue's *Time Spent* field.
     * @param workingDaysPerWeek The number of days in a working week.
     * @param workingHoursPerDay The number of hours in a working day.
     */
    @ApiStatus.Internal
    public TimeTrackingConfiguration(DefaultUnitEnum defaultUnit, TimeFormatEnum timeFormat, Double workingDaysPerWeek, Double workingHoursPerDay) {
        this.defaultUnit = defaultUnit;
        this.timeFormat = timeFormat;
        this.workingDaysPerWeek = workingDaysPerWeek;
        this.workingHoursPerDay = workingHoursPerDay;
    }

    /**
     * The default unit of time applied to logged time.
     */
    @AllArgsConstructor
    public enum DefaultUnitEnum {
        MINUTE("minute"),
        HOUR("hour"),
        DAY("day"),
        WEEK("week");

        private final String value;
    }

    /**
     * The format that will appear on an issue's *Time Spent* field.
     */
    @AllArgsConstructor
    public enum TimeFormatEnum {
        PRETTY("pretty"),
        DAYS("days"),
        HOURS("hours");

        private final String value;
    }

}
