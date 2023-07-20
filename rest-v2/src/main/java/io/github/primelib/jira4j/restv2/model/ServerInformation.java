package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServerInformation
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "baseUrl",
    "buildDate",
    "buildNumber",
    "deploymentType",
    "healthChecks",
    "scmInfo",
    "serverTime",
    "serverTitle",
    "version",
    "versionNumbers"
})
@JsonTypeName("ServerInformation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServerInformation {

    /**
     * Constructs a validated implementation of {@link ServerInformation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServerInformation(Consumer<ServerInformation> spec) {
        spec.accept(this);
    }

    /**
     * The base URL of the Jira instance.
     */
    @JsonProperty("baseUrl")
    protected String baseUrl;

    /**
     * The timestamp when the Jira version was built.
     */
    @JsonProperty("buildDate")
    protected OffsetDateTime buildDate;

    /**
     * The build number of the Jira version.
     */
    @JsonProperty("buildNumber")
    protected Integer buildNumber;

    /**
     * The type of server deployment. This is always returned as *Cloud*.
     */
    @JsonProperty("deploymentType")
    protected String deploymentType;

    /**
     * Jira instance health check results. Deprecated and no longer returned.
     */
    @JsonProperty("healthChecks")
    protected List<HealthCheckResult> healthChecks;

    /**
     * The unique identifier of the Jira version.
     */
    @JsonProperty("scmInfo")
    protected String scmInfo;

    /**
     * The time in Jira when this request was responded to.
     */
    @JsonProperty("serverTime")
    protected OffsetDateTime serverTime;

    /**
     * The name of the Jira instance.
     */
    @JsonProperty("serverTitle")
    protected String serverTitle;

    /**
     * The version of Jira.
     */
    @JsonProperty("version")
    protected String version;

    /**
     * The major, minor, and revision version numbers of the Jira version.
     */
    @JsonProperty("versionNumbers")
    protected List<Integer> versionNumbers;


}
