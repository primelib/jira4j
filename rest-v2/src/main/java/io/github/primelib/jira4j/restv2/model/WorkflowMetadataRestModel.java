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
 * WorkflowMetadataRestModel
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
    "description",
    "id",
    "name",
    "usage",
    "version"
})
@JsonTypeName("WorkflowMetadataRestModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowMetadataRestModel {

    /**
     * The description of the workflow.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the workflow.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the workflow.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Use the optional {@code workflows.usages} expand to get additional information about the projects and issue types associated with the workflows in the workflow scheme.
     */
    @JsonProperty("usage")
    protected List<SimpleUsage> usage;

    @JsonProperty("version")
    protected DocumentVersion version;

    /**
     * Constructs a validated instance of {@link WorkflowMetadataRestModel}.
     *
     * @param spec the specification to process
     */
    public WorkflowMetadataRestModel(Consumer<WorkflowMetadataRestModel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowMetadataRestModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowMetadataRestModel(Consumer)} instead.
     * @param description The description of the workflow.
     * @param id The ID of the workflow.
     * @param name The name of the workflow.
     * @param usage Use the optional {@code workflows.usages} expand to get additional information about the projects and issue types associated with the workflows in the workflow scheme.
     * @param version version
     */
    @ApiStatus.Internal
    public WorkflowMetadataRestModel(String description, String id, String name, List<SimpleUsage> usage, DocumentVersion version) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.usage = usage;
        this.version = version;
    }

}
