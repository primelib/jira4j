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
 * OrderOfIssueTypes
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "after",
    "issueTypeIds",
    "position"
})
@JsonTypeName("OrderOfIssueTypes")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrderOfIssueTypes {

    /**
     * Constructs a validated implementation of {@link OrderOfIssueTypes}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrderOfIssueTypes(Consumer<OrderOfIssueTypes> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the issue type to place the moved issue types after. Required if `position` isn't provided.
     */
    @JsonProperty("after")
    protected String after;

    /**
     * A list of the issue type IDs to move. The order of the issue type IDs in the list is the order they are given after the move.
     */
    @JsonProperty("issueTypeIds")
    protected List<String> issueTypeIds = new ArrayList<>();

    /**
     * The position the issue types should be moved to. Required if `after` isn't provided.
     */
    @JsonProperty("position")
    protected PositionEnum position;


    /**
     * The position the issue types should be moved to. Required if `after` isn't provided.
     */
    @AllArgsConstructor
    public enum PositionEnum {
        FIRST("First"),
        LAST("Last");

        private final String value;
    }

}
