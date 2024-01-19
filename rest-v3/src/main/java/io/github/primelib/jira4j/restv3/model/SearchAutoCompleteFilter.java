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
 * SearchAutoCompleteFilter
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
    "includeCollapsedFields",
    "projectIds"
})
@JsonTypeName("SearchAutoCompleteFilter")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchAutoCompleteFilter {

    /**
     * Include collapsed fields for fields that have non-unique names.
     */
    @JsonProperty("includeCollapsedFields")
    protected Boolean includeCollapsedFields;

    /**
     * List of project IDs used to filter the visible field details returned.
     */
    @JsonProperty("projectIds")
    protected List<Long> projectIds;

    /**
     * Constructs a validated instance of {@link SearchAutoCompleteFilter}.
     *
     * @param spec the specification to process
     */
    public SearchAutoCompleteFilter(Consumer<SearchAutoCompleteFilter> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SearchAutoCompleteFilter}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SearchAutoCompleteFilter(Consumer)} instead.
     * @param includeCollapsedFields Include collapsed fields for fields that have non-unique names.
     * @param projectIds List of project IDs used to filter the visible field details returned.
     */
    @ApiStatus.Internal
    public SearchAutoCompleteFilter(Boolean includeCollapsedFields, List<Long> projectIds) {
        this.includeCollapsedFields = includeCollapsedFields;
        this.projectIds = projectIds;
    }

}
