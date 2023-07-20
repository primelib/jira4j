package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TaskProgressBeanObject
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "elapsedRuntime",
    "finished",
    "id",
    "lastUpdate",
    "message",
    "progress",
    "result",
    "self",
    "started",
    "status",
    "submitted",
    "submittedBy"
})
@JsonTypeName("TaskProgressBeanObject")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TaskProgressBeanObject {

    /**
     * Constructs a validated implementation of {@link TaskProgressBeanObject}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TaskProgressBeanObject(Consumer<TaskProgressBeanObject> spec) {
        spec.accept(this);
    }

    /**
     * The description of the task.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The execution time of the task, in milliseconds.
     */
    @JsonProperty("elapsedRuntime")
    protected Long elapsedRuntime;

    /**
     * A timestamp recording when the task was finished.
     */
    @JsonProperty("finished")
    protected Long finished;

    /**
     * The ID of the task.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * A timestamp recording when the task progress was last updated.
     */
    @JsonProperty("lastUpdate")
    protected Long lastUpdate;

    /**
     * Information about the progress of the task.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * The progress of the task, as a percentage complete.
     */
    @JsonProperty("progress")
    protected Long progress;

    /**
     * The result of the task execution.
     */
    @JsonProperty("result")
    protected Object result = null;

    /**
     * The URL of the task.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * A timestamp recording when the task was started.
     */
    @JsonProperty("started")
    protected Long started;

    /**
     * The status of the task.
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * A timestamp recording when the task was submitted.
     */
    @JsonProperty("submitted")
    protected Long submitted;

    /**
     * The ID of the user who submitted the task.
     */
    @JsonProperty("submittedBy")
    protected Long submittedBy;


    /**
     * The status of the task.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        ENQUEUED("ENQUEUED"),
        RUNNING("RUNNING"),
        COMPLETE("COMPLETE"),
        FAILED("FAILED"),
        CANCEL_REQUESTED("CANCEL_REQUESTED"),
        CANCELLED("CANCELLED"),
        DEAD("DEAD");

        private final String value;
    }

}
