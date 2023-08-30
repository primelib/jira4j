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

import java.net.URI;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VersionIssueCounts
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
     * Count of issues where the {@code affectedVersion} is set to the version.
     */
    @JsonProperty("issuesAffectedCount")
    protected Long issuesAffectedCount;

    /**
     * Count of issues where the {@code fixVersion} is set to the version.
     */
    @JsonProperty("issuesFixedCount")
    protected Long issuesFixedCount;

    /**
     * The URL of these count details.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * Constructs a validated instance of {@link VersionIssueCounts}.
     *
     * @param spec the specification to process
     */
    public VersionIssueCounts(Consumer<VersionIssueCounts> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link VersionIssueCounts}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #VersionIssueCounts(Consumer)} instead.
     * @param customFieldUsage List of custom fields using the version.
     * @param issueCountWithCustomFieldsShowingVersion Count of issues where a version custom field is set to the version.
     * @param issuesAffectedCount Count of issues where the {@code affectedVersion} is set to the version.
     * @param issuesFixedCount Count of issues where the {@code fixVersion} is set to the version.
     * @param self The URL of these count details.
     */
    @ApiStatus.Internal
    public VersionIssueCounts(List<VersionUsageInCustomField> customFieldUsage, Long issueCountWithCustomFieldsShowingVersion, Long issuesAffectedCount, Long issuesFixedCount, URI self) {
        this.customFieldUsage = customFieldUsage;
        this.issueCountWithCustomFieldsShowingVersion = issueCountWithCustomFieldsShowingVersion;
        this.issuesAffectedCount = issuesAffectedCount;
        this.issuesFixedCount = issuesFixedCount;
        this.self = self;
    }

}
