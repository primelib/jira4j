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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExportArchivedIssuesTaskProgressResponse
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
    "fileUrl",
    "payload",
    "progress",
    "status",
    "submittedTime",
    "taskId"
})
@JsonTypeName("ExportArchivedIssuesTaskProgressResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ExportArchivedIssuesTaskProgressResponse {

    @JsonProperty("fileUrl")
    protected String fileUrl;

    @JsonProperty("payload")
    protected String payload;

    @JsonProperty("progress")
    protected Long progress;

    @JsonProperty("status")
    protected String status;

    @JsonProperty("submittedTime")
    protected OffsetDateTime submittedTime;

    @JsonProperty("taskId")
    protected String taskId;

    /**
     * Constructs a validated instance of {@link ExportArchivedIssuesTaskProgressResponse}.
     *
     * @param spec the specification to process
     */
    public ExportArchivedIssuesTaskProgressResponse(Consumer<ExportArchivedIssuesTaskProgressResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ExportArchivedIssuesTaskProgressResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ExportArchivedIssuesTaskProgressResponse(Consumer)} instead.
     * @param fileUrl fileUrl
     * @param payload payload
     * @param progress progress
     * @param status status
     * @param submittedTime submittedTime
     * @param taskId taskId
     */
    @ApiStatus.Internal
    public ExportArchivedIssuesTaskProgressResponse(String fileUrl, String payload, Long progress, String status, OffsetDateTime submittedTime, String taskId) {
        this.fileUrl = fileUrl;
        this.payload = payload;
        this.progress = progress;
        this.status = status;
        this.submittedTime = submittedTime;
        this.taskId = taskId;
    }

}
