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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PageOfCreateMetaIssueTypeWithField
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
    "fields",
    "maxResults",
    "results",
    "startAt",
    "total"
})
@JsonTypeName("PageOfCreateMetaIssueTypeWithField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PageOfCreateMetaIssueTypeWithField {

    /**
     * The collection of FieldCreateMetaBeans.
     */
    @JsonProperty("fields")
    protected List<FieldCreateMetadata> fields;

    /**
     * The maximum number of items to return per page.
     */
    @JsonProperty("maxResults")
    protected Integer maxResults;

    @JsonProperty("results")
    protected List<FieldCreateMetadata> results;

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
     * Constructs a validated instance of {@link PageOfCreateMetaIssueTypeWithField}.
     *
     * @param spec the specification to process
     */
    public PageOfCreateMetaIssueTypeWithField(Consumer<PageOfCreateMetaIssueTypeWithField> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PageOfCreateMetaIssueTypeWithField}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PageOfCreateMetaIssueTypeWithField(Consumer)} instead.
     * @param fields The collection of FieldCreateMetaBeans.
     * @param maxResults The maximum number of items to return per page.
     * @param results results
     * @param startAt The index of the first item returned.
     * @param total The total number of items in all pages.
     */
    @ApiStatus.Internal
    public PageOfCreateMetaIssueTypeWithField(List<FieldCreateMetadata> fields, Integer maxResults, List<FieldCreateMetadata> results, Long startAt, Long total) {
        this.fields = fields;
        this.maxResults = maxResults;
        this.results = results;
        this.startAt = startAt;
        this.total = total;
    }

}
