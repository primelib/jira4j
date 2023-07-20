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
 * ConfigurationTimeTrackingConfiguration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "defaultUnit",
    "timeFormat",
    "workingDaysPerWeek",
    "workingHoursPerDay"
})
@JsonTypeName("Configuration_timeTrackingConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConfigurationTimeTrackingConfiguration {

    /**
     * Constructs a validated implementation of {@link ConfigurationTimeTrackingConfiguration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ConfigurationTimeTrackingConfiguration(Consumer<ConfigurationTimeTrackingConfiguration> spec) {
        spec.accept(this);
    }

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
