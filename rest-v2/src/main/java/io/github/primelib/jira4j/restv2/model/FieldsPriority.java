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
 * FieldsPriority
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link FieldsPriority}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldsPriority(Consumer<FieldsPriority> spec) {
        spec.accept(this);
    }

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


}
