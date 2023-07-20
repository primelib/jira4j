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
 * WorkflowSchemeIdName
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "name"
})
@JsonTypeName("WorkflowSchemeIdName")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowSchemeIdName {

    /**
     * Constructs a validated implementation of {@link WorkflowSchemeIdName}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowSchemeIdName(Consumer<WorkflowSchemeIdName> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the workflow scheme.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the workflow scheme.
     */
    @JsonProperty("name")
    protected String name;


}
