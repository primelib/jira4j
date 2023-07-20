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
 * LinkedIssueFields
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "assignee",
    "issueType",
    "issuetype",
    "priority",
    "status",
    "summary",
    "timetracking"
})
@JsonTypeName("LinkedIssue_fields")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LinkedIssueFields {

    /**
     * Constructs a validated implementation of {@link LinkedIssueFields}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public LinkedIssueFields(Consumer<LinkedIssueFields> spec) {
        spec.accept(this);
    }

    @JsonProperty("assignee")
    protected FieldsAssignee assignee;

    @JsonProperty("issueType")
    protected FieldsIssueType issueType;

    @JsonProperty("issuetype")
    protected IssueTypeDetails issuetype;

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


}
