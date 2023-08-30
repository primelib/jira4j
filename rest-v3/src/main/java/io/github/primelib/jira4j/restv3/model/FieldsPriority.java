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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldsPriority
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
    "id",
    "isDefault",
    "name",
    "self",
    "statusColor"
})
@JsonTypeName("Fields_priority")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldsPriority {

    /**
     * The description of the issue priority.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The URL of the icon for the issue priority.
     */
    @JsonProperty("iconUrl")
    protected String iconUrl;

    /**
     * The ID of the issue priority.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Whether this priority is the default.
     */
    @JsonProperty("isDefault")
    protected Boolean isDefault;

    /**
     * The name of the issue priority.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URL of the issue priority.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * The color used to indicate the issue priority.
     */
    @JsonProperty("statusColor")
    protected String statusColor;

    /**
     * Constructs a validated instance of {@link FieldsPriority}.
     *
     * @param spec the specification to process
     */
    public FieldsPriority(Consumer<FieldsPriority> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldsPriority}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldsPriority(Consumer)} instead.
     * @param description The description of the issue priority.
     * @param iconUrl The URL of the icon for the issue priority.
     * @param id The ID of the issue priority.
     * @param isDefault Whether this priority is the default.
     * @param name The name of the issue priority.
     * @param self The URL of the issue priority.
     * @param statusColor The color used to indicate the issue priority.
     */
    @ApiStatus.Internal
    public FieldsPriority(String description, String iconUrl, String id, Boolean isDefault, String name, String self, String statusColor) {
        this.description = description;
        this.iconUrl = iconUrl;
        this.id = id;
        this.isDefault = isDefault;
        this.name = name;
        this.self = self;
        this.statusColor = statusColor;
    }

}
