package io.github.primelib.jira4j.restv2.model;

import java.util.Map;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PublishDraftWorkflowScheme
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "statusMappings"
})
@JsonTypeName("PublishDraftWorkflowScheme")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PublishDraftWorkflowScheme {

    /**
     * Constructs a validated implementation of {@link PublishDraftWorkflowScheme}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PublishDraftWorkflowScheme(Consumer<PublishDraftWorkflowScheme> spec) {
        spec.accept(this);
    }

    /**
     * Mappings of statuses to new statuses for issue types.
     */
    @JsonProperty("statusMappings")
    protected Set<StatusMapping> statusMappings;


}
