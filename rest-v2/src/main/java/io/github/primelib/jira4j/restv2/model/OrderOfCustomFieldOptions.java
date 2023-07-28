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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * OrderOfCustomFieldOptions
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
    "after",
    "customFieldOptionIds",
    "position"
})
@JsonTypeName("OrderOfCustomFieldOptions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrderOfCustomFieldOptions {

    /**
     * The ID of the custom field option or cascading option to place the moved options after. Required if {@code position} isn't provided.
     */
    @JsonProperty("after")
    protected String after;

    /**
     * A list of IDs of custom field options to move. The order of the custom field option IDs in the list is the order they are given after the move. The list must contain custom field options or cascading options, but not both.
     */
    @JsonProperty("customFieldOptionIds")
    protected List<String> customFieldOptionIds;

    /**
     * The position the custom field options should be moved to. Required if {@code after} isn't provided.
     */
    @JsonProperty("position")
    protected PositionEnum position;

    /**
     * Constructs a validated instance of {@link OrderOfCustomFieldOptions}.
     *
     * @param spec the specification to process
     */
    public OrderOfCustomFieldOptions(Consumer<OrderOfCustomFieldOptions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrderOfCustomFieldOptions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrderOfCustomFieldOptions(Consumer)} instead.
     * @param after The ID of the custom field option or cascading option to place the moved options after. Required if {@code position} isn't provided.
     * @param customFieldOptionIds A list of IDs of custom field options to move. The order of the custom field option IDs in the list is the order they are given after the move. The list must contain custom field options or cascading options, but not both.
     * @param position The position the custom field options should be moved to. Required if {@code after} isn't provided.
     */
    @ApiStatus.Internal
    public OrderOfCustomFieldOptions(String after, List<String> customFieldOptionIds, PositionEnum position) {
        this.after = after;
        this.customFieldOptionIds = customFieldOptionIds;
        this.position = position;
    }

    /**
     * The position the custom field options should be moved to. Required if {@code after} isn't provided.
     */
    @AllArgsConstructor
    public enum PositionEnum {
        FIRST("First"),
        LAST("Last");

        private static final PositionEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static PositionEnum of(String input) {
            if (input != null) {
                for (PositionEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
