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
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReorderIssuePriorities
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
    "ids",
    "position"
})
@JsonTypeName("ReorderIssuePriorities")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReorderIssuePriorities {

    /**
     * The ID of the priority. Required if {@code position} isn't provided.
     */
    @JsonProperty("after")
    protected String after;

    /**
     * The list of issue IDs to be reordered. Cannot contain duplicates nor after ID.
     */
    @JsonProperty("ids")
    protected List<String> ids;

    /**
     * The position for issue priorities to be moved to. Required if {@code after} isn't provided.
     */
    @JsonProperty("position")
    protected String position;

    /**
     * Constructs a validated instance of {@link ReorderIssuePriorities}.
     *
     * @param spec the specification to process
     */
    public ReorderIssuePriorities(Consumer<ReorderIssuePriorities> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ReorderIssuePriorities}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ReorderIssuePriorities(Consumer)} instead.
     * @param after The ID of the priority. Required if {@code position} isn't provided.
     * @param ids The list of issue IDs to be reordered. Cannot contain duplicates nor after ID.
     * @param position The position for issue priorities to be moved to. Required if {@code after} isn't provided.
     */
    @ApiStatus.Internal
    public ReorderIssuePriorities(String after, List<String> ids, String position) {
        this.after = after;
        this.ids = ids;
        this.position = position;
    }

}
