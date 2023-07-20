package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowValidationErrorList
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "errors"
})
@JsonTypeName("WorkflowValidationErrorList")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowValidationErrorList {

    /**
     * Constructs a validated implementation of {@link WorkflowValidationErrorList}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowValidationErrorList(Consumer<WorkflowValidationErrorList> spec) {
        spec.accept(this);
    }

    /**
     * The list of validation errors.
     */
    @JsonProperty("errors")
    protected List<WorkflowValidationError> errors;


}
