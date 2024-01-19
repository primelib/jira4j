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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueChangelogIds
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
    "changelogIds"
})
@JsonTypeName("IssueChangelogIds")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueChangelogIds {

    /**
     * The list of changelog IDs.
     */
    @JsonProperty("changelogIds")
    protected Set<Long> changelogIds;

    /**
     * Constructs a validated instance of {@link IssueChangelogIds}.
     *
     * @param spec the specification to process
     */
    public IssueChangelogIds(Consumer<IssueChangelogIds> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueChangelogIds}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueChangelogIds(Consumer)} instead.
     * @param changelogIds The list of changelog IDs.
     */
    @ApiStatus.Internal
    public IssueChangelogIds(Set<Long> changelogIds) {
        this.changelogIds = changelogIds;
    }

}
