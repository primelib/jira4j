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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectIssueTypeMappings
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
    "mappings"
})
@JsonTypeName("ProjectIssueTypeMappings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectIssueTypeMappings {

    /**
     * The project and issue type mappings.
     */
    @JsonProperty("mappings")
    protected List<ProjectIssueTypeMapping> mappings;

    /**
     * Constructs a validated instance of {@link ProjectIssueTypeMappings}.
     *
     * @param spec the specification to process
     */
    public ProjectIssueTypeMappings(Consumer<ProjectIssueTypeMappings> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectIssueTypeMappings}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectIssueTypeMappings(Consumer)} instead.
     * @param mappings The project and issue type mappings.
     */
    @ApiStatus.Internal
    public ProjectIssueTypeMappings(List<ProjectIssueTypeMapping> mappings) {
        this.mappings = mappings;
    }

}
