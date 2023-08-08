package io.github.primelib.jira4j.restv3.model;

import java.util.List;
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
 * DateRangeFilterRequest
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
    "dateAfter",
    "dateBefore"
})
@JsonTypeName("DateRangeFilterRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DateRangeFilterRequest {

    /**
     * List issues archived after a specified date, passed in the YYYY-MM-DD format.
     */
    @JsonProperty("dateAfter")
    protected String dateAfter;

    /**
     * List issues archived before a specified date provided in the YYYY-MM-DD format.
     */
    @JsonProperty("dateBefore")
    protected String dateBefore;

    /**
     * Constructs a validated instance of {@link DateRangeFilterRequest}.
     *
     * @param spec the specification to process
     */
    public DateRangeFilterRequest(Consumer<DateRangeFilterRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DateRangeFilterRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DateRangeFilterRequest(Consumer)} instead.
     * @param dateAfter List issues archived after a specified date, passed in the YYYY-MM-DD format.
     * @param dateBefore List issues archived before a specified date provided in the YYYY-MM-DD format.
     */
    @ApiStatus.Internal
    public DateRangeFilterRequest(String dateAfter, String dateBefore) {
        this.dateAfter = dateAfter;
        this.dateBefore = dateBefore;
    }

}
