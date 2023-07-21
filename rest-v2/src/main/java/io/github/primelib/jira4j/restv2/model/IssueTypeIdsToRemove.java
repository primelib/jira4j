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
 * IssueTypeIdsToRemove
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
    "issueTypeIds"
})
@JsonTypeName("IssueTypeIdsToRemove")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeIdsToRemove {

    /**
     * The list of issue type IDs. Must contain unique values not longer than 255 characters and not be empty. Maximum of 100 IDs.
     */
    @JsonProperty("issueTypeIds")
    protected List<String> issueTypeIds;

    /**
     * Constructs a validated instance of {@link IssueTypeIdsToRemove}.
     *
     * @param spec the specification to process
     */
    public IssueTypeIdsToRemove(Consumer<IssueTypeIdsToRemove> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeIdsToRemove}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeIdsToRemove(Consumer)} instead.
     * @param issueTypeIds The list of issue type IDs. Must contain unique values not longer than 255 characters and not be empty. Maximum of 100 IDs.
     */
    @ApiStatus.Internal
    public IssueTypeIdsToRemove(List<String> issueTypeIds) {
        this.issueTypeIds = issueTypeIds;
    }

}
