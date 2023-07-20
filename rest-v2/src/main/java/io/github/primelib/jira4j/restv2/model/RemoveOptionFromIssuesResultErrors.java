package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RemoveOptionFromIssuesResultErrors
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "errorMessages",
    "errors",
    "httpStatusCode"
})
@JsonTypeName("RemoveOptionFromIssuesResult_errors")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoveOptionFromIssuesResultErrors {

    /**
     * Constructs a validated implementation of {@link RemoveOptionFromIssuesResultErrors}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoveOptionFromIssuesResultErrors(Consumer<RemoveOptionFromIssuesResultErrors> spec) {
        spec.accept(this);
    }

    /**
     * The list of error messages produced by this operation. For example, "input parameter 'key' must be provided"
     */
    @JsonProperty("errorMessages")
    protected List<String> errorMessages;

    /**
     * The list of errors by parameter returned by the operation. For example,"projectKey": "Project keys must start with an uppercase letter, followed by one or more uppercase alphanumeric characters."
     */
    @JsonProperty("errors")
    protected Map<String, String> errors = new HashMap<>();

    @JsonProperty("httpStatusCode")
    protected Integer httpStatusCode;


}
