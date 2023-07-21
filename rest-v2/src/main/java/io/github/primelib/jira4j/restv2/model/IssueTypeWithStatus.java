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
 * IssueTypeWithStatus
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
    "name",
    "self",
    "statuses",
    "subtask"
})
@JsonTypeName("IssueTypeWithStatus")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeWithStatus {

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
    protected List<StatusDetails> statuses;

    /**
     * Whether this issue type represents subtasks.
     */
    @JsonProperty("subtask")
    protected Boolean subtask;

    /**
     * Constructs a validated instance of {@link IssueTypeWithStatus}.
     *
     * @param spec the specification to process
     */
    public IssueTypeWithStatus(Consumer<IssueTypeWithStatus> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeWithStatus}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeWithStatus(Consumer)} instead.
     * @param id The ID of the issue type.
     * @param name The name of the issue type.
     * @param self The URL of the issue type's status details.
     * @param statuses List of status details for the issue type.
     * @param subtask Whether this issue type represents subtasks.
     */
    @ApiStatus.Internal
    public IssueTypeWithStatus(String id, String name, String self, List<StatusDetails> statuses, Boolean subtask) {
        this.id = id;
        this.name = name;
        this.self = self;
        this.statuses = statuses;
        this.subtask = subtask;
    }

}
