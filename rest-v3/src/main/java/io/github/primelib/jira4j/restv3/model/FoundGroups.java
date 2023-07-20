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
 * FoundGroups
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "groups",
    "header",
    "total"
})
@JsonTypeName("FoundGroups")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FoundGroups {

    /**
     * Constructs a validated implementation of {@link FoundGroups}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FoundGroups(Consumer<FoundGroups> spec) {
        spec.accept(this);
    }

    @JsonProperty("groups")
    protected List<FoundGroup> groups;

    /**
     * Header text indicating the number of groups in the response and the total number of groups found in the search.
     */
    @JsonProperty("header")
    protected String header;

    /**
     * The total number of groups found in the search.
     */
    @JsonProperty("total")
    protected Integer total;


}
