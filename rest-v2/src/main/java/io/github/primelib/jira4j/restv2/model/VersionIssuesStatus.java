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
 * VersionIssuesStatus
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "done",
    "inProgress",
    "toDo",
    "unmapped"
})
@JsonTypeName("VersionIssuesStatus")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class VersionIssuesStatus extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link VersionIssuesStatus}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public VersionIssuesStatus(Consumer<VersionIssuesStatus> spec) {
        spec.accept(this);
    }

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


}
