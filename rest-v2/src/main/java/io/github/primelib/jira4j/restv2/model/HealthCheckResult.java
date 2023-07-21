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
 * HealthCheckResult
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
    "description",
    "name",
    "passed"
})
@JsonTypeName("HealthCheckResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HealthCheckResult {

    /**
     * The description of the Jira health check item.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the Jira health check item.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Whether the Jira health check item passed or failed.
     */
    @JsonProperty("passed")
    protected Boolean passed;

    /**
     * Constructs a validated instance of {@link HealthCheckResult}.
     *
     * @param spec the specification to process
     */
    public HealthCheckResult(Consumer<HealthCheckResult> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link HealthCheckResult}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #HealthCheckResult(Consumer)} instead.
     * @param description The description of the Jira health check item.
     * @param name The name of the Jira health check item.
     * @param passed Whether the Jira health check item passed or failed.
     */
    @ApiStatus.Internal
    public HealthCheckResult(String description, String name, Boolean passed) {
        this.description = description;
        this.name = name;
        this.passed = passed;
    }

}
