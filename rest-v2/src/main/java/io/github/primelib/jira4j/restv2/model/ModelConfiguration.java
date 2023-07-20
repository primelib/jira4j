package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ModelConfiguration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
public class ModelConfiguration {

    /**
     * Constructs a validated implementation of {@link ModelConfiguration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ModelConfiguration(Consumer<ModelConfiguration> spec) {
        spec.accept(this);
    }

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


}
