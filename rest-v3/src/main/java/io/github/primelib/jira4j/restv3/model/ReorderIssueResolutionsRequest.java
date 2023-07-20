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
 * ReorderIssueResolutionsRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "after",
    "ids",
    "position"
})
@JsonTypeName("ReorderIssueResolutionsRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReorderIssueResolutionsRequest {

    /**
     * Constructs a validated implementation of {@link ReorderIssueResolutionsRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReorderIssueResolutionsRequest(Consumer<ReorderIssueResolutionsRequest> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the resolution. Required if `position` isn't provided.
     */
    @JsonProperty("after")
    protected String after;

    /**
     * The list of resolution IDs to be reordered. Cannot contain duplicates nor after ID.
     */
    @JsonProperty("ids")
    protected List<String> ids = new ArrayList<>();

    /**
     * The position for issue resolutions to be moved to. Required if `after` isn't provided.
     */
    @JsonProperty("position")
    protected String position;


}
