package io.github.primelib.jira4j.restv3.model;

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
 * BulkIssuePropertyUpdateRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "expression",
    "filter",
    "value"
})
@JsonTypeName("BulkIssuePropertyUpdateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkIssuePropertyUpdateRequest {

    /**
     * Constructs a validated implementation of {@link BulkIssuePropertyUpdateRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BulkIssuePropertyUpdateRequest(Consumer<BulkIssuePropertyUpdateRequest> spec) {
        spec.accept(this);
    }

    /**
     * EXPERIMENTAL. The Jira expression to calculate the value of the property. The value of the expression must be an object that can be converted to JSON, such as a number, boolean, string, list, or map. The context variables available to the expression are `issue` and `user`. Issues for which the expression returns a value whose JSON representation is longer than 32768 characters are ignored.
     */
    @JsonProperty("expression")
    protected String expression;

    @JsonProperty("filter")
    protected BulkIssuePropertyUpdateRequestFilter filter;

    /**
     * The value of the property. The value must be a [valid](https://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.
     */
    @JsonProperty("value")
    protected Object value = null;


}
