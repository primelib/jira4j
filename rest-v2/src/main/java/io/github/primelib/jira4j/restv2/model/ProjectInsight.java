package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectInsight
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "lastIssueUpdateTime",
    "totalIssueCount"
})
@JsonTypeName("ProjectInsight")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectInsight {

    /**
     * Constructs a validated implementation of {@link ProjectInsight}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectInsight(Consumer<ProjectInsight> spec) {
        spec.accept(this);
    }

    /**
     * The last issue update time.
     */
    @JsonProperty("lastIssueUpdateTime")
    protected OffsetDateTime lastIssueUpdateTime;

    /**
     * Total issue count.
     */
    @JsonProperty("totalIssueCount")
    protected Long totalIssueCount;


}
