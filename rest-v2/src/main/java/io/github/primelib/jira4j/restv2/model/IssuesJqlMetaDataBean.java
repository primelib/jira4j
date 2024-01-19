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
 * IssuesJqlMetaDataBean
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
    "count",
    "maxResults",
    "startAt",
    "totalCount",
    "validationWarnings"
})
@JsonTypeName("IssuesJqlMetaDataBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssuesJqlMetaDataBean {

    /**
     * The number of issues that were loaded in this evaluation.
     */
    @JsonProperty("count")
    protected Integer count;

    /**
     * The maximum number of issues that could be loaded in this evaluation.
     */
    @JsonProperty("maxResults")
    protected Integer maxResults;

    /**
     * The index of the first issue.
     */
    @JsonProperty("startAt")
    protected Long startAt;

    /**
     * The total number of issues the JQL returned.
     */
    @JsonProperty("totalCount")
    protected Long totalCount;

    /**
     * Any warnings related to the JQL query. Present only if the validation mode was set to {@code warn}.
     */
    @JsonProperty("validationWarnings")
    protected List<String> validationWarnings;

    /**
     * Constructs a validated instance of {@link IssuesJqlMetaDataBean}.
     *
     * @param spec the specification to process
     */
    public IssuesJqlMetaDataBean(Consumer<IssuesJqlMetaDataBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssuesJqlMetaDataBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssuesJqlMetaDataBean(Consumer)} instead.
     * @param count The number of issues that were loaded in this evaluation.
     * @param maxResults The maximum number of issues that could be loaded in this evaluation.
     * @param startAt The index of the first issue.
     * @param totalCount The total number of issues the JQL returned.
     * @param validationWarnings Any warnings related to the JQL query. Present only if the validation mode was set to {@code warn}.
     */
    @ApiStatus.Internal
    public IssuesJqlMetaDataBean(Integer count, Integer maxResults, Long startAt, Long totalCount, List<String> validationWarnings) {
        this.count = count;
        this.maxResults = maxResults;
        this.startAt = startAt;
        this.totalCount = totalCount;
        this.validationWarnings = validationWarnings;
    }

}
