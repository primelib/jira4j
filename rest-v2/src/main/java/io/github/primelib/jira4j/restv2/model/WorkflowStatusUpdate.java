package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkflowStatusUpdate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "description",
    "id",
    "name",
    "statusCategory",
    "statusReference"
})
@JsonTypeName("WorkflowStatusUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowStatusUpdate extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link WorkflowStatusUpdate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowStatusUpdate(Consumer<WorkflowStatusUpdate> spec) {
        spec.accept(this);
    }

    /**
     * The description of the status.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the status.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the status.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The category of the status.
     */
    @JsonProperty("statusCategory")
    protected StatusCategoryEnum statusCategory;

    /**
     * The reference of the status.
     */
    @JsonProperty("statusReference")
    protected String statusReference;


    /**
     * The category of the status.
     */
    @AllArgsConstructor
    public enum StatusCategoryEnum {
        TODO("TODO"),
        IN_PROGRESS("IN_PROGRESS"),
        DONE("DONE");

        private final String value;
    }

}
