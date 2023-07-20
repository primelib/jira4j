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
 * PublishedWorkflowId
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "entityId",
    "name"
})
@JsonTypeName("PublishedWorkflowId")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PublishedWorkflowId {

    /**
     * Constructs a validated implementation of {@link PublishedWorkflowId}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PublishedWorkflowId(Consumer<PublishedWorkflowId> spec) {
        spec.accept(this);
    }

    /**
     * The entity ID of the workflow.
     */
    @JsonProperty("entityId")
    protected String entityId;

    /**
     * The name of the workflow.
     */
    @JsonProperty("name")
    protected String name;


}
