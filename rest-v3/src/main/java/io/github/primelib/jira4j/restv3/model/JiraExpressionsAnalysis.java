package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JiraExpressionsAnalysis
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "results"
})
@JsonTypeName("JiraExpressionsAnalysis")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionsAnalysis {

    /**
     * Constructs a validated implementation of {@link JiraExpressionsAnalysis}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JiraExpressionsAnalysis(Consumer<JiraExpressionsAnalysis> spec) {
        spec.accept(this);
    }

    /**
     * The results of Jira expressions analysis.
     */
    @JsonProperty("results")
    protected List<JiraExpressionAnalysis> results = new ArrayList<>();


}
