package io.github.primelib.jira4j.restv2.model;

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
 * SearchAutoCompleteFilter
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "includeCollapsedFields",
    "projectIds"
})
@JsonTypeName("SearchAutoCompleteFilter")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchAutoCompleteFilter {

    /**
     * Constructs a validated implementation of {@link SearchAutoCompleteFilter}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SearchAutoCompleteFilter(Consumer<SearchAutoCompleteFilter> spec) {
        spec.accept(this);
    }

    /**
     * Include collapsed fields for fields that have non-unique names.
     */
    @JsonProperty("includeCollapsedFields")
    protected Boolean includeCollapsedFields = false;

    /**
     * List of project IDs used to filter the visible field details returned.
     */
    @JsonProperty("projectIds")
    protected List<Long> projectIds;


}
