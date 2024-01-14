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
 * GetWorkflowTransitionRuleConfigurationsRequestRequestURL
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
    "length"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_requestURL")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestRequestURL {

    @JsonProperty("length")
    protected Integer length;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestRequestURL}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestRequestURL(Consumer<GetWorkflowTransitionRuleConfigurationsRequestRequestURL> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestRequestURL}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestRequestURL(Consumer)} instead.
     * @param length length
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestRequestURL(Integer length) {
        this.length = length;
    }

}
