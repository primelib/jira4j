package io.github.primelib.jira4j.restv2.model;

import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BulkIssuePropertyUpdateRequestFilter
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "currentValue",
    "entityIds",
    "hasProperty"
})
@JsonTypeName("BulkIssuePropertyUpdateRequest_filter")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkIssuePropertyUpdateRequestFilter {

    /**
     * Constructs a validated implementation of {@link BulkIssuePropertyUpdateRequestFilter}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BulkIssuePropertyUpdateRequestFilter(Consumer<BulkIssuePropertyUpdateRequestFilter> spec) {
        spec.accept(this);
    }

    /**
     * The value of properties to perform the bulk operation on.
     */
    @JsonProperty("currentValue")
    protected Object currentValue = null;

    /**
     * List of issues to perform the bulk operation on.
     */
    @JsonProperty("entityIds")
    protected Set<Long> entityIds;

    /**
     * Whether the bulk operation occurs only when the property is present on or absent from an issue.
     */
    @JsonProperty("hasProperty")
    protected Boolean hasProperty;


}
