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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SimpleErrorCollection
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
    "errorMessages",
    "errors",
    "httpStatusCode"
})
@JsonTypeName("SimpleErrorCollection")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SimpleErrorCollection {

    /**
     * The list of error messages produced by this operation. For example, "input parameter 'key' must be provided"
     */
    @JsonProperty("errorMessages")
    protected List<String> errorMessages;

    /**
     * The list of errors by parameter returned by the operation. For example,"projectKey": "Project keys must start with an uppercase letter, followed by one or more uppercase alphanumeric characters."
     */
    @JsonProperty("errors")
    protected Map<String, String> errors;

    @JsonProperty("httpStatusCode")
    protected Integer httpStatusCode;

    /**
     * Constructs a validated instance of {@link SimpleErrorCollection}.
     *
     * @param spec the specification to process
     */
    public SimpleErrorCollection(Consumer<SimpleErrorCollection> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SimpleErrorCollection}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SimpleErrorCollection(Consumer)} instead.
     * @param errorMessages The list of error messages produced by this operation. For example, "input parameter 'key' must be provided"
     * @param errors The list of errors by parameter returned by the operation. For example,"projectKey": "Project keys must start with an uppercase letter, followed by one or more uppercase alphanumeric characters."
     * @param httpStatusCode httpStatusCode
     */
    @ApiStatus.Internal
    public SimpleErrorCollection(List<String> errorMessages, Map<String, String> errors, Integer httpStatusCode) {
        this.errorMessages = errorMessages;
        this.errors = errors;
        this.httpStatusCode = httpStatusCode;
    }

}
