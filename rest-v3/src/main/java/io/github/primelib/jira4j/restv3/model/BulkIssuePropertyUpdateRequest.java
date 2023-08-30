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
 * BulkIssuePropertyUpdateRequest
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
    "expression",
    "filter",
    "value"
})
@JsonTypeName("BulkIssuePropertyUpdateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkIssuePropertyUpdateRequest {

    /**
     * EXPERIMENTAL. The Jira expression to calculate the value of the property. The value of the expression must be an object that can be converted to JSON, such as a number, boolean, string, list, or map. The context variables available to the expression are {@code issue} and {@code user}. Issues for which the expression returns a value whose JSON representation is longer than 32768 characters are ignored.
     */
    @JsonProperty("expression")
    protected String expression;

    @JsonProperty("filter")
    protected IssueFilterForBulkPropertySet filter;

    /**
     * The value of the property. The value must be a [valid](https://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.
     */
    @JsonProperty("value")
    protected Object value;

    /**
     * Constructs a validated instance of {@link BulkIssuePropertyUpdateRequest}.
     *
     * @param spec the specification to process
     */
    public BulkIssuePropertyUpdateRequest(Consumer<BulkIssuePropertyUpdateRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BulkIssuePropertyUpdateRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BulkIssuePropertyUpdateRequest(Consumer)} instead.
     * @param expression EXPERIMENTAL. The Jira expression to calculate the value of the property. The value of the expression must be an object that can be converted to JSON, such as a number, boolean, string, list, or map. The context variables available to the expression are {@code issue} and {@code user}. Issues for which the expression returns a value whose JSON representation is longer than 32768 characters are ignored.
     * @param filter filter
     * @param value The value of the property. The value must be a [valid](https://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.
     */
    @ApiStatus.Internal
    public BulkIssuePropertyUpdateRequest(String expression, IssueFilterForBulkPropertySet filter, Object value) {
        this.expression = expression;
        this.filter = filter;
        this.value = value;
    }

}
