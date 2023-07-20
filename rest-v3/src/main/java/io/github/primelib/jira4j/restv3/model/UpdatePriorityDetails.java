package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdatePriorityDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "description",
    "iconUrl",
    "name",
    "statusColor"
})
@JsonTypeName("UpdatePriorityDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdatePriorityDetails extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link UpdatePriorityDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdatePriorityDetails(Consumer<UpdatePriorityDetails> spec) {
        spec.accept(this);
    }

    /**
     * The description of the priority.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The URL of an icon for the priority. Accepted protocols are HTTP and HTTPS. Built in icons can also be used.
     */
    @JsonProperty("iconUrl")
    protected IconUrlEnum iconUrl;

    /**
     * The name of the priority. Must be unique.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The status color of the priority in 3-digit or 6-digit hexadecimal format.
     */
    @JsonProperty("statusColor")
    protected String statusColor;


    /**
     * The URL of an icon for the priority. Accepted protocols are HTTP and HTTPS. Built in icons can also be used.
     */
    @AllArgsConstructor
    public enum IconUrlEnum {
        BLOCKER_PNG("/images/icons/priorities/blocker.png"),
        CRITICAL_PNG("/images/icons/priorities/critical.png"),
        HIGH_PNG("/images/icons/priorities/high.png"),
        HIGHEST_PNG("/images/icons/priorities/highest.png"),
        LOW_PNG("/images/icons/priorities/low.png"),
        LOWEST_PNG("/images/icons/priorities/lowest.png"),
        MAJOR_PNG("/images/icons/priorities/major.png"),
        MEDIUM_PNG("/images/icons/priorities/medium.png"),
        MINOR_PNG("/images/icons/priorities/minor.png"),
        TRIVIAL_PNG("/images/icons/priorities/trivial.png");

        private final String value;
    }

}
