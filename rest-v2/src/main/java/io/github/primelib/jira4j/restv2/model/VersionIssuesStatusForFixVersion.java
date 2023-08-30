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
 * VersionIssuesStatusForFixVersion
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
    "done",
    "inProgress",
    "toDo",
    "unmapped"
})
@JsonTypeName("Version_issuesStatusForFixVersion")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class VersionIssuesStatusForFixVersion {

    /**
     * Count of issues with status *done*.
     */
    @JsonProperty("done")
    protected Long done;

    /**
     * Count of issues with status *in progress*.
     */
    @JsonProperty("inProgress")
    protected Long inProgress;

    /**
     * Count of issues with status *to do*.
     */
    @JsonProperty("toDo")
    protected Long toDo;

    /**
     * Count of issues with a status other than *to do*, *in progress*, and *done*.
     */
    @JsonProperty("unmapped")
    protected Long unmapped;

    /**
     * Constructs a validated instance of {@link VersionIssuesStatusForFixVersion}.
     *
     * @param spec the specification to process
     */
    public VersionIssuesStatusForFixVersion(Consumer<VersionIssuesStatusForFixVersion> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link VersionIssuesStatusForFixVersion}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #VersionIssuesStatusForFixVersion(Consumer)} instead.
     * @param done Count of issues with status *done*.
     * @param inProgress Count of issues with status *in progress*.
     * @param toDo Count of issues with status *to do*.
     * @param unmapped Count of issues with a status other than *to do*, *in progress*, and *done*.
     */
    @ApiStatus.Internal
    public VersionIssuesStatusForFixVersion(Long done, Long inProgress, Long toDo, Long unmapped) {
        this.done = done;
        this.inProgress = inProgress;
        this.toDo = toDo;
        this.unmapped = unmapped;
    }

}
