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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * TaskProgressBeanRemoveOptionFromIssuesResult
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
@JsonTypeName("TaskProgressBeanRemoveOptionFromIssuesResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TaskProgressBeanRemoveOptionFromIssuesResult {

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

    @JsonProperty("result")
    protected TaskProgressBeanRemoveOptionFromIssuesResultResult result;

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
     * Constructs a validated instance of {@link TaskProgressBeanRemoveOptionFromIssuesResult}.
     *
     * @param spec the specification to process
     */
    public TaskProgressBeanRemoveOptionFromIssuesResult(Consumer<TaskProgressBeanRemoveOptionFromIssuesResult> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TaskProgressBeanRemoveOptionFromIssuesResult}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TaskProgressBeanRemoveOptionFromIssuesResult(Consumer)} instead.
     * @param description The description of the task.
     * @param elapsedRuntime The execution time of the task, in milliseconds.
     * @param finished A timestamp recording when the task was finished.
     * @param id The ID of the task.
     * @param lastUpdate A timestamp recording when the task progress was last updated.
     * @param message Information about the progress of the task.
     * @param progress The progress of the task, as a percentage complete.
     * @param result result
     * @param self The URL of the task.
     * @param started A timestamp recording when the task was started.
     * @param status The status of the task.
     * @param submitted A timestamp recording when the task was submitted.
     * @param submittedBy The ID of the user who submitted the task.
     */
    @ApiStatus.Internal
    public TaskProgressBeanRemoveOptionFromIssuesResult(String description, Long elapsedRuntime, Long finished, String id, Long lastUpdate, String message, Long progress, TaskProgressBeanRemoveOptionFromIssuesResultResult result, URI self, Long started, StatusEnum status, Long submitted, Long submittedBy) {
        this.description = description;
        this.elapsedRuntime = elapsedRuntime;
        this.finished = finished;
        this.id = id;
        this.lastUpdate = lastUpdate;
        this.message = message;
        this.progress = progress;
        this.result = result;
        this.self = self;
        this.started = started;
        this.status = status;
        this.submitted = submitted;
        this.submittedBy = submittedBy;
    }

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

        private static final StatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StatusEnum of(String input) {
            if (input != null) {
                for (StatusEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
