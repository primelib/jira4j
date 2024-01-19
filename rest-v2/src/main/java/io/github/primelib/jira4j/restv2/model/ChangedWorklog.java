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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChangedWorklog
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
    "properties",
    "updatedTime",
    "worklogId"
})
@JsonTypeName("ChangedWorklog")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangedWorklog {

    /**
     * Details of properties associated with the change.
     */
    @JsonProperty("properties")
    protected List<EntityProperty> properties;

    /**
     * The datetime of the change.
     */
    @JsonProperty("updatedTime")
    protected Long updatedTime;

    /**
     * The ID of the worklog.
     */
    @JsonProperty("worklogId")
    protected Long worklogId;

    /**
     * Constructs a validated instance of {@link ChangedWorklog}.
     *
     * @param spec the specification to process
     */
    public ChangedWorklog(Consumer<ChangedWorklog> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ChangedWorklog}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ChangedWorklog(Consumer)} instead.
     * @param properties Details of properties associated with the change.
     * @param updatedTime The datetime of the change.
     * @param worklogId The ID of the worklog.
     */
    @ApiStatus.Internal
    public ChangedWorklog(List<EntityProperty> properties, Long updatedTime, Long worklogId) {
        this.properties = properties;
        this.updatedTime = updatedTime;
        this.worklogId = worklogId;
    }

}
