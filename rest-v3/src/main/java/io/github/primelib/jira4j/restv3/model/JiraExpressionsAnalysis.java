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
 * JiraExpressionsAnalysis
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
    "results"
})
@JsonTypeName("JiraExpressionsAnalysis")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionsAnalysis {

    /**
     * The results of Jira expressions analysis.
     */
    @JsonProperty("results")
    protected List<JiraExpressionAnalysis> results;

    /**
     * Constructs a validated instance of {@link JiraExpressionsAnalysis}.
     *
     * @param spec the specification to process
     */
    public JiraExpressionsAnalysis(Consumer<JiraExpressionsAnalysis> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JiraExpressionsAnalysis}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JiraExpressionsAnalysis(Consumer)} instead.
     * @param results The results of Jira expressions analysis.
     */
    @ApiStatus.Internal
    public JiraExpressionsAnalysis(List<JiraExpressionAnalysis> results) {
        this.results = results;
    }

}
