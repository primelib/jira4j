package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueChangelogIds
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "changelogIds"
})
@JsonTypeName("IssueChangelogIds")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueChangelogIds {

    /**
     * Constructs a validated implementation of {@link IssueChangelogIds}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueChangelogIds(Consumer<IssueChangelogIds> spec) {
        spec.accept(this);
    }

    /**
     * The list of changelog IDs.
     */
    @JsonProperty("changelogIds")
    protected Set<Long> changelogIds = new LinkedHashSet<>();


}
