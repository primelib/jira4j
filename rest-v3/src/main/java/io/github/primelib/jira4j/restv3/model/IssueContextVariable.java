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
 * IssueContextVariable
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "key",
    "type"
})
@JsonTypeName("IssueContextVariable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueContextVariable {

    /**
     * Constructs a validated implementation of {@link IssueContextVariable}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueContextVariable(Consumer<IssueContextVariable> spec) {
        spec.accept(this);
    }

    /**
     * The issue ID.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The issue key.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * Type of custom context variable.
     */
    @JsonProperty("type")
    protected String type;


}
