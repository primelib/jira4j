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
 * IssueList
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
    "issueIds"
})
@JsonTypeName("IssueList")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueList {

    /**
     * The list of issue IDs.
     */
    @JsonProperty("issueIds")
    protected List<String> issueIds;

    /**
     * Constructs a validated instance of {@link IssueList}.
     *
     * @param spec the specification to process
     */
    public IssueList(Consumer<IssueList> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueList}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueList(Consumer)} instead.
     * @param issueIds The list of issue IDs.
     */
    @ApiStatus.Internal
    public IssueList(List<String> issueIds) {
        this.issueIds = issueIds;
    }

}
