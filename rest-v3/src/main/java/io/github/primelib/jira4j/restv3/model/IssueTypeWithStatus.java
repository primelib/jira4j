package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueTypeWithStatus
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "name",
    "self",
    "statuses",
    "subtask"
})
@JsonTypeName("IssueTypeWithStatus")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeWithStatus {

    /**
     * Constructs a validated implementation of {@link IssueTypeWithStatus}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeWithStatus(Consumer<IssueTypeWithStatus> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the issue type.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the issue type.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URL of the issue type's status details.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * List of status details for the issue type.
     */
    @JsonProperty("statuses")
    protected List<StatusDetails> statuses = new ArrayList<>();

    /**
     * Whether this issue type represents subtasks.
     */
    @JsonProperty("subtask")
    protected Boolean subtask;


}
