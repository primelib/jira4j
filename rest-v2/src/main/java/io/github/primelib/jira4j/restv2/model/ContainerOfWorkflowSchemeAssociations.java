package io.github.primelib.jira4j.restv2.model;

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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContainerOfWorkflowSchemeAssociations
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
    "values"
})
@JsonTypeName("ContainerOfWorkflowSchemeAssociations")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContainerOfWorkflowSchemeAssociations {

    /**
     * A list of workflow schemes together with projects they are associated with.
     */
    @JsonProperty("values")
    protected List<WorkflowSchemeAssociations> values;

    /**
     * Constructs a validated instance of {@link ContainerOfWorkflowSchemeAssociations}.
     *
     * @param spec the specification to process
     */
    public ContainerOfWorkflowSchemeAssociations(Consumer<ContainerOfWorkflowSchemeAssociations> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContainerOfWorkflowSchemeAssociations}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContainerOfWorkflowSchemeAssociations(Consumer)} instead.
     * @param values A list of workflow schemes together with projects they are associated with.
     */
    @ApiStatus.Internal
    public ContainerOfWorkflowSchemeAssociations(List<WorkflowSchemeAssociations> values) {
        this.values = values;
    }

}
