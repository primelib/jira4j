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
 * PageOfCreateMetaIssueTypes
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
    "createMetaIssueType",
    "issueTypes",
    "maxResults",
    "startAt",
    "total"
})
@JsonTypeName("PageOfCreateMetaIssueTypes")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PageOfCreateMetaIssueTypes {

    @JsonProperty("createMetaIssueType")
    protected List<IssueTypeIssueCreateMetadata> createMetaIssueType;

    /**
     * The list of CreateMetaIssueType.
     */
    @JsonProperty("issueTypes")
    protected List<IssueTypeIssueCreateMetadata> issueTypes;

    /**
     * The maximum number of items to return per page.
     */
    @JsonProperty("maxResults")
    protected Integer maxResults;

    /**
     * The index of the first item returned.
     */
    @JsonProperty("startAt")
    protected Long startAt;

    /**
     * The total number of items in all pages.
     */
    @JsonProperty("total")
    protected Long total;

    /**
     * Constructs a validated instance of {@link PageOfCreateMetaIssueTypes}.
     *
     * @param spec the specification to process
     */
    public PageOfCreateMetaIssueTypes(Consumer<PageOfCreateMetaIssueTypes> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PageOfCreateMetaIssueTypes}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PageOfCreateMetaIssueTypes(Consumer)} instead.
     * @param createMetaIssueType createMetaIssueType
     * @param issueTypes The list of CreateMetaIssueType.
     * @param maxResults The maximum number of items to return per page.
     * @param startAt The index of the first item returned.
     * @param total The total number of items in all pages.
     */
    @ApiStatus.Internal
    public PageOfCreateMetaIssueTypes(List<IssueTypeIssueCreateMetadata> createMetaIssueType, List<IssueTypeIssueCreateMetadata> issueTypes, Integer maxResults, Long startAt, Long total) {
        this.createMetaIssueType = createMetaIssueType;
        this.issueTypes = issueTypes;
        this.maxResults = maxResults;
        this.startAt = startAt;
        this.total = total;
    }

}
