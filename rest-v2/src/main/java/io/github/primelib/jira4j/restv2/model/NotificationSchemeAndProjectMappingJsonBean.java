package io.github.primelib.jira4j.restv2.model;

import java.util.Map;
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
 * NotificationSchemeAndProjectMappingJsonBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "notificationSchemeId",
    "projectId"
})
@JsonTypeName("NotificationSchemeAndProjectMappingJsonBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSchemeAndProjectMappingJsonBean {

    /**
     * Constructs a validated implementation of {@link NotificationSchemeAndProjectMappingJsonBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NotificationSchemeAndProjectMappingJsonBean(Consumer<NotificationSchemeAndProjectMappingJsonBean> spec) {
        spec.accept(this);
    }

    @JsonProperty("notificationSchemeId")
    protected String notificationSchemeId;

    @JsonProperty("projectId")
    protected String projectId;


}
