package io.github.primelib.jira4j.restv3.model;

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
 * HealthCheckResult
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "name",
    "passed"
})
@JsonTypeName("HealthCheckResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HealthCheckResult {

    /**
     * Constructs a validated implementation of {@link HealthCheckResult}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public HealthCheckResult(Consumer<HealthCheckResult> spec) {
        spec.accept(this);
    }

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


}
