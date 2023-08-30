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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configuration
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
    "attachmentsEnabled",
    "issueLinkingEnabled",
    "subTasksEnabled",
    "timeTrackingConfiguration",
    "timeTrackingEnabled",
    "unassignedIssuesAllowed",
    "votingEnabled",
    "watchingEnabled"
})
@JsonTypeName("Configuration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Configuration {

    /**
     * Whether the ability to add attachments to issues is enabled.
     */
    @JsonProperty("attachmentsEnabled")
    protected Boolean attachmentsEnabled;

    /**
     * Whether the ability to link issues is enabled.
     */
    @JsonProperty("issueLinkingEnabled")
    protected Boolean issueLinkingEnabled;

    /**
     * Whether the ability to create subtasks for issues is enabled.
     */
    @JsonProperty("subTasksEnabled")
    protected Boolean subTasksEnabled;

    @JsonProperty("timeTrackingConfiguration")
    protected ConfigurationTimeTrackingConfiguration timeTrackingConfiguration;

    /**
     * Whether the ability to track time is enabled. This property is deprecated.
     */
    @JsonProperty("timeTrackingEnabled")
    protected Boolean timeTrackingEnabled;

    /**
     * Whether the ability to create unassigned issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
     */
    @JsonProperty("unassignedIssuesAllowed")
    protected Boolean unassignedIssuesAllowed;

    /**
     * Whether the ability for users to vote on issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
     */
    @JsonProperty("votingEnabled")
    protected Boolean votingEnabled;

    /**
     * Whether the ability for users to watch issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
     */
    @JsonProperty("watchingEnabled")
    protected Boolean watchingEnabled;

    /**
     * Constructs a validated instance of {@link Configuration}.
     *
     * @param spec the specification to process
     */
    public Configuration(Consumer<Configuration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Configuration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Configuration(Consumer)} instead.
     * @param attachmentsEnabled Whether the ability to add attachments to issues is enabled.
     * @param issueLinkingEnabled Whether the ability to link issues is enabled.
     * @param subTasksEnabled Whether the ability to create subtasks for issues is enabled.
     * @param timeTrackingConfiguration timeTrackingConfiguration
     * @param timeTrackingEnabled Whether the ability to track time is enabled. This property is deprecated.
     * @param unassignedIssuesAllowed Whether the ability to create unassigned issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
     * @param votingEnabled Whether the ability for users to vote on issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
     * @param watchingEnabled Whether the ability for users to watch issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
     */
    @ApiStatus.Internal
    public Configuration(Boolean attachmentsEnabled, Boolean issueLinkingEnabled, Boolean subTasksEnabled, ConfigurationTimeTrackingConfiguration timeTrackingConfiguration, Boolean timeTrackingEnabled, Boolean unassignedIssuesAllowed, Boolean votingEnabled, Boolean watchingEnabled) {
        this.attachmentsEnabled = attachmentsEnabled;
        this.issueLinkingEnabled = issueLinkingEnabled;
        this.subTasksEnabled = subTasksEnabled;
        this.timeTrackingConfiguration = timeTrackingConfiguration;
        this.timeTrackingEnabled = timeTrackingEnabled;
        this.unassignedIssuesAllowed = unassignedIssuesAllowed;
        this.votingEnabled = votingEnabled;
        this.watchingEnabled = watchingEnabled;
    }

}
