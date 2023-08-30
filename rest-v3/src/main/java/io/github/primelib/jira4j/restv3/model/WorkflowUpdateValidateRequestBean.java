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
 * WorkflowUpdateValidateRequestBean
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
    "payload",
    "validationOptions"
})
@JsonTypeName("WorkflowUpdateValidateRequestBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowUpdateValidateRequestBean {

    @JsonProperty("payload")
    protected WorkflowUpdateRequest payload;

    @JsonProperty("validationOptions")
    protected ValidationOptionsForUpdate validationOptions;

    /**
     * Constructs a validated instance of {@link WorkflowUpdateValidateRequestBean}.
     *
     * @param spec the specification to process
     */
    public WorkflowUpdateValidateRequestBean(Consumer<WorkflowUpdateValidateRequestBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowUpdateValidateRequestBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowUpdateValidateRequestBean(Consumer)} instead.
     * @param payload payload
     * @param validationOptions validationOptions
     */
    @ApiStatus.Internal
    public WorkflowUpdateValidateRequestBean(WorkflowUpdateRequest payload, ValidationOptionsForUpdate validationOptions) {
        this.payload = payload;
        this.validationOptions = validationOptions;
    }

}
