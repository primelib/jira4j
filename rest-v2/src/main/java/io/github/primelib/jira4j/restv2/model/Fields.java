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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Fields
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
    "assignee",
    "issueType",
    "priority",
    "status",
    "summary",
    "timetracking"
})
@JsonTypeName("Fields")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Fields {

    @JsonProperty("assignee")
    protected FieldsAssignee assignee;

    @JsonProperty("issueType")
    protected FieldsIssueType issueType;

    @JsonProperty("priority")
    protected FieldsPriority priority;

    @JsonProperty("status")
    protected FieldsStatus status;

    /**
     * The summary description of the linked issue.
     */
    @JsonProperty("summary")
    protected String summary;

    @JsonProperty("timetracking")
    protected FieldsTimetracking timetracking;

    /**
     * Constructs a validated instance of {@link Fields}.
     *
     * @param spec the specification to process
     */
    public Fields(Consumer<Fields> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Fields}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Fields(Consumer)} instead.
     * @param assignee assignee
     * @param issueType issueType
     * @param priority priority
     * @param status status
     * @param summary The summary description of the linked issue.
     * @param timetracking timetracking
     */
    @ApiStatus.Internal
    public Fields(FieldsAssignee assignee, FieldsIssueType issueType, FieldsPriority priority, FieldsStatus status, String summary, FieldsTimetracking timetracking) {
        this.assignee = assignee;
        this.issueType = issueType;
        this.priority = priority;
        this.status = status;
        this.summary = summary;
        this.timetracking = timetracking;
    }

}
