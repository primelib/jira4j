package io.github.primelib.jira4j.restv3.model;

import java.util.Map;
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
 * NotificationSchemeAndProjectMappingJsonBean
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
    "notificationSchemeId",
    "projectId"
})
@JsonTypeName("NotificationSchemeAndProjectMappingJsonBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSchemeAndProjectMappingJsonBean {

    @JsonProperty("notificationSchemeId")
    protected String notificationSchemeId;

    @JsonProperty("projectId")
    protected String projectId;

    /**
     * Constructs a validated instance of {@link NotificationSchemeAndProjectMappingJsonBean}.
     *
     * @param spec the specification to process
     */
    public NotificationSchemeAndProjectMappingJsonBean(Consumer<NotificationSchemeAndProjectMappingJsonBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link NotificationSchemeAndProjectMappingJsonBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #NotificationSchemeAndProjectMappingJsonBean(Consumer)} instead.
     * @param notificationSchemeId notificationSchemeId
     * @param projectId projectId
     */
    @ApiStatus.Internal
    public NotificationSchemeAndProjectMappingJsonBean(String notificationSchemeId, String projectId) {
        this.notificationSchemeId = notificationSchemeId;
        this.projectId = projectId;
    }

}
