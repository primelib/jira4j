package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssuesAndJQLQueries
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueIds",
    "jqls"
})
@JsonTypeName("IssuesAndJQLQueries")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssuesAndJQLQueries {

    /**
     * Constructs a validated implementation of {@link IssuesAndJQLQueries}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssuesAndJQLQueries(Consumer<IssuesAndJQLQueries> spec) {
        spec.accept(this);
    }

    /**
     * A list of issue IDs.
     */
    @JsonProperty("issueIds")
    protected Set<Long> issueIds = new LinkedHashSet<>();

    /**
     * A list of JQL queries.
     */
    @JsonProperty("jqls")
    protected List<String> jqls = new ArrayList<>();


}
