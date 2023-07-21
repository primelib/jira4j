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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdatePriorityDetails
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
    "description",
    "iconUrl",
    "name",
    "statusColor"
})
@JsonTypeName("UpdatePriorityDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdatePriorityDetails {

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
     * Constructs a validated instance of {@link UpdatePriorityDetails}.
     *
     * @param spec the specification to process
     */
    public UpdatePriorityDetails(Consumer<UpdatePriorityDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdatePriorityDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdatePriorityDetails(Consumer)} instead.
     * @param description The description of the priority.
     * @param iconUrl The URL of an icon for the priority. Accepted protocols are HTTP and HTTPS. Built in icons can also be used.
     * @param name The name of the priority. Must be unique.
     * @param statusColor The status color of the priority in 3-digit or 6-digit hexadecimal format.
     */
    @ApiStatus.Internal
    public UpdatePriorityDetails(String description, IconUrlEnum iconUrl, String name, String statusColor) {
        this.description = description;
        this.iconUrl = iconUrl;
        this.name = name;
        this.statusColor = statusColor;
    }

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
