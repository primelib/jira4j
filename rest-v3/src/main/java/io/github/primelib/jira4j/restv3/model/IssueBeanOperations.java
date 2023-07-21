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
 * IssueBeanOperations
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
    "linkGroups"
})
@JsonTypeName("IssueBean_operations")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueBeanOperations {

    /**
     * Details of the link groups defining issue operations.
     */
    @JsonProperty("linkGroups")
    protected List<LinkGroup> linkGroups;

    /**
     * Constructs a validated instance of {@link IssueBeanOperations}.
     *
     * @param spec the specification to process
     */
    public IssueBeanOperations(Consumer<IssueBeanOperations> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueBeanOperations}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueBeanOperations(Consumer)} instead.
     * @param linkGroups Details of the link groups defining issue operations.
     */
    @ApiStatus.Internal
    public IssueBeanOperations(List<LinkGroup> linkGroups) {
        this.linkGroups = linkGroups;
    }

}
