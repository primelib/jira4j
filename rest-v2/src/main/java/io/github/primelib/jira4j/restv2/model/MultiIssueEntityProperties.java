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
 * MultiIssueEntityProperties
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
    "issues"
})
@JsonTypeName("MultiIssueEntityProperties")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MultiIssueEntityProperties {

    /**
     * A list of issue IDs and their respective properties.
     */
    @JsonProperty("issues")
    protected List<IssueEntityPropertiesForMultiUpdate> issues;

    /**
     * Constructs a validated instance of {@link MultiIssueEntityProperties}.
     *
     * @param spec the specification to process
     */
    public MultiIssueEntityProperties(Consumer<MultiIssueEntityProperties> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MultiIssueEntityProperties}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MultiIssueEntityProperties(Consumer)} instead.
     * @param issues A list of issue IDs and their respective properties.
     */
    @ApiStatus.Internal
    public MultiIssueEntityProperties(List<IssueEntityPropertiesForMultiUpdate> issues) {
        this.issues = issues;
    }

}
