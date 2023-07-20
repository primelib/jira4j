package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JiraExpressionForAnalysis
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "contextVariables",
    "expressions"
})
@JsonTypeName("JiraExpressionForAnalysis")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionForAnalysis {

    /**
     * Constructs a validated implementation of {@link JiraExpressionForAnalysis}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JiraExpressionForAnalysis(Consumer<JiraExpressionForAnalysis> spec) {
        spec.accept(this);
    }

    /**
     * Context variables and their types. The type checker assumes that [common context variables](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#context-variables), such as `issue` or `project`, are available in context and sets their type. Use this property to override the default types or provide details of new variables.
     */
    @JsonProperty("contextVariables")
    protected Map<String, String> contextVariables = new HashMap<>();

    /**
     * The list of Jira expressions to analyse.
     */
    @JsonProperty("expressions")
    protected List<String> expressions = new ArrayList<>();


}
