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
 * ServiceManagementNavigationInfo
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "queueCategory",
    "queueId",
    "queueName"
})
@JsonTypeName("ServiceManagementNavigationInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceManagementNavigationInfo {

    /**
     * Constructs a validated implementation of {@link ServiceManagementNavigationInfo}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceManagementNavigationInfo(Consumer<ServiceManagementNavigationInfo> spec) {
        spec.accept(this);
    }

    @JsonProperty("queueCategory")
    protected String queueCategory;

    @JsonProperty("queueId")
    protected Long queueId;

    @JsonProperty("queueName")
    protected String queueName;


}
