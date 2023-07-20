package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VersionIssueCounts
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "customFieldUsage",
    "issueCountWithCustomFieldsShowingVersion",
    "issuesAffectedCount",
    "issuesFixedCount",
    "self"
})
@JsonTypeName("VersionIssueCounts")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class VersionIssueCounts {

    /**
     * Constructs a validated implementation of {@link VersionIssueCounts}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public VersionIssueCounts(Consumer<VersionIssueCounts> spec) {
        spec.accept(this);
    }

    /**
     * List of custom fields using the version.
     */
    @JsonProperty("customFieldUsage")
    protected List<VersionUsageInCustomField> customFieldUsage;

    /**
     * Count of issues where a version custom field is set to the version.
     */
    @JsonProperty("issueCountWithCustomFieldsShowingVersion")
    protected Long issueCountWithCustomFieldsShowingVersion;

    /**
     * Count of issues where the `affectedVersion` is set to the version.
     */
    @JsonProperty("issuesAffectedCount")
    protected Long issuesAffectedCount;

    /**
     * Count of issues where the `fixVersion` is set to the version.
     */
    @JsonProperty("issuesFixedCount")
    protected Long issuesFixedCount;

    /**
     * The URL of these count details.
     */
    @JsonProperty("self")
    protected URI self;


}
