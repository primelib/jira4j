package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrderOfCustomFieldOptions
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "after",
    "customFieldOptionIds",
    "position"
})
@JsonTypeName("OrderOfCustomFieldOptions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrderOfCustomFieldOptions {

    /**
     * Constructs a validated implementation of {@link OrderOfCustomFieldOptions}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrderOfCustomFieldOptions(Consumer<OrderOfCustomFieldOptions> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the custom field option or cascading option to place the moved options after. Required if `position` isn't provided.
     */
    @JsonProperty("after")
    protected String after;

    /**
     * A list of IDs of custom field options to move. The order of the custom field option IDs in the list is the order they are given after the move. The list must contain custom field options or cascading options, but not both.
     */
    @JsonProperty("customFieldOptionIds")
    protected List<String> customFieldOptionIds = new ArrayList<>();

    /**
     * The position the custom field options should be moved to. Required if `after` isn't provided.
     */
    @JsonProperty("position")
    protected PositionEnum position;


    /**
     * The position the custom field options should be moved to. Required if `after` isn't provided.
     */
    @AllArgsConstructor
    public enum PositionEnum {
        FIRST("First"),
        LAST("Last");

        private final String value;
    }

}
