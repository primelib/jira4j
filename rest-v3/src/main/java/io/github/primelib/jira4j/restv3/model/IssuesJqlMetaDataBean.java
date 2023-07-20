package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssuesJqlMetaDataBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link IssuesJqlMetaDataBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssuesJqlMetaDataBean(Consumer<IssuesJqlMetaDataBean> spec) {
        spec.accept(this);
    }

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
     * Any warnings related to the JQL query. Present only if the validation mode was set to `warn`.
     */
    @JsonProperty("validationWarnings")
    protected List<String> validationWarnings;


}
