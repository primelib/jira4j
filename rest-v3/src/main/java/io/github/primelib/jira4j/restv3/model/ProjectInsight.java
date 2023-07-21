package io.github.primelib.jira4j.restv3.model;

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
 * ProjectInsight
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
    "lastIssueUpdateTime",
    "totalIssueCount"
})
@JsonTypeName("ProjectInsight")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectInsight {

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

    /**
     * Constructs a validated instance of {@link ProjectInsight}.
     *
     * @param spec the specification to process
     */
    public ProjectInsight(Consumer<ProjectInsight> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectInsight}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectInsight(Consumer)} instead.
     * @param lastIssueUpdateTime The last issue update time.
     * @param totalIssueCount Total issue count.
     */
    @ApiStatus.Internal
    public ProjectInsight(OffsetDateTime lastIssueUpdateTime, Long totalIssueCount) {
        this.lastIssueUpdateTime = lastIssueUpdateTime;
        this.totalIssueCount = totalIssueCount;
    }

}
