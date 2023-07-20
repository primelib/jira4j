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
 * IssueBeanOperations
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "linkGroups"
})
@JsonTypeName("IssueBean_operations")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueBeanOperations {

    /**
     * Constructs a validated implementation of {@link IssueBeanOperations}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueBeanOperations(Consumer<IssueBeanOperations> spec) {
        spec.accept(this);
    }

    /**
     * Details of the link groups defining issue operations.
     */
    @JsonProperty("linkGroups")
    protected List<LinkGroup> linkGroups;


}
