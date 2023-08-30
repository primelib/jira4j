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
 * ArchivedIssuesFilterRequest
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
    "archivedBy",
    "archivedDateRange",
    "issueTypes",
    "projects",
    "reporters"
})
@JsonTypeName("ArchivedIssuesFilterRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ArchivedIssuesFilterRequest {

    /**
     * List archived issues archived by a specified account ID.
     */
    @JsonProperty("archivedBy")
    protected List<String> archivedBy;

    @JsonProperty("archivedDateRange")
    protected DateRangeFilterRequest archivedDateRange;

    /**
     * List archived issues with a specified issue type ID.
     */
    @JsonProperty("issueTypes")
    protected List<String> issueTypes;

    /**
     * List archived issues with a specified project key.
     */
    @JsonProperty("projects")
    protected List<String> projects;

    /**
     * List archived issues where the reporter is a specified account ID.
     */
    @JsonProperty("reporters")
    protected List<String> reporters;

    /**
     * Constructs a validated instance of {@link ArchivedIssuesFilterRequest}.
     *
     * @param spec the specification to process
     */
    public ArchivedIssuesFilterRequest(Consumer<ArchivedIssuesFilterRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ArchivedIssuesFilterRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ArchivedIssuesFilterRequest(Consumer)} instead.
     * @param archivedBy List archived issues archived by a specified account ID.
     * @param archivedDateRange archivedDateRange
     * @param issueTypes List archived issues with a specified issue type ID.
     * @param projects List archived issues with a specified project key.
     * @param reporters List archived issues where the reporter is a specified account ID.
     */
    @ApiStatus.Internal
    public ArchivedIssuesFilterRequest(List<String> archivedBy, DateRangeFilterRequest archivedDateRange, List<String> issueTypes, List<String> projects, List<String> reporters) {
        this.archivedBy = archivedBy;
        this.archivedDateRange = archivedDateRange;
        this.issueTypes = issueTypes;
        this.projects = projects;
        this.reporters = reporters;
    }

}
