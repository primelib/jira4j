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
 * ProjectIssueSecurityLevels
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
    "levels"
})
@JsonTypeName("ProjectIssueSecurityLevels")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectIssueSecurityLevels {

    /**
     * Issue level security items list.
     */
    @JsonProperty("levels")
    protected List<SecurityLevel> levels;

    /**
     * Constructs a validated instance of {@link ProjectIssueSecurityLevels}.
     *
     * @param spec the specification to process
     */
    public ProjectIssueSecurityLevels(Consumer<ProjectIssueSecurityLevels> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectIssueSecurityLevels}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectIssueSecurityLevels(Consumer)} instead.
     * @param levels Issue level security items list.
     */
    @ApiStatus.Internal
    public ProjectIssueSecurityLevels(List<SecurityLevel> levels) {
        this.levels = levels;
    }

}
