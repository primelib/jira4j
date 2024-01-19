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
 * WorkflowSchemeIdName
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
    "id",
    "name"
})
@JsonTypeName("WorkflowSchemeIdName")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowSchemeIdName {

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

    /**
     * Constructs a validated instance of {@link WorkflowSchemeIdName}.
     *
     * @param spec the specification to process
     */
    public WorkflowSchemeIdName(Consumer<WorkflowSchemeIdName> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowSchemeIdName}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowSchemeIdName(Consumer)} instead.
     * @param id The ID of the workflow scheme.
     * @param name The name of the workflow scheme.
     */
    @ApiStatus.Internal
    public WorkflowSchemeIdName(String id, String name) {
        this.id = id;
        this.name = name;
    }

}
