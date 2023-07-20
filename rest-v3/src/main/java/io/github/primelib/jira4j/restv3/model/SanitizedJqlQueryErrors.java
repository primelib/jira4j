package io.github.primelib.jira4j.restv3.model;

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
 * SanitizedJqlQueryErrors
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "errorMessages",
    "errors",
    "status"
})
@JsonTypeName("SanitizedJqlQuery_errors")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SanitizedJqlQueryErrors {

    /**
     * Constructs a validated implementation of {@link SanitizedJqlQueryErrors}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SanitizedJqlQueryErrors(Consumer<SanitizedJqlQueryErrors> spec) {
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

    @JsonProperty("status")
    protected Integer status;


}
