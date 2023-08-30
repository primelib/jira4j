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
 * BulkOperationErrorResult
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
    "elementErrors",
    "failedElementNumber",
    "status"
})
@JsonTypeName("BulkOperationErrorResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkOperationErrorResult {

    @JsonProperty("elementErrors")
    protected ErrorCollection elementErrors;

    @JsonProperty("failedElementNumber")
    protected Integer failedElementNumber;

    @JsonProperty("status")
    protected Integer status;

    /**
     * Constructs a validated instance of {@link BulkOperationErrorResult}.
     *
     * @param spec the specification to process
     */
    public BulkOperationErrorResult(Consumer<BulkOperationErrorResult> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BulkOperationErrorResult}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BulkOperationErrorResult(Consumer)} instead.
     * @param elementErrors elementErrors
     * @param failedElementNumber failedElementNumber
     * @param status status
     */
    @ApiStatus.Internal
    public BulkOperationErrorResult(ErrorCollection elementErrors, Integer failedElementNumber, Integer status) {
        this.elementErrors = elementErrors;
        this.failedElementNumber = failedElementNumber;
        this.status = status;
    }

}
