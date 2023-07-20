package io.github.primelib.jira4j.restv2.model;

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
 * WorkflowCreateValidateRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "payload",
    "validationOptions"
})
@JsonTypeName("WorkflowCreateValidateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowCreateValidateRequest {

    /**
     * Constructs a validated implementation of {@link WorkflowCreateValidateRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowCreateValidateRequest(Consumer<WorkflowCreateValidateRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("payload")
    protected WorkflowCreateRequest payload;

    @JsonProperty("validationOptions")
    protected ValidationOptionsForCreate validationOptions;


}
