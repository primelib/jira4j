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

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServerInformation
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
    "baseUrl",
    "buildDate",
    "buildNumber",
    "deploymentType",
    "displayUrl",
    "displayUrlServicedeskHelpCenter",
    "healthChecks",
    "scmInfo",
    "serverTime",
    "serverTimeZone",
    "serverTitle",
    "version",
    "versionNumbers"
})
@JsonTypeName("ServerInformation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServerInformation {

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
     * The display URL of the Jira instance.
     */
    @JsonProperty("displayUrl")
    protected String displayUrl;

    /**
     * The display URL of the Servicedesk Help Center.
     */
    @JsonProperty("displayUrlServicedeskHelpCenter")
    protected String displayUrlServicedeskHelpCenter;

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

    @JsonProperty("serverTimeZone")
    protected ServerInformationServerTimeZone serverTimeZone;

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

    /**
     * Constructs a validated instance of {@link ServerInformation}.
     *
     * @param spec the specification to process
     */
    public ServerInformation(Consumer<ServerInformation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServerInformation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServerInformation(Consumer)} instead.
     * @param baseUrl The base URL of the Jira instance.
     * @param buildDate The timestamp when the Jira version was built.
     * @param buildNumber The build number of the Jira version.
     * @param deploymentType The type of server deployment. This is always returned as *Cloud*.
     * @param displayUrl The display URL of the Jira instance.
     * @param displayUrlServicedeskHelpCenter The display URL of the Servicedesk Help Center.
     * @param healthChecks Jira instance health check results. Deprecated and no longer returned.
     * @param scmInfo The unique identifier of the Jira version.
     * @param serverTime The time in Jira when this request was responded to.
     * @param serverTimeZone serverTimeZone
     * @param serverTitle The name of the Jira instance.
     * @param version The version of Jira.
     * @param versionNumbers The major, minor, and revision version numbers of the Jira version.
     */
    @ApiStatus.Internal
    public ServerInformation(String baseUrl, OffsetDateTime buildDate, Integer buildNumber, String deploymentType, String displayUrl, String displayUrlServicedeskHelpCenter, List<HealthCheckResult> healthChecks, String scmInfo, OffsetDateTime serverTime, ServerInformationServerTimeZone serverTimeZone, String serverTitle, String version, List<Integer> versionNumbers) {
        this.baseUrl = baseUrl;
        this.buildDate = buildDate;
        this.buildNumber = buildNumber;
        this.deploymentType = deploymentType;
        this.displayUrl = displayUrl;
        this.displayUrlServicedeskHelpCenter = displayUrlServicedeskHelpCenter;
        this.healthChecks = healthChecks;
        this.scmInfo = scmInfo;
        this.serverTime = serverTime;
        this.serverTimeZone = serverTimeZone;
        this.serverTitle = serverTitle;
        this.version = version;
        this.versionNumbers = versionNumbers;
    }

}
