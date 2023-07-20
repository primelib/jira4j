package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JiraExpressionResult
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "meta",
    "value"
})
@JsonTypeName("JiraExpressionResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionResult {

    /**
     * Constructs a validated implementation of {@link JiraExpressionResult}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JiraExpressionResult(Consumer<JiraExpressionResult> spec) {
        spec.accept(this);
    }

    @JsonProperty("meta")
    protected JiraExpressionResultMeta meta;

    /**
     * The value of the evaluated expression. It may be a primitive JSON value or a Jira REST API object. (Some expressions do not produce any meaningful results—for example, an expression that returns a lambda function—if that's the case a simple string representation is returned. These string representations should not be relied upon and may change without notice.)
     */
    @JsonProperty("value")
    protected Object value = null;


}
