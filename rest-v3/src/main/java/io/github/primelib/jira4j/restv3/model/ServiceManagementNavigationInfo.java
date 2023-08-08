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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceManagementNavigationInfo
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
    "queueCategory",
    "queueId",
    "queueName"
})
@JsonTypeName("ServiceManagementNavigationInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceManagementNavigationInfo {

    @JsonProperty("queueCategory")
    protected String queueCategory;

    @JsonProperty("queueId")
    protected Long queueId;

    @JsonProperty("queueName")
    protected String queueName;

    /**
     * Constructs a validated instance of {@link ServiceManagementNavigationInfo}.
     *
     * @param spec the specification to process
     */
    public ServiceManagementNavigationInfo(Consumer<ServiceManagementNavigationInfo> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceManagementNavigationInfo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceManagementNavigationInfo(Consumer)} instead.
     * @param queueCategory queueCategory
     * @param queueId queueId
     * @param queueName queueName
     */
    @ApiStatus.Internal
    public ServiceManagementNavigationInfo(String queueCategory, Long queueId, String queueName) {
        this.queueCategory = queueCategory;
        this.queueId = queueId;
        this.queueName = queueName;
    }

}
