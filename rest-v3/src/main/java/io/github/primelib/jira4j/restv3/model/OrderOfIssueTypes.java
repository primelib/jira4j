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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * OrderOfIssueTypes
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
    "issueTypeIds",
    "position"
})
@JsonTypeName("OrderOfIssueTypes")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrderOfIssueTypes {

    /**
     * The ID of the issue type to place the moved issue types after. Required if {@code position} isn't provided.
     */
    @JsonProperty("after")
    protected String after;

    /**
     * A list of the issue type IDs to move. The order of the issue type IDs in the list is the order they are given after the move.
     */
    @JsonProperty("issueTypeIds")
    protected List<String> issueTypeIds;

    /**
     * The position the issue types should be moved to. Required if {@code after} isn't provided.
     */
    @JsonProperty("position")
    protected PositionEnum position;

    /**
     * Constructs a validated instance of {@link OrderOfIssueTypes}.
     *
     * @param spec the specification to process
     */
    public OrderOfIssueTypes(Consumer<OrderOfIssueTypes> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrderOfIssueTypes}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrderOfIssueTypes(Consumer)} instead.
     * @param after The ID of the issue type to place the moved issue types after. Required if {@code position} isn't provided.
     * @param issueTypeIds A list of the issue type IDs to move. The order of the issue type IDs in the list is the order they are given after the move.
     * @param position The position the issue types should be moved to. Required if {@code after} isn't provided.
     */
    @ApiStatus.Internal
    public OrderOfIssueTypes(String after, List<String> issueTypeIds, PositionEnum position) {
        this.after = after;
        this.issueTypeIds = issueTypeIds;
        this.position = position;
    }

    /**
     * The position the issue types should be moved to. Required if {@code after} isn't provided.
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
