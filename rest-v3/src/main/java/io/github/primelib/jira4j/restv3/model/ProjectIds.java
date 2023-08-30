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
 * ProjectIds
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
    "projectIds"
})
@JsonTypeName("ProjectIds")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectIds {

    /**
     * The IDs of projects.
     */
    @JsonProperty("projectIds")
    protected List<String> projectIds;

    /**
     * Constructs a validated instance of {@link ProjectIds}.
     *
     * @param spec the specification to process
     */
    public ProjectIds(Consumer<ProjectIds> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectIds}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectIds(Consumer)} instead.
     * @param projectIds The IDs of projects.
     */
    @ApiStatus.Internal
    public ProjectIds(List<String> projectIds) {
        this.projectIds = projectIds;
    }

}
