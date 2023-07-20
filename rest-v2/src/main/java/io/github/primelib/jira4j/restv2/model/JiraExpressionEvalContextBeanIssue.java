package io.github.primelib.jira4j.restv2.model;

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
 * JiraExpressionEvalContextBeanIssue
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "key"
})
@JsonTypeName("JiraExpressionEvalContextBean_issue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraExpressionEvalContextBeanIssue {

    /**
     * Constructs a validated implementation of {@link JiraExpressionEvalContextBeanIssue}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JiraExpressionEvalContextBeanIssue(Consumer<JiraExpressionEvalContextBeanIssue> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the referenced item.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The key of the referenced item.
     */
    @JsonProperty("key")
    protected String key;


}
