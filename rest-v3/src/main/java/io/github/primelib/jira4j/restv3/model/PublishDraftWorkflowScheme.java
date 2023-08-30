package io.github.primelib.jira4j.restv3.model;

import java.util.Map;
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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PublishDraftWorkflowScheme
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
    "statusMappings"
})
@JsonTypeName("PublishDraftWorkflowScheme")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PublishDraftWorkflowScheme {

    /**
     * Mappings of statuses to new statuses for issue types.
     */
    @JsonProperty("statusMappings")
    protected Set<StatusMapping> statusMappings;

    /**
     * Constructs a validated instance of {@link PublishDraftWorkflowScheme}.
     *
     * @param spec the specification to process
     */
    public PublishDraftWorkflowScheme(Consumer<PublishDraftWorkflowScheme> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PublishDraftWorkflowScheme}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PublishDraftWorkflowScheme(Consumer)} instead.
     * @param statusMappings Mappings of statuses to new statuses for issue types.
     */
    @ApiStatus.Internal
    public PublishDraftWorkflowScheme(Set<StatusMapping> statusMappings) {
        this.statusMappings = statusMappings;
    }

}
