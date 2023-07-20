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
 * BulkOperationErrorResult
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "elementErrors",
    "failedElementNumber",
    "status"
})
@JsonTypeName("BulkOperationErrorResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkOperationErrorResult {

    /**
     * Constructs a validated implementation of {@link BulkOperationErrorResult}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BulkOperationErrorResult(Consumer<BulkOperationErrorResult> spec) {
        spec.accept(this);
    }

    @JsonProperty("elementErrors")
    protected ErrorCollection elementErrors;

    @JsonProperty("failedElementNumber")
    protected Integer failedElementNumber;

    @JsonProperty("status")
    protected Integer status;


}
