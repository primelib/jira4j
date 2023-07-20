package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MultiIssueEntityProperties
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issues"
})
@JsonTypeName("MultiIssueEntityProperties")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MultiIssueEntityProperties {

    /**
     * Constructs a validated implementation of {@link MultiIssueEntityProperties}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MultiIssueEntityProperties(Consumer<MultiIssueEntityProperties> spec) {
        spec.accept(this);
    }

    /**
     * A list of issue IDs and their respective properties.
     */
    @JsonProperty("issues")
    protected List<IssueEntityPropertiesForMultiUpdate> issues;


}
