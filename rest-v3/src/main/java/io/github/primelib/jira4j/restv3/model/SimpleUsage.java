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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SimpleUsage
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
    "issueTypeIds",
    "projectId"
})
@JsonTypeName("SimpleUsage")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SimpleUsage {

    /**
     * The issue type IDs for the usage.
     */
    @JsonProperty("issueTypeIds")
    protected List<String> issueTypeIds;

    /**
     * The project ID for the usage.
     */
    @JsonProperty("projectId")
    protected String projectId;

    /**
     * Constructs a validated instance of {@link SimpleUsage}.
     *
     * @param spec the specification to process
     */
    public SimpleUsage(Consumer<SimpleUsage> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SimpleUsage}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SimpleUsage(Consumer)} instead.
     * @param issueTypeIds The issue type IDs for the usage.
     * @param projectId The project ID for the usage.
     */
    @ApiStatus.Internal
    public SimpleUsage(List<String> issueTypeIds, String projectId) {
        this.issueTypeIds = issueTypeIds;
        this.projectId = projectId;
    }

}
